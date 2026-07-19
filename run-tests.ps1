param(
    [Parameter(ValueFromRemainingArguments = $true)]
    [string[]]$PlaywrightArgs
)

$ErrorActionPreference = 'Stop'

function Resolve-CommandPath {
    param([string]$CommandName, [string]$FallbackPath)

    $command = Get-Command $CommandName -ErrorAction SilentlyContinue
    if ($command) {
        return $command.Source
    }

    if (Test-Path $FallbackPath) {
        return $FallbackPath
    }

    throw "Unable to find $CommandName. Install Node.js and try again."
}

$nodePath = Resolve-CommandPath -CommandName 'node.exe' -FallbackPath 'C:\Program Files\nodejs\node.exe'
$npmPath = Resolve-CommandPath -CommandName 'npm.cmd' -FallbackPath 'C:\Program Files\nodejs\npm.cmd'

Push-Location $PSScriptRoot
try {
    & $npmPath exec playwright test @PlaywrightArgs
}
finally {
    Pop-Location
}

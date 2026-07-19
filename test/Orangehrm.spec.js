const { test , expect } = require('@playwright/test');

test('loginPage',async ({page})=>{
    await page.goto('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login');

    console.log('Page Title:', await page.title());
    console.log('Page URL:', page.url());   

    await expect(page).toHaveTitle('OrangeHRM');
    await expect(page).toHaveURL('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login');
    await page.locator('input[name="username"]').fill('Admin');
    await page.locator('input[name="password"]').fill('admin123');
    await page.locator('button[type="submit"]').click();

    await page.close();


})

    @Test
    public void new_task_sixth_test() {
        Login();
        NewProject();

        driver.findElement(By.cssSelector(".btn-primary")).click();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fields_168")));
        //name
        WebElement searchInput = driver.findElement(By.id("fields_168"));
        searchInput.sendKeys("vism00_task");

        //type
        driver.findElement(By.id("fields_167"));
        Select select = new Select(driver.findElement(By.id("fields_167")));
        select.selectByIndex(1);

        //status
        driver.findElement(By.id("fields_169"));
        select = new Select(driver.findElement(By.id("fields_169")));
        select.selectByIndex(0);

        //priority
        driver.findElement(By.id("fields_170"));
        select = new Select(driver.findElement(By.id("fields_170")));
        select.selectByIndex(2);

        //description
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        driver.findElement(By.tagName("body")).sendKeys("Description test");
        driver.findElement(By.className(".btn-primary-modal-action")).click();
        driver.switchTo().defaultContent();

    }

}

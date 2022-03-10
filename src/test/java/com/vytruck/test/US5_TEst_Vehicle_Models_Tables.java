package com.vytruck.test;

import com.vytruck.test.base.TestBase;
import com.vytruck.utils.BrowserUtils;
import com.vytruck.utils.ConfigurationReader;
import com.vytruck.utils.Driver;
import com.vytruck.utils.VyTrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class US5_TEst_Vehicle_Models_Tables {

    @Test
    public void testverify_columns_as_sales_manager() {
// login as sales manager
        VyTrackUtils.loginAsSalesManager();

        // go to fleet module
WebElement fleet=Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Fleet')])[1]"));
        Actions actions=new Actions(Driver.getDriver());

        actions.moveToElement(fleet).perform();

        BrowserUtils.sleep(2);



    }
}


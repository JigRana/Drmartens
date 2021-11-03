package com.DrMartens.componentHelper;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import java.io.File;
import java.io.IOException;





public class Screenshot {

    // ScreenShot.takeScreenShot(driver," Name (whatever you want to give)"
    public static void takeScreenShot(WebDriver driver, String screenShotName){
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source,new File("./Screenshots/"+ screenShotName+".png"));
        } catch (IOException e) {
            System.out.println("Exception While taking screenShot");
        }


    }




}

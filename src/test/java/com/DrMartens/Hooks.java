package com.DrMartens;

import com.DrMartens.componentHelper.Screenshot;
import com.DrMartens.drivermanger.DriverManger;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
    DriverManger driverManger=new DriverManger();
    @Before
    public void SetUp(){
        driverManger.OpenBrowser("chrome");
        driverManger.NavigateToURL("https://www.drmartens.com/uk/en_gb/");
        driverManger.MaxBrowser();
        driverManger.ImplicitliWait();

            }
    @After
    public void close(){


        //driverManger.Close();
            }

}

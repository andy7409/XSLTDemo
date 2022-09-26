package xsltreport;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;		
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;	
import org.testng.Assert;
import org.testng.Reporter;		

    		
public class Testing {		
						
	//aggiunto commento 
	    
	@Test			
    public void Login() 					
    {		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    		
    	//Launching the Site.		
        driver.get("http://demo.guru99.com/V4/");			
        
      //Verifying the manager home page		
       Assert.assertEquals(driver.getTitle(),"Guru99 Bank Home Page" );
                        		
        //Login to Guru99 		
        driver.findElement(By.name("uid")).sendKeys("mngr34926");							
        driver.findElement(By.name("password")).sendKeys("amUpenu");							
        driver.findElement(By.name("btnLogin")).click();					
       
        					
  
  	    //Verifying the title of the page 		
        //Assert.assertEquals(driver.getTitle(),"http://demo.guru99.com/V4/index.php" );					
       		
         			
        Alert alert=driver.switchTo().alert();			
        alert.accept();		
        //Verifying the title of the logout page		
        Assert.assertEquals(driver.getTitle(),"Guru99 Bank Home Page" );
        
        driver.quit();
	    Reporter.log("la finestra viene chiusa");
    }		
}	


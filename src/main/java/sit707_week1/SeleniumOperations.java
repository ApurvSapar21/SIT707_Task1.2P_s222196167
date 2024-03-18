package sit707_week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

public class SeleniumOperations {
    
    public static void sleep(int sec) {
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    
    public static void open_chrome_and_close() {
        System.setProperty("webdriver.chrome.driver", 
        		"C:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        
        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();
        
        System.out.println("Driver info: " + driver);
        
        sleep(50);
        
        driver.close();
        
    }
    
    public static void open_chrome_maximize_close() {
        System.setProperty("webdriver.chrome.driver", 
        		"C:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        
        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();
        
        System.out.println("Driver info: " + driver);
        
        sleep(50);
        
        driver.manage().window().maximize();
        
        sleep(50);
        
        driver.close(); 
    }

    
    public static void load_web_page_close() {
        System.setProperty("webdriver.chrome.driver", 
        		"C:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        
        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();
        
        System.out.println("Driver info: " + driver);
        
        sleep(50);
        
        driver.get("https://selenium.dev");
        
        sleep(50);
        
        driver.close(); 
    }
    
    public static void open_chrome_loadpage_resize_close() {
        System.out.println("Hello from s222196167, Apurv Sapar");
        
        System.setProperty("webdriver.chrome.driver", 
        		"C:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        
        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();
        
        System.out.println("Driver info: " + driver);
        
        sleep(20);
        
        driver.get("https://www.google.com");
        
        driver.manage().window().setSize(new Dimension(640, 480));
        sleep(20);
        
        driver.manage().window().setSize(new Dimension(1280, 960));
        sleep(20);
        
        driver.close();    
    }
}

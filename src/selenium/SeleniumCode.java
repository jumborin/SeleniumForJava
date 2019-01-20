package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCode {

	    public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "libs/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.co.jp/");

	        // タイトルを出力する。
	        System.out.println(driver.getTitle());

	        //URLを出力する
	        System.out.println(driver.getCurrentUrl());

	        //グーグルマップに遷移する
	        driver.get("https://www.google.co.jp/maps/");

	        //検索窓に入力する
	        driver.findElement(By.id("searchboxinput")).sendKeys("test");

	        //検索ボタンをクリックする。
	        driver.findElement(By.id("searchbox-searchbutton")).click();


	    }

	}
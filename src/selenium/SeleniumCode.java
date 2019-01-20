package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCode {
	private final static String CHROME_DRIVER_CLASS = "webdriver.chrome.driver";
	private final static String CHROME_DRIVER_PATH = "libs/chromedriver.exe";

	public static void main(String[] args) {
		//登録
		System.setProperty(CHROME_DRIVER_CLASS, CHROME_DRIVER_PATH);

		//インスタンス作成
		WebDriver driver = new ChromeDriver();

		//グーグルに遷移
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
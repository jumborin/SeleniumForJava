package test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import base.GoogleChromeSeleniumTestPageBase;
import base.IPageTest;

/**
 * Googlemapのテストクラス
 * @author jumborin
 *
 */
@DisplayName("GoogleChromeのSeleniumのページ単位テスト")
public class GoogleChromeSeleniumTestPage extends GoogleChromeSeleniumTestPageBase implements IPageTest{

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	public void setUp() throws Exception{
		super.setUp("https://www.google.co.jp/maps/");
	}

	/**
	 */
	@AfterEach
	public void tearDown() {
	}

	/**
	 * タイトル表示のテストメソッド
	 * @param title
	 */
	@Override
	@Test
	@DisplayName("タイトルが想定通りになっているかのテスト")
	public void testTitleTest() {
		assertEquals("Google マップ", super.driver.getTitle());
	}

	@Override
	@Test
	@DisplayName("URLが想定通りになっているかのテスト")
	public void testUrlTest() {
		assertEquals("https://www.google.co.jp/maps/", super.driver.getCurrentUrl());
	}

	@Override
	@Test
	@DisplayName("ヘッダーが想定通りになっているかのテスト")
	public void testFirstDisplayHeaderTest() {
		assertEquals("a", super.driver.findElement(By.id("searchboxinput")).getText());
	}

	@Override
	@Test
	@DisplayName("フッターが想定通りになっているかのテスト")
	public void testFirstDisplayFooterTest() {
		assertEquals("", super.driver.findElement(By.id("searchboxinput")).getText());
	}

	@Override
	@Test
	@DisplayName("コンテンツ部分の初期表示が想定通りになっているかのテスト")
	public void testFirstDisplayContentsTest() {
		assertEquals("", super.driver.findElement(By.id("searchboxinput")).getText());
	}

	@Override
	@Test
	@DisplayName("入力チェックが想定通りになっているかのテスト")
	public void testInputChectTest() {
		assertEquals("", super.driver.findElement(By.id("searchboxinput")).getText());
	}

	@Override
	@Test
	@DisplayName("正常登録時の処理が想定通りになっているかのテスト")
	public void testNormalSubmitTest() {
		assertEquals("", super.driver.findElement(By.id("searchboxinput")).getText());
	}
}
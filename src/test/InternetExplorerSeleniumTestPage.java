package test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import base.InternetExplorerSeleniumTestPageBase;

/**
 * Googlemapのテストクラス
 * @author jumborin
 *
 */
public class InternetExplorerSeleniumTestPage extends InternetExplorerSeleniumTestPageBase {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	public void setUp() throws Exception{
		super.setUp("http://localhost/");
	}

	/**
	 */
	@AfterAll
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
		assertEquals("localhost", super.driver.getTitle());
	}

	@Override
	@Test
	@DisplayName("URLが想定通りになっているかのテスト")
	public void testUrlTest() {
		assertEquals("http://localhost/", super.driver.getCurrentUrl());
	}

	@Override
	@Test
	@DisplayName("ヘッダーが想定通りになっているかのテスト")
	public void testFirstDisplayHeaderTest() {
		assertEquals("a", super.driver.findElement(By.id("t")).getText());
	}

	@Override
	@Test
	@DisplayName("フッターが想定通りになっているかのテスト")
	public void testFirstDisplayFooterTest() {
		assertEquals("", super.driver.findElement(By.id("t")).getText());
	}

	@Override
	@Test
	@DisplayName("コンテンツ部分の初期表示が想定通りになっているかのテスト")
	public void testFirstDisplayContentsTest() {
		assertEquals("", super.driver.findElement(By.id("t")).getText());
	}

	@Override
	@Test
	@DisplayName("入力チェックが想定通りになっているかのテスト")
	public void testInputChectTest() {
		assertEquals("", super.driver.findElement(By.id("t")).getText());
	}

	@Override
	@Test
	@DisplayName("正常登録時の処理が想定通りになっているかのテスト")
	public void testNormalSubmitTest() {
		assertEquals("", super.driver.findElement(By.id("t")).getText());
	}
}
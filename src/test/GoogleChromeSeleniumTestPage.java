/**
 *
 */
package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Googlemapのテストクラス
 * @author jumborin
 *
 */
public class GoogleChromeSeleniumTestPage extends GoogleChromeSeleniumTestPageBase {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception{
		super.setUp("https://www.google.co.jp/maps/");
	}

	/**
	 */
	@After
	public void tearDown() {
		super.tearDown();
	}

	/**
	 * タイトル表示のテストメソッド
	 * @param title
	 */
	@Override
	@Test
	public void testTitleTest() {
		assertEquals("Google マップ", super.driver.getTitle());
	}

	@Override
	@Test
	public void testUrlTest() {
		assertEquals("https://www.google.co.jp/maps/", super.driver.getCurrentUrl());
	}

	@Override
	@Test
	public void testFirstDisplayHeaderTest() {
		assertEquals("a", super.driver.findElement(By.id("searchboxinput")).getText());
	}

	@Override
	@Test
	public void testFirstDisplayFooterTest() {
		assertEquals("", super.driver.findElement(By.id("searchboxinput")).getText());
	}

	@Override
	@Test
	public void testFirstDisplayContentsTest() {
		assertEquals("", super.driver.findElement(By.id("searchboxinput")).getText());
	}

	@Override
	@Test
	public void testInputChectTest() {
		assertEquals("", super.driver.findElement(By.id("searchboxinput")).getText());
	}

	@Override
	@Test
	public void testNormalSubmitTest() {
		assertEquals("", super.driver.findElement(By.id("searchboxinput")).getText());
	}
}
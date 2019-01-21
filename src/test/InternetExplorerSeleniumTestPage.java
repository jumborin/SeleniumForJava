package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
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
		super.setUp("http://localhost/");
	}

	/**
	 */
	@After
	public void tearDown() {
	}

	/**
	 * タイトル表示のテストメソッド
	 * @param title
	 */
	@Override
	@Test
	public void testTitleTest() {
		assertEquals("localhost", super.driver.getTitle());
	}

	@Override
	@Test
	public void testUrlTest() {
		assertEquals("http://localhost/", super.driver.getCurrentUrl());
	}

	@Override
	@Test
	public void testFirstDisplayHeaderTest() {
		assertEquals("a", super.driver.findElement(By.id("t")).getText());
	}

	@Override
	@Test
	public void testFirstDisplayFooterTest() {
		assertEquals("", super.driver.findElement(By.id("t")).getText());
	}

	@Override
	@Test
	public void testFirstDisplayContentsTest() {
		assertEquals("", super.driver.findElement(By.id("t")).getText());
	}

	@Override
	@Test
	public void testInputChectTest() {
		assertEquals("", super.driver.findElement(By.id("t")).getText());
	}

	@Override
	@Test
	public void testNormalSubmitTest() {
		assertEquals("", super.driver.findElement(By.id("t")).getText());
	}
}
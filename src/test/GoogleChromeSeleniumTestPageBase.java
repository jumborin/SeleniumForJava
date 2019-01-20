package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * ページ単体テスト用のスーパークラス(JUnitでテストケース作成時の継承元クラスとすること)
 * @author jumborin
 *
 */
public abstract class GoogleChromeSeleniumTestPageBase extends SeleniumTestPageBase {

	/** GoogleChromeドライバーのクラス名 */
	private final String CHROME_DRIVER_CLASS = "webdriver.chrome.driver";

	/** GoogleChromeドライバーのファイルパス */
	private final String CHROME_DRIVER_PATH = "driver/chromedriver.exe";

	/** ブラウザを制御するWebDriverクラス */
	protected WebDriver driver = null;

	/**
	 * 指定ページへの遷移を行い、テストを実施する。
	 * @param url
	 */
	protected void setUp(String url) {
		//登録
		System.setProperty(CHROME_DRIVER_CLASS, CHROME_DRIVER_PATH);
		//インスタンス作成
		driver = new ChromeDriver();

		//引数の指定URLに遷移
		driver.get(url);
	}

	/**
	 * Webドライバを終了する
	 * @throws Exception
	 */
	protected void tearDown() {
		driver.close();
	}
}
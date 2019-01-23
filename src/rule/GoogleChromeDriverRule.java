package rule;

import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Seleniumのドライバーを管理するルールクラス
 *
 * @author jumborin
 */
public class GoogleChromeDriverRule extends ExternalResource {

	/** GoogleChromeドライバーのクラス名 */
	private final String CHROME_DRIVER_CLASS = "webdriver.chrome.driver";

	/** GoogleChromeドライバーのファイルパス */
	private final String CHROME_DRIVER_PATH = "driver/chromedriver.exe";

	/** Seleniumドライバー*/
	private WebDriver driver;

	/**
	 * 既に存在していればSeleniumドライバーを返却する
	 * @return Seleniumドライバー
	 */
	public WebDriver getDriver() {
		if (this.driver == null) {
			//登録
			System.setProperty(CHROME_DRIVER_CLASS, CHROME_DRIVER_PATH);
			this.driver = new ChromeDriver();
		}
		return this.driver;
	}

	/**
	 * 終了時の処理としてドライバーを破棄する。
	 */
	@Override
	protected void after() {
		this.driver.quit();
	}
}

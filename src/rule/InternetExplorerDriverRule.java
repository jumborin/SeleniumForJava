package rule;

import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Seleniumのドライバーを管理するルールクラス
 *
 * @author jumborin
 */
public class InternetExplorerDriverRule extends ExternalResource {

	/** GoogleChromeドライバーのクラス名 */
	private final String IE_DRIVER_CLASS = "webdriver.ie.driver";

	/** GoogleChromeドライバーのファイルパス */
	private final String IE_DRIVER_PATH = "driver/IEDriverServer.exe";

	/** Seleniumドライバー*/
	private WebDriver driver;

	/**
	 * 既に存在していればSeleniumドライバーを返却する
	 * @return Seleniumドライバー
	 */
	public WebDriver getDriver() {
		if (this.driver == null) {
			//登録
			System.setProperty(IE_DRIVER_CLASS, IE_DRIVER_PATH);
			this.driver = new InternetExplorerDriver();
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

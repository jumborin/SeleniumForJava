package base;

import org.junit.ClassRule;
import org.openqa.selenium.WebDriver;

/**
 * ページ単体テスト用のスーパークラス(JUnitでテストケース作成時の継承元クラスとすること)
 * @author jumborin
 *
 */
public abstract class GoogleChromeSeleniumTestPageBase extends SeleniumTestPageBase {

	/** クラスルール */
	@ClassRule
	public static GoogleChromeDriverRule gcdr = new GoogleChromeDriverRule();


	/** ブラウザを制御するWebDriverクラス */
	protected WebDriver driver = gcdr.getDriver();

	/**
	 * 指定ページへの遷移を行い、テストを実施する。
	 * @param url
	 */
	protected void setUp(String url) {
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
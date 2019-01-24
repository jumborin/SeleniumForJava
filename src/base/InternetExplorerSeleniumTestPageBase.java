package base;

import org.junit.ClassRule;
import org.openqa.selenium.WebDriver;

import rule.InternetExplorerDriverRule;

/**
 * ページ単体テスト用のスーパークラス(JUnitでテストケース作成時の継承元クラスとすること)
 * @author jumborin
 *
 */
public abstract class InternetExplorerSeleniumTestPageBase {

	/** クラスルール */
	@ClassRule
	public static InternetExplorerDriverRule iedr = new InternetExplorerDriverRule();

	/** ブラウザを制御するWebDriverクラス */
	protected WebDriver driver = iedr.getDriver();

	/**
	 * 指定ページへの遷移を行い、テストを実施する。
	 * @param url
	 */
	public void setUp(final String url) {
		//引数の指定URLに遷移
		driver.get(url);
	}

	/**
	 * Webドライバを終了する
	 * @throws Exception
	 */
	public void tearDown() {
		driver.close();
	}
}
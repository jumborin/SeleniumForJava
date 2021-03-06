package base;

import org.junit.jupiter.api.Test;

/**
 * ページ単体テスト用のスーパークラス(JUnitでテストケース作成時の継承元クラスとすること)
 * @author jumborin
 *
 */
public interface  IPageTest {

	/**
	 * タイトル表示のテストメソッド
	 * @param title
	 */
	@Test
	public abstract void testTitleTest();

	/**
	 * URLのテストメソッド
	 * @param url
	 */
	@Test
	public abstract void testUrlTest();

	/**
	 * ヘッダー初期表示内容のテストメソッド
	 */
	@Test
	public abstract void testFirstDisplayHeaderTest();

	/**
	 * フッター初期表示内容のテストメソッド
	 */
	@Test
	public abstract void testFirstDisplayFooterTest();

	/**
	 * メイン領域の初期表示内容のテストメソッド
	 */
	@Test
	public abstract void testFirstDisplayContentsTest();

	/**
	 * 入力チェックのテストメソッド
	 */
	@Test
	public abstract void testInputChectTest();

	/**
	 * 正常系登録ボタンのテストメソッド
	 */
	@Test
	public abstract void testNormalSubmitTest();
}

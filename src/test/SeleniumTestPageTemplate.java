package test;

import org.junit.Test;

/**
 * ページ単体テスト用のテンプレートクラス(JUnitでテストケース作成時のテスト対象クラスとすること)
 * @author jumborin
 *
 */
public abstract class SeleniumTestPageTemplate {
	/**
	 * タイトル表示のテストメソッド
	 * @param title
	 */
	@Test
	public abstract void titleTest();

	/**
	 * URLのテストメソッド
	 * @param url
	 */
	@Test
	public abstract void urlTest();

	/**
	 * ヘッダー初期表示内容のテストメソッド
	 */
	@Test
	public abstract void firstDisplayHeaderTest();

	/**
	 * フッター初期表示内容のテストメソッド
	 */
	@Test
	public abstract void firstDisplayFooterTest();

	/**
	 * メイン領域の初期表示内容のテストメソッド
	 */
	@Test
	public abstract void firstDisplayContentsTest();

	/**
	 * 入力チェックのテストメソッド
	 */
	@Test
	public abstract void inputChectTest();

	/**
	 * 正常系登録ボタンのテストメソッド
	 */
	@Test
	public abstract void normalSubmitTest();

}

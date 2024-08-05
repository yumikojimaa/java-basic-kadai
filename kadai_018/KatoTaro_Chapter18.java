package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {

	 // コンストラクタ
    public KatoTaro_Chapter18() {
        familyName = "加藤";
        address = "東京都中野区〇×";
    }

    // 名を設定するメソッド
    public void setGivenName() {
        givenName = "太郎";
    }

    @Override
    public void eachIntroduce() {
        System.out.println("私はJavaが得意です");
    }
}
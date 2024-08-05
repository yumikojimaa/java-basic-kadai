package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	// コンストラクタ
    public KatoIchiro_Chapter18() {
        familyName = "加藤";
        address = "東京都中野区〇×";
    }

    // 名を設定するメソッド
    public void setGivenName() {
        givenName = "一郎";
    }

    @Override
    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }
}
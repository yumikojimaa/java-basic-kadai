package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	 // コンストラクタ
    public KatoHanako_Chapter18() {
        familyName = "加藤";
        address = "東京都中野区〇×";
    }

    // 名を設定するメソッド
    public void setGivenName() {
        givenName = "花子";
    }

    @Override
    public void eachIntroduce() {
        System.out.println("趣味は読書です");
    }
}
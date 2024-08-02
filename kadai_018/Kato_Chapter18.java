package kadai_018;

public abstract class Kato_Chapter18 {
    public String familyName;
    public String givenName;
    public String address;

    // コンストラクタ: familyName と address を初期化
    public Kato_Chapter18(String familyName, String address) {
        this.familyName = familyName;
        this.address = address;
    }

    // 共通の紹介を出力するメソッド
    public void commonIntroduce() {
        System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("住所は" + address + "です");
    }

    // 抽象メソッド: 各クラスで具体的な紹介を出力する
    public abstract void eachIntroduce();

    // 紹介を実行するメソッド
    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }

    // 名をセットするメソッド
    public void setGivenName(String name) {
        this.givenName = name;
    }
}

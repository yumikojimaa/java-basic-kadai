package kadai_018;

public class KatoExec_Chapter18 {
    public static void main(String[] args) {
        // 住所を設定
        String address = "東京都中野区〇×";

        // 各家族メンバーのインスタンスを作成
        KatoTaro_Chapter18 taro = new KatoTaro_Chapter18(address);
        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18(address);
        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18(address);

        // 紹介を実行
        taro.execIntroduce();
        ichiro.execIntroduce();
        hanako.execIntroduce();
    }
}

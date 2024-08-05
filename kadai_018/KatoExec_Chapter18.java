package kadai_018;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
        // 各子クラスのインスタンスを作成
        KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();

        // 各子クラスのsetGivenNameメソッドを実行
        taro.setGivenName();
        ichiro.setGivenName();
        hanako.setGivenName();

        // 各子クラスのexecIntroduceメソッドを実行
        taro.execIntroduce();
        System.out.println(); // 各紹介の間に空行を追加
        ichiro.execIntroduce();
        System.out.println(); // 各紹介の間に空行を追加
        hanako.execIntroduce();
    }
}
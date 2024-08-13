package kadai_026;

public class JyankenExec_Chapter26 {
    public static void main(String[] args) {
        Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();
        
        // 自分のじゃんけんの手を取得
        String myChoice = jyanken.getMyChoice();
        
        // 対戦相手の手をランダムに取得
        String opponentChoice = jyanken.getRandom();
        
        // じゃんけんの結果を出力
        jyanken.playGame(myChoice, opponentChoice);
    }
}

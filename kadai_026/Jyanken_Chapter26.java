package kadai_026;


import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
    private static final HashMap<String, String> handMap = new HashMap<>();
    static {
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");
    }

    // 自分のジャンケンの手を入力するメソッド
    public String getMyChoice() {
        try (Scanner scanner = new Scanner(System.in)) {
			String choice;
			while (true) {
			    System.out.println("自分のじゃんけんの手を入力しましょう");
			    System.out.println("グーはrockのrを入力しましょう");
			    System.out.println("チョキはscissorsのsを入力しましょう");
			    System.out.println("パーはpaperのpを入力しましょう");
			    choice = scanner.nextLine().trim().toLowerCase();
			    if (handMap.containsKey(choice)) {
			        break;
			    } else {
			        System.out.println("無効な入力です。もう一度入力してください。");
			    }
			}
			return choice;
		}
    }

    // 対戦相手のジャンケンの手を乱数で選ぶメソッド
    public String getRandom() {
        int randomIndex = (int) Math.floor(Math.random() * 3);
        String[] choices = {"r", "s", "p"};
        return choices[randomIndex];
    }

    // じゃんけんを行うメソッド
    public void playGame(String myChoice, String opponentChoice) {
        System.out.println("自分の手は" + handMap.get(myChoice) + ", 対戦相手の手は" + handMap.get(opponentChoice));

        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです");
        } else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
                   (myChoice.equals("s") && opponentChoice.equals("p")) ||
                   (myChoice.equals("p") && opponentChoice.equals("r"))) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}

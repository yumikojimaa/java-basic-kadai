package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
    private HashMap<String, String> dictionary;

    // コンストラクタで辞書に英単語とその意味を追加
    public Dictionary_Chapter21() {
        dictionary = new HashMap<>();
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

 // 指定された単語を辞書で検索し、結果をコンソールに出力するメソッド
    public void searchAndPrint(String[] words) {
        for (String word : words) {
            if (dictionary.containsKey(word)) {
                System.out.println(word + "の意味は" + dictionary.get(word));
            } else {
                System.out.println(word + "は辞書に存在しません");
            }
        }
    }
}
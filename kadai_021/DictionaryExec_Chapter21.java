package kadai_021;

public class DictionaryExec_Chapter21 {
    
    public static void main(String[] args) {
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 調べる単語のリスト
        String[] words = { "apple", "banana", "grape", "orange" };

        // 単語の意味を調べて出力
        for (String word : words) {
            System.out.println(word + "の意味は" + dictionary.getMeaning(word));
        }
    }
}

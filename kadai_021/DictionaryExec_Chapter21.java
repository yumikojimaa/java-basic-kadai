package kadai_021;

public class DictionaryExec_Chapter21 {
    
    public static void main(String[] args) {
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 調べる単語のリスト
        String[] words = { "apple", "banana", "grape", "orange" };
        
        // 各英単語を検索し、結果をコンソールに出力
        dictionary.searchAndPrint(words);
    }
}
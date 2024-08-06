package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	private HashMap<String, String> dictionary;

    public Dictionary_Chapter21() {
        dictionary = new HashMap<>();
        initializeDictionary();
    }

    private void initializeDictionary() {
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

    public String getMeaning(String word) {
        return dictionary.getOrDefault(word, word + "は辞書に存在しません");
    }
}

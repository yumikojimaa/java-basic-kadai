package kadai_018;

//親クラス
public abstract class Kato_Chapter18 {
 public String familyName;
 public String givenName;
 public String address;

 // 共通の紹介を出力するメソッド
 public void commonIntroduce() {
     System.out.println("名前は" + familyName + givenName + "です");
     System.out.println("住所は" + address + "です");
 }

 // 個別の紹介を出力する抽象メソッド
 public abstract void eachIntroduce();

 // 紹介を実行するメソッド
 public void execIntroduce() {
     commonIntroduce();
     eachIntroduce();
 }
}
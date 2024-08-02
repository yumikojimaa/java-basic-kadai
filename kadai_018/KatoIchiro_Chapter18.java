package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

    public KatoIchiro_Chapter18(String address) {
        super("加藤", address);
        setGivenName("一郎");
    }


    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }


    public void setGivenName(String name) {
        this.givenName = name;
    }
}
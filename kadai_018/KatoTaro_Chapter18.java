package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {

    public KatoTaro_Chapter18(String address) {
        super("加藤", address);
        setGivenName("太郎");
    }

    public void eachIntroduce() {
        System.out.println("Javaが得意です");
    }

    public void setGivenName(String name) {
        this.givenName = name;
    }
}

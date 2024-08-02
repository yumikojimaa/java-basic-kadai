package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {

    public KatoHanako_Chapter18(String address) {
        super("加藤", address);
        setGivenName("花子");
    }


    public void eachIntroduce() {
        System.out.println("趣味は読書です");
    }


    public void setGivenName(String name) {
        this.givenName = name;
    }
}

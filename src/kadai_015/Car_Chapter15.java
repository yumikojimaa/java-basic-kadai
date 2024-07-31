package kadai_015;

public class Car_Chapter15 {
    // フィールド
    private int gear = 1;   // 初期ギアは1
    private int speed = 10; // 初期速度は10km/h

    // ギアチェンジメソッド
    public void gearChange(int afterGear) {
        int previousGear = this.gear; // 現在のギアを保存
        this.gear = afterGear;
        
        // ギアに応じた速度の設定
        switch (afterGear) {
            case 1:
                this.speed = 10;
                break;
            case 2:
                this.speed = 20;
                break;
            case 3:
                this.speed = 30;
                break;
            case 4:
                this.speed = 40;
                break;
            case 5:
                this.speed = 50;
                break;
            default:
                this.speed = 10;
                break;
        }

        // ギアチェンジのメッセージを表示
        System.out.println("ギア" + previousGear + "から" + afterGear + "に切り替えました");
    }

    // 走行メソッド
    public void run() {
        // 現在の速度を表示
        System.out.println("速度は時速" + this.speed + "kmです");
    }
}

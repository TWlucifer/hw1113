public class App3 {
    public static void main(String[] args) throws Exception {
        car car1;
        car1 = new car();

        car1.num=1234;
        car1.gas=20.5;

        car1.showCar();
    }
}

/**
 * car
 */
class car {
    int num;
    double gas;

    void show(){
        System.out.println("車號為"+num);
        System.out.println("油量是"+gas);
    }
    void showCar(){
        System.out.println("顯示車子資料");
        show();
        this.show();
    }
}
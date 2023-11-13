public class App10 {
    public static void main(String[] args) throws Exception {
        car car1;
        car1 = new car();
        
        car1.show();
    }
}

/**
 * car
 */
class car {
    private int num;
    private double gas;

    car(){
        num = 0;
        gas = 0.0;
        System.out.println("生產車子");
    }

    void show(){
        System.out.println("車號為"+num);
        System.out.println("汽油量為"+gas);
    }
}
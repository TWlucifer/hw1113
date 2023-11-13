public class App12 {
    public static void main(String[] args) throws Exception {
        car car1;
        car1 = new car();
        car1.show();

        car car2;
        car2 = new car(1234,20.5);
        car2.show();
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

    car(int n,double g){
        this();
        num = n;
        gas = g;
        System.out.println("生產車號為"+num+"汽油量為"+gas+"的車");
    }

    void show(){
        System.out.println("車號為"+num);
        System.out.println("汽油量為"+gas);
    }
}
public class App13 {
    public static void main(String[] args) throws Exception {
        car.showSum();  //直接叫class

        car car1;
        car1 = new car(4567,60.2);
        car1.show();

        car.showSum();

        car car2;
        car2 = new car(1234,20.5);
        car2.show();
    }
}

/**
 * car
 */
class car {
    static int sum = 0;

    private int num;
    private double gas;

    car(){
        num = 0;
        gas = 0.0;
        sum++;
        System.out.println("生產車子");
    }

    car(int n,double g){
        this();
        num = n;
        gas = g;
        System.out.println("生產車號為"+num+"汽油量為"+gas+"的車");
    }

    static void showSum(){
        System.out.println("車子總共有"+sum+"台");
    }

    void show(){
        System.out.println("車號為"+num);
        System.out.println("汽油量為"+gas);
    }
}
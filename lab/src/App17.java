public class App17 {
    public static void main(String[] args) throws Exception {
        
        System.out.println("宣告car1");
        car car1;
        car1 = new car();
        car1.setcar(1234,20.5);

        System.out.println("宣告car2");
        car car2;

        System.out.println("將car1指定給car2");
        car2 = car1;

        System.out.println("car1的");
        car1.show();

        System.out.println("car2的");
        car2.show();

        System.out.println("改變car1的資料");
        car1.setcar(4567,50.3);

        System.out.println("car1的");
        car1.show();

        System.out.println("car2的");
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

    void setcar(int n,double g){
        num = n;
        gas = g;
        System.out.println("生產車號為"+num+"汽油量為"+gas+"的車");
    }

    void show(){
        System.out.println("車號為"+num);
        System.out.println("汽油量為"+gas);
    }
}
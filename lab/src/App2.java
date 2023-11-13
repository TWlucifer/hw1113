public class App2 {
    public static void main(String[] args) throws Exception {
        car car1;
        car1 = new car();

        car1.num=1234;
        car1.gas=20.5;

        car1.show();
        car1.show2();
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
    void show2(){
        System.out.println("車號為"+this.num);
        System.out.println("油量是"+this.gas);
    }
}
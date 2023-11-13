public class App7 {
    public static void main(String[] args) throws Exception {
        car car1;
        car1 = new car();

        car1.num=1234;
        car1.gas=20;

        System.out.println("汽車號是"+car1.num);
        System.out.println("油量是"+car1.gas);
    }
}

/**
 * car
 */
class car {
    int num;
    double gas;
}
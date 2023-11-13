public class App4 {
    public static void main(String[] args) throws Exception {
        car car1;
        car1 = new car();

        car1.setNum(1234);;
        car1.setGas(20.5);;
    }
}

/**
 * car
 */
class car {
    int num;
    double gas;

    void setNum(int n){
        num = n;
        System.out.println("車號為"+num);
    }
    void setGas(double g){
        gas = g;
        System.out.println("汽油輛設為"+gas);
    }
}
public class App5 {
    public static void main(String[] args) throws Exception {
        car car1;
        car1 = new car();
        
        int num = 1234;
        double gas = 20.5;
        car1.setNumGas(num,gas);
    }
}

/**
 * car
 */
class car {
    int num;
    double gas;

    void setNumGas(int num,double gas){
        System.out.println("車號為"+num+"，汽油輛設為"+gas);
    }
}
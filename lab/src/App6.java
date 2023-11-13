public class App6 {
    public static void main(String[] args) throws Exception {
        car car1;
        car1 = new car();
        
        car1.setNumGas(1234,20.5);
        int number = car1.getNum();
        double gasoline = car1.getGas();

        System.out.println("調查得知");
        System.out.println("車號為"+number+"，汽油為"+gasoline);
    }
}

/**
 * car
 */
class car {
    int num;
    double gas;

    int getNum(){
        System.out.println("調查車號");
        return num;
    }

    double getGas(){
        System.out.println("調查油量");
        return gas;
    }
    void setNumGas(int n,double g){
        num = n;
        gas = g;
        System.out.println("車號為"+num+"，汽油輛設為"+gas);
    }
}
public class App8 {
    public static void main(String[] args) throws Exception {
        car car1;
        car1 = new car();
        
        car1.setNumGas(1234,20.5);

        car1.setNumGas(1234,-20.5);
        car1.show();
    }
}

/**
 * car
 */
class car {
    private int num;
    private double gas;

    
    public void setNumGas(int n,double g){
        if (g>0 && g<100) {
            num = n;
            gas = g;
            System.out.println("車號為"+num+"，汽油輛設為"+gas);
        }
        else System.out.println("invalid gas");
    }

    void show(){
        System.out.println("車號是"+this.num);
        System.out.println("汽油量是"+gas);
    }
}
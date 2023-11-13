public class App18 {
    public static void main(String[] args) throws Exception {
        
        car car1;
        car1 = new car();
        car1.show();

        int number = 1234;
        double gasoline = 20.5;
        String str = "1號車";
        
        car1.setcar(number, gasoline);
        car1.setname(str);

        car1.show();

    }
}

/**
 * car
 */
class car {

    private int num;
    private double gas;
    private String name;

    car(){
        num = 0;
        gas = 0.0;  
        name = "沒有名字";
        System.out.println("生產車子");
    }

    void setcar(int n,double g){
        num = n;
        gas = g;
        System.out.println("車號設為"+num+"汽油量設為"+gas);
    }
    void setname(String nm){
        name = nm;
        System.out.println("車名設為"+name);
    }
    void show(){
        System.out.println("車號為"+num);
        System.out.println("汽油量為"+gas);
        System.out.println("車名為"+name);
    }
}
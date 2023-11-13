public class App19 {
    public static void main(String[] args) throws Exception {
        
        car[] car1;
        car1 = new car[3];
        
        for(int i=0;i<car1.length;i++){
            car1[i]=new car();
        }

        car1[0].setcar(123, 20.5);
        car1[1].setcar(456, 30.5);
        car1[2].setcar(789, 50.5);

        for(int i=0;i<car1.length;i++){
            car1[i].show();
        }
        

    }
}

/**
 * car
 */
class car {

    int num;
    double gas;

    public car(){
        num = 0;
        gas = 0.0;  
        System.out.println("生產車子");
    }

    void setcar(int n,double g){
        num = n;
        gas = g;
        System.out.println("車號設為"+num+"汽油量設為"+gas);
    }

    void show(){
        System.out.println("車號為"+num);
        System.out.println("汽油量為"+gas);
    }
}
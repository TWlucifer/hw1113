public class App18 {
    public static void main(String[] args) throws Exception {
        
        car car1;
        car1 = new car();
        car1.show();

        int number = 1234;
        double gasoline = 20.5;
        String str = "1����";
        
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
        name = "�S���W�r";
        System.out.println("�Ͳ����l");
    }

    void setcar(int n,double g){
        num = n;
        gas = g;
        System.out.println("�����]��"+num+"�T�o�q�]��"+gas);
    }
    void setname(String nm){
        name = nm;
        System.out.println("���W�]��"+name);
    }
    void show(){
        System.out.println("������"+num);
        System.out.println("�T�o�q��"+gas);
        System.out.println("���W��"+name);
    }
}
public class App6 {
    public static void main(String[] args) throws Exception {
        car car1;
        car1 = new car();
        
        car1.setNumGas(1234,20.5);
        int number = car1.getNum();
        double gasoline = car1.getGas();

        System.out.println("�լd�o��");
        System.out.println("������"+number+"�A�T�o��"+gasoline);
    }
}

/**
 * car
 */
class car {
    int num;
    double gas;

    int getNum(){
        System.out.println("�լd����");
        return num;
    }

    double getGas(){
        System.out.println("�լd�o�q");
        return gas;
    }
    void setNumGas(int n,double g){
        num = n;
        gas = g;
        System.out.println("������"+num+"�A�T�o���]��"+gas);
    }
}
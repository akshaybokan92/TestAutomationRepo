package Statement;

public class IfStatement {

    public static void method1(){

        int x = 10;
        if (x==20){
            System.out.println("hello");
        }else {
            System.out.println("hi");
        }
    }
    public static void method2(){

        boolean b=true;
        if (b=false){
            System.out.println("hello");
        }else {
            System.out.println("hi");
        }
    }


    public static void main(String[] args) {
        IfStatement.method1();
        IfStatement.method2();
    }
}

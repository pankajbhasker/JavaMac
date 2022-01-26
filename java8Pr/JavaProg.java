interface InterfaceTest
{
    public void m2();
}
interface InterfaceTestT
{
    
    public int m1(int a);
}

class InterfaceImpl implements InterfaceTest{

    public void m2(){
        System.out.println("Hello m2");
    }
}

public class JavaProg{
    public static void main(String args[]){
        InterfaceImpl impl = new InterfaceImpl();
        impl.m2();

        InterfaceTest impl2 = new InterfaceImpl();
        impl2.m2();

        InterfaceTest impl3 = () -> System.out.println("Hello m3");
        impl3.m2();

        InterfaceTestT impl4 = (a) -> a * a;
        int i = impl4.m1(4);  
        System.out.println(" Square: " + i);

    }
}
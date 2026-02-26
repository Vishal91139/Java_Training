package Day_04.finalKeyword;

public class Example2 {
    {
        System.out.println("IIB - 2");
    }

    // if we dont initialize a final variable,
    // where is it initialized? = Constructor
    final int x;
    Example2(){
        x = 200;
    }

    public static void main(String[] args){
        // Object is mandatory for IIB output
    }

    // if we dont initialize a static final variable,
    // where is it initialized? = 
    static final int y;
    static {
        y = 100;
        System.out.println("hello vishal");
    }

    {
        System.out.println("IIB - 1");
    }
}

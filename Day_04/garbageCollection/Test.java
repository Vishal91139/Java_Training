package Day_04.garbageCollection;

public class Test {
    @Deprecated
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed!");
    }

    public static void main(String[] args){
        Test t = new Test();
        t = null;
        for(int i=1; i<100; i++){
            System.gc();
        }
    }
}

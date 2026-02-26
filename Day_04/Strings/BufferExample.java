package Day_04.Strings;

public class BufferExample {
    public void stringInsert(){
        StringBuffer buffer = new StringBuffer("JA");
        System.out.println("Old String: "+ buffer);
        buffer.insert(1,"AV");
        System.out.println("New String: "+ buffer);
    }
    public void StringAppend(){
        StringBuffer buffer = new StringBuffer("Vishal");
        System.out.println("Old String: "+ buffer);
        buffer.append(" Kumar");
        System.out.println("New String: "+ buffer);
    }
    public void stringReverse(){
        StringBuffer buffer = new StringBuffer("NOHTYP");
        System.out.println("Old String: "+ buffer);
        buffer.reverse();
        System.out.println("New String: "+ buffer);
    }

    public static void main(String[] args) {
        new BufferExample().StringAppend();
        new BufferExample().stringInsert();
        new BufferExample().stringReverse();
    }
}

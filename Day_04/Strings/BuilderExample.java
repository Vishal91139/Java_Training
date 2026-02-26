package Day_04.Strings;

public class BuilderExample {
    public void stringInsert(){
        StringBuffer builder = new StringBuffer("JA");
        System.out.println("Old String: "+ builder);
        builder.insert(1,"AV");
        System.out.println("New String: "+ builder);
    }
    public void StringAppend(){
        StringBuffer builder = new StringBuffer("Vishal");
        System.out.println("Old String: "+ builder);
        builder.append(" Kumar");
        System.out.println("New String: "+ builder);
    }
    public void stringReverse(){
        StringBuffer builder = new StringBuffer("NOHTYP");
        System.out.println("Old String: "+ builder);
        builder.reverse();
        System.out.println("New String: "+ builder);
    }

    public static void main(String[] args) {
        new BuilderExample().StringAppend();
        new BuilderExample().stringInsert();
        new BuilderExample().stringReverse();
    }
}


package DAY_08.dsa.collections;

public class Printer<T> {
    T data;
    Printer(T data){
        this.data = data;
    }
    void printValue(){
        System.out.println("Data: "+data);
    }
    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<Integer>(1);
        Printer<String> stringPrinter = new Printer<String>("Java");
        Printer<Boolean> booleanPrinter = new Printer<Boolean>(true);
        Printer<Float> floatPrinter = new Printer<Float>(1.2f);
        Printer<Double> doublePrinter = new Printer<Double>(1.32);
        integerPrinter.printValue();
        stringPrinter.printValue();
        booleanPrinter.printValue();
        floatPrinter.printValue();
        doublePrinter.printValue();
    }
}

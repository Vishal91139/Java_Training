package Day_04.Strings;

public class BufferBuilderPerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("JAVA");
        for(int i=0; i<100000; i++){
            buffer.append(" DSA");
        }
        System.out.println("BufferTime: "+(System.currentTimeMillis() - startTime)+"ms");
        
        startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<100000; i++){
            builder.append(" DSA");
        }
        System.out.println("BuilderTime: "+(System.currentTimeMillis() - startTime)+"ms");
    }
}

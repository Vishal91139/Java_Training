package Day_04.Strings;

public class Example {
    public static void main(String[] args){
        char[] letters = {'v','i','s','h','a','l'};
        // String name = letters.toString() //Wrapper class
        String name = new String(letters);
        System.out.println(name);

        String jumbled = "Vishal1is1From1Ise1B1section";
        String words[] = jumbled.split("1");
        System.out.println(words[5]);

        for(Object o : words){
            System.out.print(o+ " ");
        }

        System.out.println();

        String data = "   Vishal is   Student  ";
        System.out.println(data.trim());
    }
}

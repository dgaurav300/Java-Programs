public class WordCounter {
    /*
    COUNT WORD IN A STRING IN JAVA
    INPUT : HELLO
    OUTPUT :1
    INPUT : HELLO THIS IS A PERSON.
    OUTPUT:5
    INPUT : MY NAME IS GAURAV DIXIT.
    OUTPUT : 5 
     */
    public static void main(String[] args) {
        String input = "HELLO";
        int count = countWords(input);
        System.out.println("Number of words: " + count);
    }

    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.split("\\s+");
        return words.length;
    }
}
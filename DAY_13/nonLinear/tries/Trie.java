package DAY_13.nonLinear.tries;

import java.util.Arrays;
import java.util.List;

class TrieNode {
    TrieNode[] children;
    boolean wordEnd;
    TrieNode(){
        wordEnd = false;
        children = new TrieNode[26]; // alphabets a to z [26]
    }
}

public class Trie {
    // insert and search
    // aryan -> {a,r,y,a,n}
    static void insertWord(TrieNode root, String word){
        /*
        We will start with root and check if the node exists
        If exists, we will traverse via the node
        If not, we will create the node
        */
       TrieNode curr = root;
       for(char ch : word.toCharArray()){
            if(curr.children[ch - 'a']==null){
                // null means node is not present
                // so we create a node of that character
                curr.children[ch - 'a'] = new TrieNode();
            }
            // Move to the children node for the next character
            curr = curr.children[ch - 'a'];
       }
       curr.wordEnd = true; //we have inserted the word
    }

    static boolean searchWord(TrieNode root, String word){
        TrieNode curr = root;
        for(char ch : word.toCharArray()){
            if(curr.children[ch - 'a'] == null){
                // The first letter (node) doesnt exist
                // so the whole word is not present
                return false;
            }
            curr = curr.children[ch - 'a'];
        }
        return curr.wordEnd; // if true - exists or else false
    }

    static boolean startsWith(TrieNode root, String word){
        TrieNode curr = root;
        for(char ch : word.toCharArray()){
            if(curr.children[ch - 'a'] == null){
                // The first letter (node) doesnt exist
                // so the whole word is not present
                return false;
            }
            curr = curr.children[ch - 'a'];
        }
        return true;
    }

    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        List<String> inputWords = Arrays.
            asList("vishal", "yashas", "varadaraju",
                    "vijayalaxmi", "varshitha", "shreya");
        for(String word : inputWords){
            insertWord(root, word);
        }

        List<String> searchWords = Arrays.
            asList("vishal", "yashas", "varadaraju", "shashank","pranav",
                    "vijayalaxmi", "varshitha", "shreya", "trupthi", "rohini");
        for(String word : searchWords){
            if(searchWord(root, word)){
                System.out.println(word + " present in Trie");
            } else {
                System.out.println(word + " not present in Trie");
            }
        }

        System.out.println(startsWith(root, "vis"));
        System.out.println(startsWith(root, "vik"));
        System.out.println(startsWith(root, "son"));
    }
}



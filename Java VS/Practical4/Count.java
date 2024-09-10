package Practical4;
import java.util.Scanner;

public class Count {
    String checkVowelCons(char s){
        if (s >= 'a' && s <= 'z'){
            if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u'){
                return "Vowel";
            }
            else {
                return "Consonant";
            }
        }
        else {
            return "Special";
        }
    }

    void countVowelCons(String line, int len){
        String check;
        int v = 0, cons = 0;

        for (int i = 0; i < len; i++) {
            char c = line.charAt(i);
            check = checkVowelCons(c);

            if (check == "Vowel"){
                v += 1;
            }
            else if (check == "Consonant"){
                cons += 1;
            }
        }

        System.out.println("No of Vowels: " + v);
        System.out.println("No of Consonants: " + cons);
    }

    void countWord(String line, int len){
        int c = 1;
        char ch;

        for (int i = 0; i < len; i++) {
            ch = line.charAt(i);
            if (ch == ' ') {
                c += 1;
            }
        }
        System.out.println("No of Words: " + c);

    }
}

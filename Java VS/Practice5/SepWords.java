package Practice5;

public class SepWords {
    void sep(String line){
        String[] words = line.split(" ", 0);
        for(String word : words){
            System.out.println(word);
        }
    }
}

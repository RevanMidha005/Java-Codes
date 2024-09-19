package Practice5;

public class LinearSearch {
    int linearSearch(String line, String search){
        String[] words = line.split(" ", 0);

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(search)) {
                return i;
            }
        }
        return -1;
    }
}

package DataStructures.Strings.InterviewPrep;
import java.util.*;

public class CharFrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        //count character frequencies
        Map<Character, Integer> freqMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }
        System.out.println("Character Frequencies: ");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        sc.close();
    }
}

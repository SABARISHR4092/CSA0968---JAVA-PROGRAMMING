import java.util.*;
public class charfreq {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        HashMap<Character,Integer>freqmap = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            freqmap.put(c, freqmap.getOrDefault(c,0)+1);
        }
        System.out.println("Character frequemcies:");
        for(Map.Entry<Character,Integer>entry : freqmap.entrySet()){
            System.out.println("'" +entry.getKey() + "' : "+entry.getValue() );
        }
    }
}

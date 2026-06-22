import java.util.*;
public class ConsonantsandVowels {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Given word:");
        String str = sc.nextLine().toLowerCase();

        System.out.println("Consonants:");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(Character.isLetter(ch)){
                if(!(ch == 'a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')){
                    System.out.println(ch + " ");
                }
            }
        }
        System.out.println("nVowels:");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println(ch+" ");
            }
        }
    }
}

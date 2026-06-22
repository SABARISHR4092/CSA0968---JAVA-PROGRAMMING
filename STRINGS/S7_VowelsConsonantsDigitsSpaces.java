import java.util.*;

public class S7_VowelsConsonantsDigitsSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int vowels = 0, consonants = 0, digits = 0, spaces = 0, special = 0;
        for(char c:str.toCharArray()){
            char lower =Character.toLowerCase(c);
            if(lower == 'a'|| lower == 'e'|| lower == 'i' || lower == 'o'||lower == 'u' ){
                vowels++;
            }else if(Character.isLetter(c)){
                consonants++;
            }else if (Character.isDigit(c)){
                digits++;
            } else if (c == ' ') {
                spaces++;
            }else{
                special++;
            }
        }
        System.out.println("Vowels:"+vowels);
        System.out.println("Consonants:"+consonants);
        System.out.println("Digits:"+digits);
        System.out.println("Spaces:"+spaces);
        System.out.println("Special:"+special);
    }
}

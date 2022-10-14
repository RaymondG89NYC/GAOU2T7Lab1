import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("PLease enter a string:");
        String str1 = input.nextLine();
        int str1Length = str1.length();
        String str1First = str1.substring(0,(str1Length/2));
        String str1Second = str1.substring((str1Length/2));
        System.out.println("String length: " + str1Length);
        System.out.println("First half: " + str1First);
        System.out.println("Second half: " + str1Second);
        System.out.println("PLease enter another string:");
        String str2 = input.nextLine();
        int str2Length = str2.length();
        if(str1Length>str2Length){
            System.out.println(str1 + "is longer");
        }
        else if(str1Length<str2Length){
            System.out.println(str2 + "is longer");
        }
        else{
            System.out.println("Equal length");
        }

        if(str1.equals(str2)){
            System.out.println("Both strings have the exact same characters");
        }
        else if(str1.compareTo(str2)>0){
            System.out.println(str2 + " is first alphabetically");
        }
        else{
            System.out.println(str1 + " is first alphabetically");
        }

        if (str1.indexOf(str2) >= 0){
            System.out.println(str2 + " is found  in " + str1 + " at " + str1.indexOf(str2));
        }
        else{
            System.out.println(str2 + " is not in " + str1);
        }



    }
}

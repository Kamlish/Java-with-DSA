package JavaWithDSA.Strings4;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = in.nextLine();

        System.out.print("Last Name: ");
        String lastName = in.nextLine();

        // String is immutable

        //String Concatenation
        // +
        String fullName = firstName +" "+ lastName;

        System.out.println("FullName is: "+fullName);

        //String Length
        // length()

        System.out.println("String Length is: "+fullName.length());

        // String Char
        // CharsAt()

        for (int i=0; i<fullName.length();i++){
            System.out.print(fullName.charAt(i)+" ");
        }

        // String Compare
        // String copmare by charwise
        // compareTo
            // 1. s1 > s2 : +ve value
            // 2. s1 == s2 : 0
            // 3. s1 < s2 : -ve value

        if(firstName.compareTo(lastName) == 0){
            System.out.println("\nString equal");
        }
        else {
            System.out.println("Not equal");
        }

        // Substring
        // substring(begIndex, EndIndex)





    }
}

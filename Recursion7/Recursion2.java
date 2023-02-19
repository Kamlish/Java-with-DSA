package JavaWithDSA.Recursion7;

import java.util.HashSet;

public class Recursion2 {

    public static void towerOfHanoi(int n, String sourse,String helper, String dest){
        if(n==1){
            System.out.println("Transfer disk " + n + " from "+sourse+" to "+dest);
            return;
        }

//        O(n^2)
        towerOfHanoi(n-1, sourse,dest,helper);
        System.out.println("Transfer disk " + n + " from "+sourse+" to "+dest);
        towerOfHanoi(n-1,helper,sourse,dest);

    }


    public static void stringReverse(String str, int length){
        if (length==-1){
            return;
        }

        // Time Comp: O(n)
        System.out.print(str.charAt(length));
        stringReverse(str,length-1);
    }



    public static  int first = -1;
    public static int last = -1;
    public static void stringOccurance(String str, int index){
        if (index==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if (str.charAt(index)=='a'){
            if(first==-1){
                first = index;
            }
            else {
                last = index;
            }
        }
        // Time Comp: O(n)
        stringOccurance(str,index+1);
    }


    public static boolean arraySorted(int [] arr, int idx){

    if(idx == arr.length-1){
        return true;
    }

    if(arr[idx] < arr[idx+1]){
        return arraySorted(arr,idx+1);
    }
    else {
        return false;
    }
}


    public static void moveChar(String str, int idx,int count, String newStr){
        if(idx == str.length()){
            for (int i=0; i<count;i++){
                newStr +="x";
            }
            System.out.print(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveChar(str,idx+1,count,newStr);
        }
        else{
            newStr+=currChar;
            moveChar(str,idx+1,count,newStr);
        }

    }


    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str, int idx, String newStr){

        if(idx==str.length()){
            System.out.print(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar-'a']==true){
            removeDuplicates(str,idx+1,newStr);
        }
        else {
            newStr +=currChar;
            map[currChar-'a'] = true;
            removeDuplicates(str,idx+1,newStr);
        }
    }


    public static void subsequence(String str, int idx, String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        // Time Complex: O(2^n)
        char currChar = str.charAt(idx);
        //to be
        subsequence(str,idx+1,newStr+currChar);
        // not to be
        subsequence(str,idx+1,newStr);

    }


    public static void uniqueSubsequence(String str, int idx, String newStr, HashSet<String> set){
        if(idx==str.length()){
            if (set.contains(newStr)){
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        // Time Complex: O(2^n)
        char currChar = str.charAt(idx);
        //to be
        uniqueSubsequence(str,idx+1,newStr+currChar,set);
        // not to be
        uniqueSubsequence(str,idx+1,newStr,set);

    }


    public static String[] set= {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void keypadCombination(String str, int idx, String combination) {

        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = set[currChar-'0'];
        for (int i = 0; i < mapping.length(); i++) {
            keypadCombination(str, idx + 1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {

        // 1. Tower of Hanoi
//        int n = 1;
//        towerOfHanoi(n,"S","H","D");


        // 2. String Reverse

//        String str = "abcd";
//        int length = str.length();
//        stringReverse(str,length-1);

        // 3. String Occurance
//        String str = "abaacdaefaah";
//        stringOccurance(str,0);

        // 4. Array Sorted (Strictly increasing)

//        int [] arr = {1,2,3,4,4};
//        System.out.println(arraySorted(arr,0));

        // 5. Move all 'x' to the end of the String

//        String str = "axbcxxd";
//        moveChar(str,0,0,"");

         // 6. remove all duplicates in a string

//        String str = "abbccda";
//        removeDuplicates(str,0,"");

        // 7. Print all the subsequences of a string

//        String str = "abc";
//        subsequence(str,0,"");

        // 8. Unique Subsequences of a string

//        String str = "aaa";
//        HashSet<String> set = new HashSet<>();
//        uniqueSubsequence(str,0,"",set);

        // 9. Print keypad Combination

        String str = "66";
        keypadCombination(str, 0, "");


















    }
}

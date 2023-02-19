package JavaWithDSA.Recursion7;

public class Recursion3 {

    public static void permutations(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for (int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);

            permutations(newStr,permutation+currChar);
        }


        }

    public static int totalMazePaths(int n,int m,int i,int j){
        if(i==n && j==m){
            return 0;
        }
        if(i==n-1 || j==m-1){
            return 1;
        }

        int rightPaths = totalMazePaths(n,m,i,j+1);
        int downPaths = totalMazePaths(n,m,i+1,j);

        return rightPaths + downPaths;
    }

    public static int tilesPlace(int n, int m){

        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        int verticalPlace = tilesPlace(n-1,m);
        int horizontalPlace = tilesPlace(n-m,m);
        return verticalPlace + horizontalPlace;
    }

    public static int invitePeople(int n){
        if (n<=1){
            return 1;
        }

        int singleGuest = invitePeople(n-1);
        int pairGuest = (n-1)*invitePeople(n-2);

        return singleGuest+pairGuest;
    }


    public static void main(String[] args) {
        // 1. Print permutations of a String

//        String str = "abc";
//        permutations(str,"");


        // 2. count total paths in a maza to move from (0,0) to (m,n)

//        int m = 3, n = 3;
//        int pathsCount = totalMazePaths(n,m,0,0);
//        System.out.println(pathsCount);


        // 3. Place tiles of size 1xm in a floor of size nxm;
//        int n = 4, m = 2;
//        int placeCount= tilesPlace(n,m);
//        System.out.println(placeCount);


//        // 4. Invite people in a party, single or in pair
//        int n = 4;
//        int pairs= invitePeople(n);
//        System.out.println(pairs);


        // 5. Print all the subset of a set of first n natural numbers





    }
}

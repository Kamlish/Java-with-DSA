package JavaWithDSA.Strings4;

public class stringBuilders {
    public static void main(String[] args) {

    StringBuilder sb = new StringBuilder("Kamlish");
        System.out.println(sb);


        //1.  Set char at index
        // setCharAt(index,'char')

        sb.setCharAt(0,'p');
        System.out.println(sb);

        //2. Insert Char at index
        // insert(index,'char')

        sb.insert(4,'S');
        System.out.println(sb);

        // 3. Delete in string
        // .delete(index,end)
        sb.delete(4,5);
        sb.delete(0,1);
        System.out.println(sb);

        // 4. Append in same string

        sb.append(" ");
        sb.append('G');
        sb.append('o');
        System.out.println(sb);


        // Reverse a String
        StringBuilder n = new StringBuilder("Kamlish Goswami");

        for (int i=n.length(); i>0; i--){
            System.out.print(n.charAt(i-1));
        }

    }
}
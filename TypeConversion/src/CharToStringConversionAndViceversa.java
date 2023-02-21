import java.util.Arrays;

public class CharToStringConversionAndViceversa {
    public static void main(String args[]){

        //Convert a character to String

        char ch = 'c';
        String s1 = Character.toString(ch);
        // We can also use s1 = String.valueOf(ch);
        System.out.println(s1);

        //Convert char array to string

        char arr1[] = {'A', 'B', 'C'};
        String s2 = new String(arr1);
        System.out.println(s2);

        //Convert String to char array

        String s3 = "Ana are mere";
        char arr2[] = s3.toCharArray();
        System.out.println(arr2);
    }
}

public class CharToIntConversion {

    static void convert(char c){
        int a = c;
        //int a = Character.getNumericValue(c);
        //int a = Integer.parseInt(String.valueOf(c));
        System.out.println(a);
    }

    public static void main(String args[]){
        convert('A');
        convert('b');
    }
}

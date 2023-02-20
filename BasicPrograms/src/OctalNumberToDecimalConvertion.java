public class OctalNumberToDecimalConvertion {

    static void convert(String octal){
        int decimal = Integer.parseInt(octal,8);
        System.out.println(decimal);
    }

    public static void main(String args[]){
        convert("121");
        convert("64");
    }
}

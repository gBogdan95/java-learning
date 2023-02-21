public class CheckPositivityOfNumber {

    static void checkPositivity(int n){
        if(n >= 0)
            System.out.println("Number " + n + " is positive");
        else
            System.out.println("Number " + n + " is negatitive");
    }

    public static void main(String args[]){
        checkPositivity(5);
        checkPositivity(-3);
    }
}

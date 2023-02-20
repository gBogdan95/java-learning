public class CheckParity {

    static void parity(int n){
        if(n%2 == 0)
            System.out.println("Number " + n + " is even");
        else
            System.out.println("Number " + n + " is odd");
    }

    public static void main(String args[]){
        parity(5);
        parity(6);
    }
}

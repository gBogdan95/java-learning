public class CheckNumberSign {

    static void checkSign(int n){
        if(n>=0)
            System.out.println("Number " + n + " is positive");
        else
            System.out.println("Number " + n + " is negative");
    }

    public static void main(String args[]){
        checkSign(5);
        checkSign(-3);
    }
}

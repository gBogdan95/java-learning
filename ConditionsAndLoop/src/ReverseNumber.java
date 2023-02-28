public class ReverseNumber {

    //method using while loop:
    static void reverseWhile(int n){
        int initial = n;
        int figure;
        int reversed = 0;
        while(n > 0){
            figure = n % 10;
            reversed = reversed * 10 + figure;
            n = n / 10;
        }
        System.out.println("Reversed number of " + initial + " is: " + reversed);
    }

    //method using for loop:

    static void reverseFor(int n){
        int initial = n;
        int reversed = 0;
        for(; n>0; n=n/10){
            int figure = n % 10;
            reversed = reversed * 10 + figure;
        }
        System.out.println("Reversed number of " + initial + " is: " + reversed);
    }

    public static void main(String args[]){
        reverseWhile(12345);
        reverseWhile(58635329);
        reverseFor(123);
        reverseFor(789);
    }
}

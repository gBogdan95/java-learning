public class DisplayPrimeNumbers {

    static boolean isPrim(int n){
        boolean b1 = true;
        if(n < 2)
            b1 = false;
        for(int i=2; i<=n/2; i++){
            if(n%i == 0)
                b1 = false;
        }
        return b1;
    }

    static void firstPrimeNumbers(int n){
        System.out.println("The first " + n + " prime numbers are: ");
        int i=2;
        while(n>0){
            if (isPrim(i) == true){
                System.out.print(i + " ");
                n--;
            }
            i++;
        }
    }

    public static void main(String args[]){
        firstPrimeNumbers(100);
    }
}

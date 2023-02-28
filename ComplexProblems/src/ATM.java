//Program to get the least amount possible of bills from ATM (currency: RON)
public class ATM {

    static void getCash(int amount) {
        int bills[] = new int[]{500,200,100,50,20,10,5,1};
        int counter[] = new int[8];
        System.out.println("Cash printed:");

        for(int i=0; i<8; i++){
            if(amount >= bills[i]){
                counter[i] = amount / bills[i];
                amount = amount % bills[i];
            }
        }

        for(int i=0; i<8; i++){
            if(counter[i] != 0)
                System.out.println(counter[i] + " bills of " + bills[i] + " RON");
        }
    }

    public static void main(String args[]){
        getCash(2465);
        getCash(63259);
    }
}

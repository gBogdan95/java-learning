public class Add_Two_Integers {
    int sum;
    void add(int a,int b){
        sum = a + b;
        System.out.println(sum);
    }

    static void add2(int a, int b){
        int sum2;
        sum2 = a + b;
        System.out.println(sum2);
    }

    public static void main(String args[]){
        Add_Two_Integers a1 = new Add_Two_Integers();
        Add_Two_Integers a2 = new Add_Two_Integers();
        a1.add(10,20);
        a2.add(5,10);
        add2(100,100);
    }
}

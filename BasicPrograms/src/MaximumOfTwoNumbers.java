public class MaximumOfTwoNumbers {
    int max;

    void maximum(int a, int b){
        if(a>b)
            max = a;
        else
            max = b;
        System.out.println(max);
    }

    public static void main(String args[]){
        MaximumOfTwoNumbers a1 = new MaximumOfTwoNumbers();
        a1.maximum(10,20);
    }
}

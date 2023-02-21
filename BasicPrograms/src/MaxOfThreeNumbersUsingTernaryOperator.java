public class MaxOfThreeNumbersUsingTernaryOperator {

    static void maxOf(int a, int b, int c){
        int temp = a > b ? a : b;
        int result = temp > c ? temp : c;
        System.out.println(result);
    }

    public static void main(String args[]){
        maxOf(5,10,15);
    }
}

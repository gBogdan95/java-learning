public class FindSimpleInterest {

    static void simpleInterest(float p, float r, float t){
        float SI;
        SI = (p * r * t)/100;
        System.out.println(SI);
    }
    public static void main(String args[]){
        simpleInterest(1500,12,3);
    }
}

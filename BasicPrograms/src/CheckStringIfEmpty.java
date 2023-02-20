public class CheckStringIfEmpty {

        static void method (String s){
        if(s.length() == 0)
            System.out.println("String is empty");
        else
            System.out.println("String is not empty");
    }

    public static void main(String args[]){
            method("Ana are mere");
            method("");
    }
}

public class FindFrequencyOfCharacterInString {
    static void method(String s){
        int freq[] = new int[s.length()];
        char string[] = s.toCharArray();
        for(int i=0;i<s.length();i++){
            freq[i] = 1;
            for(int j=i+1;j<s.length();j++){
                if(string[i] == string[j]){
                    freq[i]++;

                    //Set string[j] = 0 to avoid printing visited characters
                    string[j]='0';
                }
            }
        }
        for(int i=0;i<freq.length;i++)
            if(string[i] != '0' && string[i] != ' ') // condition to avoid printing visited characters
            System.out.println(string[i] + "-" + freq[i]);
    }

    public static void main(String args[]){
        method("aa ba");
        method("Ana are mere");
    }
}

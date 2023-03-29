public class Twelve {
    public static void main(String[] args) {
        System.out.println(intToRoman(58));// MCMXCIV
    }

    public static String intToRoman(int num) {
        int [] intA = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String [] charA = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String res = "";
        for(int i = 0;i<intA.length;i++){
           int n = num/intA[i];
           for(int j=0;j<n;j++) res+=charA[i];
           num = num%intA[i];
        }
        return res;
    }
}

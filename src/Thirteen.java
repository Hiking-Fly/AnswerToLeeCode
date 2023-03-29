public class Thirteen {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        String roman = "IVXLCDM";
        int [] intA = {1,5,10,50,100,500,1000};
        int res = 0,pre = -1;
        for(int i=s.length()-1;i>=0;i--){
            int index = roman.indexOf(s.charAt(i));
            if(index>=pre){
                res+= intA[index];
            }else{
                res-= intA[index];
            }
            pre = index;
        }
        return res;
    }
}

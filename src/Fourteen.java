public class Fourteen {
    public static void main(String[] args) {
        String [] strs = {"dog","racecar","car"} ;
        System.out.printf(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String res = "";
        if(strs.length==0) return "";
        if(strs.length==1) return strs[0];
        String temp = strs[0];
        int breaksign = 0;
        for(int i=0;i<temp.length();i++){
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=temp.charAt(i)){
                    breaksign = 1;
                    break;
                }
            }
            if(breaksign == 1){
                break;
            }else{
                res += temp.charAt(i);
            }
        }
        return res;
    }
}

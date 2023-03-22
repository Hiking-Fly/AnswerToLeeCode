public class Five {
    // 最长回文串
    public static void main(String[] args) {
        System.out.print(testMethod("dadaba"));

    }

    public static String testMethod(String s) {
        if(s.isEmpty()) return ""; // daba
        int maxleft=0,maxright=0,len = s.length(),maxlen=1;
        for(int i=0;i<len-1;i++){
            int j;
            for(j=i;j>=0;j--){
                if(s.charAt(i)!=s.charAt(j))break;
            }
            int m;
            for(m=i;m<len;m++){
                if(s.charAt(i)!=s.charAt(m))break;
            }
            while(j>=0&&m<=len-1&&s.charAt(j)==s.charAt(m)){
                j--;
                m++;
            }
            int tempLen = m-j-1;
            if(tempLen>maxlen) {
                maxleft = j+1;
                maxright = m-1;
                maxlen= tempLen;
            }
        }
        return s.substring(maxleft,maxright+1);
    }
}

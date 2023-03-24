public class Eight {
    public static void main(String[] args) {
        System.out.println(myAtoi(""));
    }

    public static int myAtoi(String s) {
        // 字符串转整数
        // 去取首尾空白，从头开始读判断正负没有表示正，读到非数字字符停止，不是以数字开头则返回0
        /// 超过32位整数范围的固定到最大或者最小值,考虑以0开头的数字
        if(s.trim().isEmpty()) {
            return 0;
        }
        int sign = 0,start = 0;
        long result = 0;
        s = s.trim();
        char [] cs = new char[201];
        int index = cs.length-1;
        if(s.charAt(0)=='-'){
            sign = 1;
        }else if(s.charAt(0)=='+'){
            sign = 2;
        }else{
            sign = 3;
        }
        if(sign == 3){
            start = 0;
        }
        else {
            start = 1;
        }
        for(int i = start;i<s.length();i++){
            if(s.charAt(i)<='9'&& s.charAt(i)>='0'){
                cs[index--]=s.charAt(i);
            }else {
                break;
            }
        }
        for(int j= index+1,m=0;j<cs.length;j++){
            double ca = Math.pow(10,m);
            m++;
            result+= ca*(cs[j]-'0');
        }
        long maxInt = (long)Math.pow(2,31);
        if(sign==1){
            result = -result;
        }
        System.out.println(maxInt);
        if(result>maxInt-1){
            result = maxInt-1;
        }else if(result<-maxInt){
            result = -maxInt;
        }

        return (int)result;
    }
}

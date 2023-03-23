public class Seven {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        // 整数反转
        int sign = 1,index = 0;
        char [] c = new char[34];
        if(x<0){
            x= -x;
            sign = 0;
        }
        do{
            int tem = x%10;
            c[index++] = (char) tem;
            x= x/10;
        }while(x!=0);
        long result=0;
        for(int i=index-1,j=0;i>=0;i--){
            double si = Math.pow(10,j);
            result += c[i]*si;
            j++;
        }
        if(sign==0) {
            if(result>Math.pow(2,31)) result=0;
            else result = -result;
        }else {
            if(result>Math.pow(2,31)-1) result=0;
        }
        return (int)result;
    }
}

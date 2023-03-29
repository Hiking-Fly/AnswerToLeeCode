public class Nine {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1213));
    }

    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        boolean is = true;
        char cs [] = new char[34];
        int index = 0;
        do{
            int tem = x%10;
            cs[index++] = (char)tem;
            x= x/10;
        }while(x!=0);
        int mid = index/2;
        for(int i=0;i<mid;i++){
            int right = index-1-i;
            if(cs[i]!=cs[right]){
                is = false;
                break;
            }
        }
        return is;
    }
}

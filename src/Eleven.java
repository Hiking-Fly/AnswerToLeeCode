public class Eleven {
    public static void main(String[] args) {
        int [] a = {1,1};
        System.out.println(maxArea(a));
    }

    public static int maxArea(int[] height) {
        int res = 0;
        for(int i=0,j=height.length-1;i<j;){
            if(height[i]<height[j]){
                res = Math.max(res,(j-i)*height[i]);
                i++;
            }else{
                res = Math.max(res,(j-i)*height[j]);
                j--;
            }
        }
        return res;
    }
}

public class Six {
    public static void main(String[] args) {
        System.out.println(convert("AB",1));
    }

    public static String convert(String s, int numRows) {
        // s.len 1-1000   numRows 1-1000  N 型字
        int numColumn;
        if(numRows == 1){
            numColumn=s.length();
        } else {
            numColumn = (s.length()/(2*numRows-2) + 1)*(numRows-1);
        }
        char [][] cs = new char[numRows][numColumn];
        for(int len= 0,j=0;len<s.length();){
            for(int i=0;i<numRows&&len<s.length()&&j<cs[0].length;i++){
                cs[i][j]=s.charAt(len);
                len++;
            }
            j++;
            for(int n=1,i=numRows-2; n<=numRows-2 && len<s.length() && i>0 && j<numColumn;n++){
                cs[i][j] = s.charAt(len);
                len++;
                i--;
                j++;
            }
        }
        char [] sresult = new char[s.length()];
        int index = 0;
        for(int i= 0;i<numRows;i++){
            for(int j =0;j<cs[0].length;j++){
                if(cs[i][j]!=0){
                    sresult[index++]=cs[i][j];
                }
            }
        }
        return new String(sresult);
    }
}

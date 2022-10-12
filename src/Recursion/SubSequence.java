package Recursion;

public class SubSequence {
    public static void main(String[] args) {
        String str="abcd";
        getSubSequence(str,0,"");
    }
    public  static
    void getSubSequence(String str,int idx,String newStr){
        if (idx==str.length()){
//            if (newStr.contains("a")){
//                System.out.println(newStr);
//            }
            System.out.println(newStr);
            return;
        }

        getSubSequence(str,idx+1,newStr+str.charAt(idx));
        getSubSequence(str,idx+1,newStr);
    }
}

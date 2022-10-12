package Recursion;

public class PowerFinderLinear {
    public static void main(String[] args) {
        int x=2;
        int pow=1;
        int ans=findPower(x,pow);
        System.out.println(ans);
    }
    public static int findPower(int x,int pow){
        if(x==0) return 0;
        if (pow==0) return 1;
        return x*findPower(x,pow-1);
    }
}

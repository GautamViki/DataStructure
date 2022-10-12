package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n=3;
        towerHanoi(n,"Source","Helper","Destination");
    }
    public static void towerHanoi(int n, String sou, String help, String dest){
        if (n==1) {
            System.out.println(sou+" ====> "+dest);
            return;
        }
        towerHanoi(n-1,sou,dest,help);
        System.out.println(sou+" ====> "+dest);
        towerHanoi(n-1,help,sou,dest);
    }
}

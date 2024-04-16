import java.util.*;
public class Quesation5{
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        // transfered top n-1 from src to helper using dest as helper
        towerOfHanoi(n-1, src, helper, dest);
        // transfer to n from src to dest
        System.out.println("Transfer disk " + n + " from " +src + " to " + helper);
        // transfer n-1 from helper to dest using src helper
        towerOfHanoi(n-1, src, helper, dest);
    }
    public static void main(String args[]){
        int n = 4;
        towerOfHanoi(n, "A", "B", "C");
    }
}
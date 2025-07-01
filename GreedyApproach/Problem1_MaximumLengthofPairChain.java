package HackWithInfy.GreedyApproach;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1_MaximumLengthofPairChain{
     public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        Arrays.sort(pairs,(a,b)->{
            return a[1]-b[1];
        });
        int count = 1,i = 1,end = pairs[0][1];
        while(i<n){
            if(end<pairs[i][0]){
                count++;
                end = pairs[i][1];
            } 
            i++;
        }
        return count;
    } 
    public static void main(String[] args) {    
        Problem1_MaximumLengthofPairChain p = new Problem1_MaximumLengthofPairChain();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        System.out.println(p.findLongestChain(a));
    }
}
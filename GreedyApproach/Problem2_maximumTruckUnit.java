package HackWithInfy.GreedyApproach;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2_maximumTruckUnit {

      public int maximumUnits(int[][] boxTypes, int t) {
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        int i = 0;
        int ans = 0;
        while(t>0 && i<boxTypes.length && boxTypes[i][0]<=t){
            ans+= boxTypes[i][0]*boxTypes[i][1];
            t-=boxTypes[i][0];
            i++;
        }
        if(t>0 && i<boxTypes.length){
            ans+= Math.min(boxTypes[i][0],t)*boxTypes[i][1];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }    
        int t = sc.nextInt();
        System.out.println(new Problem2_maximumTruckUnit().maximumUnits(a, t));
    }
}

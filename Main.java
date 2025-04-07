
//sliding window technique practice problem 1 find the max sum of k size sub-array
import java.util.Scanner;
public class Main {

    public static int maxSum(int[]a,int k){

        int wSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i =0;i<k;i++){
            wSum +=a[i];
        }

        for(int i=k;i<a.length;i++){

            wSum = wSum -a[i-k]+a[i];
            maxSum = Math.max(maxSum,wSum);
        }
     return maxSum;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int k = sc.nextInt();

        int res = maxSum(a,k);

        System.out.println(res);
    }
}
package basic;

public class P15596re {
    long sum(int[] a) {
        long ans = 0;
        for(int i=0;i<a.length;i++) {
        	ans += a[i];
        }
        return ans;
    }
}
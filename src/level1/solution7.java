package level1;


// 내적 
public class solution7 {
	public static int main(int[] a, int[] b) {
        int answer = 0;
        for(int i=0 ; i< a.length ; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}

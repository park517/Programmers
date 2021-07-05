package level1;

// 약수의 갯수와 덧셈
public class solution11 {
	public static int main(int left, int right) {
        int answer = 0;
        // 약수의 갯수가 짝수라면 더하고 아니면 뺴기
        for(int i =left ; i<=right ; i++) {
            answer += (countDiv(i)) ? i : i*(-1);
        }
        return answer;
	}
	
	// 약수의 갯수가 짝수인지 홀수인지
    public static boolean countDiv(int num) {
        int count  = 0 ;
        
        for(int i=1 ; i<=num ; i++) {
            if(num %i == 0 ) count++;
        }
        return (count%2==0) ? true : false;
    }
}

package level1;

// 음양 더하기
public class solution9 {
	
	public static int main(int[] absolutes, boolean[] signs) {
		int answer = 0;
		
        for(int i=0 ; i < absolutes.length ; i++) {
        	// 양수면 그대로 더하고 음수면 *(-1) 하여 더한다.
        	answer = (signs[i] == true) ? answer+absolutes[i] : answer+absolutes[i] *(-1);
        }
		
		return answer;
	}
}

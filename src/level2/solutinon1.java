package level2;
import java.util.*;

// 짝지어 제거하기 - 2017 탑스타운
public class solutinon1 {
	public static int main(String s ) {
		
        int answer =-1;
        //스택 선언
		Stack<String> stack = new Stack<>();

		// 스택이 비어있다면 넣고 다음 번 떄 넣은거랑 비슷하면 넣은거 다시 빼기
		for(int i = 0 ; i<s.length() ; i++) {
			String currentVal = String.valueOf(s.charAt(i));
			
			if(stack.empty()) {
				stack.push(currentVal);
			}
			else {
				String inVal = stack.peek();
				if(inVal.equals(currentVal)) {
					stack.pop();
				}
				else {
					stack.push(currentVal);
				}
			}
		}
        if(stack.size() ==0) answer = 1;
        else answer = 0;
        
        return answer;
	}
}

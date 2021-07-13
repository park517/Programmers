package level1;
import java.util.*;
public class Solution18 {
// 카카오 2019 개발자 겨울 인턴쉽 - 크레인 인형뽑기 게임
	public static int main(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0 ; i < moves.length ; i++) {
            for(int j = 0 ; j < board.length ; j++) {
                int index = moves[i]-1;
                int currentVal = board[j][index];
                System.out.println(currentVal);
              // 뽑은 숫자가 0이 아닐떄만
                if(currentVal != 0) {
                    // 뽑힌 자리는 0으로 치환
                	board[j][index] =0;
                	// 만일 스택이 비어있다면 추가
                    if(stack.empty()) {
                        stack.push(currentVal);    
                    }
                    // 비어 있지 않다면
                    else {
                    	// 가장 상위의 숫자와 지금 넣어야할 숫자가 같다면 들어있는 숫자 빼내고 +2
                        int lastVal = stack.peek();
                        if(currentVal == lastVal) {
                            stack.pop();
                            answer += 2;
                        }
                        else {
                        // 숫자가 일치하지 않는다면 스택에 넣기 
                            stack.push(currentVal);
                        }
                    }
                    break;
                }
            }
        }
        
        
        return answer;
		
	}
	

}

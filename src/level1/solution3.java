

package level1;

import java.util.Arrays;


//문제 설명
//배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

public class solution3 {
	public int[] main(int[] array, int[][] commands) {
		
		// 정답 배열은 조건의 갯수만큼
        int[] answer = new int[commands.length];
       
        for(int i =0 ; i< commands.length ; i++) {
        	// 문자열 자르기 (array, a,b) -> array의 a인덱스부터 b-1 인덱스 까지의 값 복사 
        	// 
        	int[] sliceArray = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            
        	// 문자열 정렬
        	Arrays.sort(sliceArray);
        	
        	// 해당 인덱스 값 찾아서 넣기
            answer[i] = sliceArray[commands[i][2]-1];
            
   

        }
        return answer;
			
	}
	
	
}

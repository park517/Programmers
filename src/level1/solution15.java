package level1;
import java.util.*;
public class solution15 {
// 나누어 떨어지는 숫자 배열 divisor로 나누어지는 arr 요소로 배열 만들기
	public static int[] main(int[] arr, int divisor) {
		
		// 파라미터 배열 정렬
        Arrays.sort(arr);
        
        // ArrayList 생성
        List<Integer> numList = new ArrayList<>();
        
        // 나누어지면 ArrayList에 넣기
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] % divisor == 0) {
                numList.add(arr[i]);
            }
        }
        // 빈 리스트면 -1 
        if(numList.size() == 0 ) {
            numList.add(-1);
        }
        // 답 도출
        int[] answer = new int[numList.size()];
        for(int i = 0 ; i < numList.size() ; i++) {
            answer[i] = numList.get(i);
        }
        return answer;
	}

}

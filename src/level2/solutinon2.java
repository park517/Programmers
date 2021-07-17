package level2;
import java.util.*;

// 레벨 2 - 전화번호 목록
public class solutinon2 {
	
	// 통과한 답안
	
	public static boolean main(String[] phoneBook ) {
		boolean answer = true;
		
		// 핵심! 정렬을 통해서 2중 for문을 제거할 수 있다.
		Arrays.sort(phoneBook);
		
		for( int i = 0 ; i < phoneBook.length-1 ; i++)
			if(phoneBook[i+1].startsWith(phoneBook[i])) {
				return false;
			}

        return answer;
	}
	
	// 내가 생각 했던 답
	// 동작은 하지만 이번에 새로 추가된 효율성에서 걸린다.
	// 이중 For문을 안쓰는 것이 핵심
	// a.indexOf(b) b가 a시작부터 포함되는지 검사한다.
	// 비슷한걸로 a.startsWith(b)를 사용해도 된다.
	public boolean myAnswer(String[] phoneBook) {
		boolean answer = true;
		
		for(int i = 0 ; i < phoneBook.length ; i ++) {
			for(int j = 0 ; j < phoneBook.length ; j++) {
				if(i==j) continue;
				if(phoneBook[j].indexOf(phoneBook[i]) == 0 ) {
					return false;
				}
			}
		}
		return answer;
	}
}

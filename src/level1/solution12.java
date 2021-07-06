package level1;
import java.util.*;

// 3진법 뒤집기
public class solution12 {

	// 내 풀이
	public static int main(int n) {
		
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        // 나머지 list에 저장
        while( n > 0) {
            list.add(n%3);
            n/=3;
        }
        // 저장한 3의 0승은 따로 해주고
        answer += list.get(list.size()-1);
        
        // 3의 i승부터 차례대로 곱해줘서 더해주기
        for(int i = list.size()-2 ; i>=0 ; i--) {
           answer += list.get(i) * Math.pow(3,list.size()-1-i);
        }
        return answer;
	}
	
	// 다른 사람의 풀이 -> 코드는 간단하나 시간이 오래걸린다.
	public static int otherPeople(int n) {
		
        String a = "";
        // 나머지 문자열에 저장하기
        while(n > 0){
            a += n%3;
            n /= 3;
        }
        
        // parseInt(a,3) -> String a를 3진법에 맞춰 변환해준다.
        return Integer.parseInt(a,3);
    }
}



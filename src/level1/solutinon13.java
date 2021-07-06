package level1;
import java.util.*;

// 두개 뽑아서 더하기
public class solutinon13 {
	public static int[] main(int[] numbers) {
	
        List<Integer> list = new ArrayList<>();
        for(int i= 0 ; i<numbers.length-1 ; i++) {
            for(int j=i+1 ; j< numbers.length ; j++) {
                int sum = numbers[i]+numbers[j];
                if(!list.contains(sum)) {
                    list.add(sum);
                }
            }
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for(int i= 0 ; i < list.size() ; i++) {
                answer[i] = list.get(i);
        }
        
        return answer;
	}
}

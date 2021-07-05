package level1;

import java.util.Arrays;

// 예산
public class solution10 {
	public static int main(int[] d, int budget) {
        int answer =0;        
        
        // 정렬 
        Arrays.sort(d);
        
        
        // 사용 금액 만큼 예산에서 빼고 0미만이 되면 break;
        for(int i=0 ; i< d.length ; i++) {
	                    
	        budget -= d[i];
	        if(budget <0) break;
	        answer++;
	    
        }
	        return answer;
	}
}

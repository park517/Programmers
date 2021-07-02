package level1;

import java.util.ArrayList;
import java.util.List;

public class solution2 {
	
	public int main(int[] nums) {
	    int answer = 0;
	    
	    // 차례대로 하나씩 뽑아서 더해서 소수이면 답++
	    for(int i = 0 ; i<nums.length ; i++) {
	        for(int j = i+1 ; j<nums.length ; j++) {
	            for(int r = j+1 ; r<nums.length ; r++) {
	                    int sum = nums[i]+nums[j]+nums[r];
	                    if(isPrime(sum) == 1)
	                            answer++;
	                        
	                }
	                
	            }
	        }
	
	
	    return answer;
	}

	// 소수 판별
	public int isPrime(int num) {
	    int count = 0;
	    for(int i=1 ; i<=num ; i++) {
	        if(num%i ==0) count++;
	    }
	    if(count ==2)
	        return 1;
	    return 0;
	}

}

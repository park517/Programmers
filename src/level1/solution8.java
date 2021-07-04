package level1;

import java.util.*;
// 포켓몬 고르기


// 자료 순서가 상관없이 검색을 할떈 ArrayList 보단 Hash를 이용하자 
// ArrayList를 활용 할 때
public class solution8 {
	public static int main(int[] nums) {
        int answer = 0;
        List<Integer> form = new ArrayList<>();
        int max = nums.length/2;
        for(int i = 0; i < nums.length ; i++) { 
            if(!form.contains(nums[i])) {
                form.add(nums[i]);
            }    
        }
        if(form.size() >= max) {
            answer = max;
        }
        else if(form.size() < max) {
            answer = form.size();
        }
        return answer;
	}


// Hash를 사용 할 때
	public int hash(int[] nums) {
		int answer = 0;
		int max = nums.length/2;
		HashSet<Integer> list = new HashSet<>();
		for(int i :nums) {
			list.add(i);
		}
		answer = (list.size() < max) ? list.size() : max;
		return answer;
	}
}

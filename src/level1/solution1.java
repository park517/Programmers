package level1;

// 로또의 최고 순위와 최저 순위

public class solution1 {

	public int[] main(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        // 겹치는 숫자 카운트
        int eqNumCount =0;
        
        // 0의 갯수
        int zeroNumCount =0;
        
        // 최대값
        int max = 0;
        // 최소값
        int min = 0;
        
        // for문을 통해 배열에 같은 숫자가 있으면 eqNum++, 0이 있으면 zeroNum++;
        for(int i : lottos) {
            if(i==0) {
            	zeroNumCount++;
            }
            for(int j : win_nums) {
                if(i == j) {
                	eqNumCount++;
                    break;
                }

            }    
        }
        // 최대는 겹치는 숫자 + 0의 숫자만큼
        max = grade(eqNumCount+zeroNumCount);
        
        // 최소는 겹치는 숫자 만큼
        min = grade(eqNumCount);
        answer[0] =max;
        answer[1] =min;
        return answer;

	}
	
	
	// 맞힌 갯수 만큼의 등수 매기기
    public int grade(int num) {
        int result = 0;
        switch(num) {
            case 2 : result = 5;
                break;
            case 3 : result = 4;
                break;
            case 4 : result = 3;
                break;
            case 5 : result = 2;
                break;
            case 6 : result = 1;
                break;
            default : result = 6;
                break;
        } 
        return result;
    }

}

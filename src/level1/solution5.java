package level1;

import java.util.Arrays;

//완주하지 못한 선수

public class solution5 {
	public static String main(String[] participant, String[] completion) {
		
        String answer = "";
        
        // 한명만이 완주를 못했을 경우이니 두개 정렬을 해준다.
        Arrays.sort(participant);
        Arrays.sort(completion);

        int index;
        // 두개 리스트 비교해서 완주 못한 사람 찾기
        for (index=0; index<completion.length; index++) {
            if (!participant[index].equals(completion[index])) {
                answer = participant[index];
                break;
            }
        }
        
        // 완주 못한 사람이  참여자의 맨 뒤에 위치할때 대비해서 
        if (index == completion.length)
            answer = participant[index];

        return answer;
	}
}

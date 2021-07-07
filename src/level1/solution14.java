package level1;

public class solution14 {

	// 내 풀이 
	public static String main(String s) {
		
		// subString은 생각못하고 그저 한글자씩 뺄 생각했따..
        String answer = "";
        if(s.length() %2 ==0) {
            answer += Character.toString(s.charAt(s.length()/2-1));
            answer += Character.toString(s.charAt(s.length()/2));
        }
        else {
            answer = Character.toString(s.charAt(s.length()/2));
        }
        
        return answer;
		
	}
	
	// 프로그래머스 다른 사람의 풀이
    public static String getMiddle(String word){

    	// substring(a,b) index 번호로 a이상 b미만 자르기
        return word.substring((word.length()-1) / 2, word.length()/2 + 1);    
        
    }

}

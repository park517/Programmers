package level1;

import java.util.regex.Pattern;

// 신규 아이디 추천
class solution6 {
    public String solution(String new_id) {
        String answer = "";
        String id = new_id.toLowerCase(); // 소문자로 
		id = step2(id);
		id = step3(id);
		id = step4(id);
		id = step5(id);
		id = step6(id);
        id = step7(id);
	    answer= id;
        return answer;
	
    }
    public String step2(String str) {
    	
    	// ^ 이 아니면~ a-z : 소문자만 0-9 숫자만 -,_,. or 쓸 필요 없이 이어서 붙이면 된다.
    	String patternNum = "[^a-z0-9-_.]";
  
        str = str.replaceAll(patternNum, "");
        return str;
    }
    
    public String step3(String str) {
    	
    	// .이 {2,} -> 2번 이상 {2,3} 2번이상 3번 히아  {2} 정확히 2번 
    	String patternNum = "[.]{2,}";
  
        str = str.replaceAll(patternNum, ".");
        return str;
    }
    
    public String step4(String str) {
    	
    	// ^ 은 첫 문자를 뜻하구 $는 마지막 문자를 뜻한다. 
    	String patternNum = "^[.]|[.]$";
    	
    	str = str.replaceAll(patternNum, "");
    	return str;
    }
    
    public String step5(String str) {
    
    	// 만약 str이 빈 문자열이라면 a를 대입
    	if(str.equals("")) {
    		str+=str+"a";
    	}
    	
    	return str;
    }
    
    public String step6(String str) {
        
    	// 만약 str이 빈 문자열이라면 a를 대입
    	if(str.length() >=16) {
    		str = str.substring(0, 15);
    		str = str.replaceAll("[.]$", "");
    	}
    	
    	return str;
    }
    
    public String step7(String str) {
        
    	// 만약 str이 빈 문자열이라면 a를 대입
    	if(str.length() <=2) {
    		while(str.length()<3) {
    			str+=str.charAt(str.length() - 1);
    		}
    	}
    	
    	return str;
    }

    
}

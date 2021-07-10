package level1;

public class Solution17 {

	public static void main(int n, String s) {
		
		String answer = "";
		// 문자열 분리 부분
        char[] charList = new char[s.length()];
        for(int i = 0 ; i < charList.length ; i++) {
        	charList[i] = s.charAt(i);
        }
        // 문자 중 소문자, 대문자일대 나누어서 -26 
        for(int i = 0 ; i < charList.length ; i++) {
            if(charList[i] >='A' && charList[i] <='Z') {
                charList[i] = (char) (charList[i] + n);
                
                if(charList[i] >90) {
                    charList[i] = (char) (charList[i]-26);
                }
            }
            
            if(charList[i] >='a' && charList[i] <='z') {
            	charList[i] = (char) (charList[i] + n);
            	
            	if(charList[i] >122) {
            		charList[i] = (char) (charList[i]-26);
            	}
            }
        }
        for(char a : charList) {
        	answer += a;
        }
        System.out.println(answer);
	}
	
	public String othersAnswer(String s , int n) {
		
	    String result = "";
	    // a~z , A~Z 사이가 총 26개의 문자이므로 
	    n = n % 26;
	    for (int i = 0; i < s.length(); i++) {
	      char ch = s.charAt(i);
	      // 만약 해당 문자가 소문자 이면
	      if (Character.isLowerCase(ch)) {
	    	  //
	        ch = (char) ((ch - 'a' + n) % 26 + 'a');
	      } else if (Character.isUpperCase(ch)) {
	        ch = (char) ((ch - 'A' + n) % 26 + 'A');
	      }
	      result += ch;
	    }
	        return result;
	}
}

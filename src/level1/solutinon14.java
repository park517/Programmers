package level1;
import java.util.*;

// 숫자 문자열과 영단어 - 카카오 인턴십
public class solutinon14 {
	public static int main(String s ) {
	
        int answer = 0;
        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i = 0 ; i < num.length ; i++) {
            s= s.replaceAll(num[i],Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
	}
}

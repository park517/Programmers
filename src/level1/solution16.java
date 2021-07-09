package level1;

public class solution16 {

	public static void main(String[] args) {
		
		String a = "try hello world";
		String answer ="";
		
		int cnt = 0;
		String[] test = a.split("");

		for(int i = 0 ; i < test.length ; i++,cnt++) {
			if(test[i].equals(" ")) {
                cnt = (-1)*1;
            }
            if(cnt == 0 || cnt % 2 ==0) {
				test[i] = test[i].toUpperCase();
                
			}
			if(cnt % 2 == 1) {
				test[i] = test[i].toLowerCase();
			}
		}
		for(int i = 0 ; i < test.length ; i++) {
			answer += test[i];
		}
				
		System.out.println(answer);

	}

}

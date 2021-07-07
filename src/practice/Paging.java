package practice;

public class Paging {

	public static void main(String[] args) {
		
		int totalRecord = 90; // 총 레코드 수
		int pagePerRecord = 5; // 페이지에 보여줄 레코드 갯수
		int pagePerCount = 5; // 한번에 보여줄 페이지 갯수
		int currentPageNum = 7; // 현제 페이지
		int pageCount = (int)(Math.ceil((double)totalRecord/pagePerRecord));
	
		int startPageNum = 1+(currentPageNum-1)/pagePerCount*pagePerCount;
		
		int endPageNum =(int)(Math.ceil((double)currentPageNum/pagePerCount)) * pagePerCount; 
		if(endPageNum>=pageCount) endPageNum = pageCount;
		System.out.println("현재 페이지 넘버 : "+currentPageNum);
		System.out.println("시작 페이지 넘버 "+ startPageNum);
		System.out.println("끝 페이지 넘버 "+endPageNum);
		
		for(int i=startPageNum  ; i <=endPageNum ; i++) {
			System.out.print(i+" ");
		}

	}

}

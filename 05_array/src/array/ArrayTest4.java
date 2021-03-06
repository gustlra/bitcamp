package array;
/*
	주차장 관리 프로그램
	
	menu()
	**************
	   1. 입차            input()
	   2. 출차            output()
	   3. 리스트         list()
	   4. 종료
	**************
	  메뉴 : 
	
	1번인 경우
	위치 입력 : 3
	3위치에 입차 / 이미 주차되어있습니다
	
	2번인 경우
	위치 입력 : 4
	4위치에 출차 / 주차되어 있지않습니다
	
	3번인 경우
	1위치 : true
	2위치 : false
	3위치 : true
	4위치 : false
	5위치 : false
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest4 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {//throws IOException - 호출라인쪽에도 같이 걸어줘야됨
		
		//System.out.println("메뉴 ");
		boolean[] ar = new boolean[5];
		ArrayTest4 at = new ArrayTest4();
		at.menu(ar);
		//메뉴함수() 호출
		
//		ar.menu(ar);
//		int in = ar.input(ar);
//		int out = ar.input(ar);
//		int list = ar.list(ar);
		
		System.out.println("프로그램을 종료합니다.");
 
	}
	public void menu(boolean[] ar) throws IOException {
		int num;
		  
		while(true) {
			System.out.println();
			System.out.println("주차장 관리 프로그램");
			System.out.println("**************");	
			System.out.println("1. 입차            input()");
			System.out.println("2. 출차            output()");
			System.out.println("3. 리스트         list()");
			System.out.println("4. 종료");
			System.out.println("**************");
			System.out.print("번호 : ");
			num = Integer.parseInt(br.readLine());
			if(num==4) break;
			if(num<1 || num>4) {
				System.out.println("1~4번만 입력 가능");
				continue;
			}
			
			if(num==1) input(ar);
			else if(num==2) output(ar);
			else if(num==3) list(ar);
		}//while
	}
	private void list(boolean[] ar) {
		for(int i=0; i<ar.length; i++) {
			System.out.println((i+1)+"위치 :" +ar[i]);
		}
		// TODO Auto-generated method stub
		
	}
	private void input(boolean[] ar) throws IOException {
		System.out.println("위치 입력");
		int index = Integer.parseInt(br.readLine());//1
		
		if(ar[index-1]) {// boolean형 참or거짓을 가지고있음
			System.out.println("이미 주차되어 있습니다.");
		}else {
			ar[index-1] = true;
			System.out.println(index + "위치에 입차");
		}
		
	}
	private void output(boolean[] ar) throws IOException{
		System.out.println("위치 입력 : ");
		int index = Integer.parseInt(br.readLine());
		
		if(ar[index-1]) {
			ar[index-1] = false;
			System.out.println(index + "위치에 출차");
		}else {
			System.out.println("주차되어 있지않습니다.");
		}
	}

}

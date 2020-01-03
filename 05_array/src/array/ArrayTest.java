package array;

public class ArrayTest {
//	int a=3;
//	int b;
//	b=3; -x
	public static void main(String[] args) {
		//공간을 잡아줌
		//배열명 
		//클래스@16진수
		int[] ar;
		ar = new int[5];
		 
		ar[0]=25;
		ar[1]=36;
		ar[2]=47;
		ar[3]=55;
		ar[4]=60;
		
		System.out.println("배열명 ar = "+ar);//toString 생략
		System.out.println("배열명 ar = "+ar.toString());
		System.out.println("배열크기 = "+ar.length);
		
		for(int i=0; i<ar.length; i++) {
			System.out.println("ar["+i+"]= " +ar[i]);
		}
		System.out.println();
		
		System.out.println("꺼꾸로 출력");
		for(int i=4; i<ar.length-1; i--) {
			System.out.println("ar["+i+"]=" +ar[i]);
		}
		System.out.println();
		System.out.println("홀수데이터만 출력");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2==1)
			System.out.println("ar["+i+"]= " +ar[i]);
		}
		System.out.println();
		
		System.out.println("확장 for");
		for(??? : ar) {//ar의 크기만큼 반복하면서 데이트럴 꺼낸다
			
		}
	}
		
	
}

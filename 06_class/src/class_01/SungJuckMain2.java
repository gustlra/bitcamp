package class_01;

public class SungJuckMain2 {

	public static void main(String[] args) {
		SungJuk[] ar = new SungJuk[3];//객체 배열
		ar[0] = new SungJuk();
		ar[1] = new SungJuk();
		ar[2] = new SungJuk();
		
		ar[0].setName("홍길동");
		ar[0].setKor(90);
		ar[0].setEng(91);
		ar[0].setMath(100);
		
		ar[1].setName("또치");
		ar[1].setKor(85);
		ar[1].setEng(78);
		ar[1].setMath(82);
		
		ar[2].setName("코난");
		ar[2].setKor(75);
		ar[2].setEng(98);
		ar[2].setMath(86);
		
		
		for(SungJuk data : ar) {
			data.calc();
			System.out.println();
			System.out.println(data.getName()+"\t"+data.getKor()+"\t"+data.getEng()+"\t"+data.getMath()+"\t"+data.getTot());
		}
	}

}

package class_01;

public class SungJukMain1 {

	public static void main(String[] args) {
		SungJuk aa = new SungJuk();
		aa.setName("ȫ�浿");
		aa.setKor(90);
		aa.setEng(91);
		aa.setMath(100);
		aa.calc();
		//aa.calc();//����, ��� ���
		System.out.println(aa.getName()+"\t"+aa.getKor()+"\t"+aa.getEng()+"\t"+aa.getMath()+"\t"+aa.getTot()+"\t"+aa.getAvg()+"\t"+aa.getGrade());
		
		
		SungJuk bb = new SungJuk();
		bb.setName("ȫ�浿");
		bb.setKor(90);
		bb.setEng(91);
		bb.setMath(100);
		bb.calc();
		//aa.calc();//����, ��� ���		
		System.out.println(bb.getName()+"\t"+bb.getKor()+"\t"+bb.getEng()+"\t"+bb.getMath()+"\t"+bb.getTot()+"\t"+bb.getAvg()+"\t"+bb.getGrade());
		
		
		
		SungJuk cc = new SungJuk();
		cc.setName("ȫ�浿");
		cc.setKor(90);
		cc.setEng(91);
		cc.setMath(100);
		cc.calc();
		//aa.calc();//����, ��� ���		
		System.out.println(cc.getName()+"\t"+cc.getKor()+"\t"+cc.getEng()+"\t"+cc.getMath()+"\t"+cc.getTot()+"\t"+cc.getAvg()+"\t"+cc.getGrade());
	}
	

}

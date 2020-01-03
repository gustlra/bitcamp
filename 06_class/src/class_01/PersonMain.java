package class_01;

class Person{
	private String name;
	private int age;
	
	//set***(받는쪽)
	//get*** - boolean is***//보내는쪽
	
	public void setName(String n) {//구현
		name = n;
	}
	public void setAge(int a) {
		age = a;
	}
	public void setData(String n, int a) {
		name = n;
		age = a;		
	}
	public void setData() {
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}

public class PersonMain {

	public static void main(String[] args) {
		Person aa = new Person();
		System.out.println(aa);
		//aa = new Person();
		aa.setName("홍길동");//호출
		aa.setAge(25);
		System.out.println("이름="+aa.getName()+"\t 나이="+aa.getAge());
		
		Person bb = new Person();
		System.out.println(bb);
		bb.setName("코난");
		bb.setAge(16);
		System.out.println("이름="+bb.getName()+"\t 나이="+bb.getAge());
		System.out.println();
		
		Person cc = new Person();
		cc.setData("또치", 30);
		System.out.println(cc);
		System.out.println("이름="+cc.getName()+"\t 나이="+cc.getAge());
		System.out.println();
		
		Person dd = new Person();
		dd.setData();
		System.out.println(cc);
		System.out.println("이름="+dd.getName()+"\t 나이="+dd.getAge());
		System.out.println();
	

	}

}
/*
	int aa;		정수형 변수
	double aa;	실수형 변수
	char aa;	문자형 변수
	
	Person aa;
*/
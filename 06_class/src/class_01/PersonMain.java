package class_01;

class Person{
	private String name;
	private int age;
	
	//set***(�޴���)
	//get*** - boolean is***//��������
	
	public void setName(String n) {//����
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
		aa.setName("ȫ�浿");//ȣ��
		aa.setAge(25);
		System.out.println("�̸�="+aa.getName()+"\t ����="+aa.getAge());
		
		Person bb = new Person();
		System.out.println(bb);
		bb.setName("�ڳ�");
		bb.setAge(16);
		System.out.println("�̸�="+bb.getName()+"\t ����="+bb.getAge());
		System.out.println();
		
		Person cc = new Person();
		cc.setData("��ġ", 30);
		System.out.println(cc);
		System.out.println("�̸�="+cc.getName()+"\t ����="+cc.getAge());
		System.out.println();
		
		Person dd = new Person();
		dd.setData();
		System.out.println(cc);
		System.out.println("�̸�="+dd.getName()+"\t ����="+dd.getAge());
		System.out.println();
	

	}

}
/*
	int aa;		������ ����
	double aa;	�Ǽ��� ����
	char aa;	������ ����
	
	Person aa;
*/
package class_01;

class This {
	
private String name;
private int age;

	public void setName(String n) {
		name = n;
	}
	public void setAge(int a) {
		age = a;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
}

}

public class ThisTest {
	

	public static void main(String[] args) {
		This tt = new This();
		
		tt.setName("ȫ�浿");
		tt.setAge(25);
		
		
		System.out.println("�̸�=+"+tt.getName()+"\t"+"����="+tt.getAge());
		
	}

}

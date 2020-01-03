package exam;

class ComputeExam {
	public static void main(String[] args) {
		System.out.println("백의 자리 = " + (576/100)); //5
		System.out.println("십의 자리 = " + (576%100)/10); //7
		System.out.println("십의 자리 = " + (576%100)%10); //6

	}
}
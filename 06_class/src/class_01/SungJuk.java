package class_01;

public class SungJuk {
	
	private String name;
	private int kor,eng,math,tot;
	private double avg;
	private char grade;
	
	public void setName(String n) {
		name = n;
	}
	public void setKor(int k) {
		kor = k;
	}
	public void setEng(int e) {
		eng = e;
	}
	public void setMath(int m) {
		math = m;
	}
	public void setTot(int t) {
		tot = t;
	}
	public void setAvg(double a) {
		avg = a;
	}
	public void setGrade(char g) {
		grade = g;
	}
	
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getTot() {
		return tot;
	}
	public double getAvg() {
		return avg;
	}
	public char getGrade() {
		return grade;
	}
	public void calc() {
		tot = kor+eng+math;
		avg = (double)tot/3;
		
	}
	
	
	

}

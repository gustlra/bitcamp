package class_02;

public class Fruit {
	private String pum;
	private int jan, feb, mar, tot;
	private static int sumJan,sumFeb,sumMar;
	
	public Fruit(String pum,int jan,int feb,int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
	}

	public Fruit() {
		
	}

	public Fruit(String string) {
		// TODO Auto-generated constructor stub
	}
	public void calc() {
		tot = jan+feb+mar;
		
		sumJan = sumJan+jan;
		sumFeb = sumFeb+feb;
		sumMar = sumMar+mar;
	}
	
	public void disp() {
		System.out.println(pum+"\t"+jan+"\t"+feb+"\t"+mar+"\t"+mar);
	}
	public static void output() {
		System.out.println(sumJan+"\t"+sumFeb+"\t"+sumMar);
	}
	 
	public String getPum() {
		return pum;
	}

	public int getJan() {
		return jan;
	}

	public int getFeb() {
		return feb;
	}

	public int getMar() {
		return mar;
	}

	public int getTot() {
		return tot;
	}

	public int getSumJan() {
		return sumJan;
	}

	public int getSumFeb() {
		return sumFeb;
	}

	public int getSumMar() {
		return sumMar;
	}
	
}

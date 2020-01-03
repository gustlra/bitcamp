package class_02;

public class FruitMain {

	public static void main(String[] args) {
		/*
			Fruit aa = new Fruit("���",100,80,75);
			Fruit bb = new Fruit("����",30,25,10);
			Fruit cc = new Fruit("����",25,30,90);
		 */
		Fruit[] ar = {new Fruit("���",100,80,75), 
					new Fruit("����",30,25,10) ,
					new Fruit("����",25,30,90)};
		
		System.out.println("n------------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("------------------------------------");
		for(Fruit data : ar) {
			data.calc();
			data.disp();
			
		}
		System.out.println("------------------------------");
		Fruit.output();

	}

}

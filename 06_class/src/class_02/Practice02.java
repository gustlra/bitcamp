package class_02;

public class Practice02 {
	
	public static void main(String[] args) {
		Fruit[] ft = new Fruit[3];
		Practice02 ar = new Practice02();
		
		System.out.println("------------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("------------------------------------");
		
		ft[0] = new Fruit("사과",100,80,75);
		ft[1] = new Fruit("포도",30,25,10);
		ft[2] = new Fruit("딸기",25,30,90);
		
		for(Fruit dto : ft) {
			dto.calc();
			System.out.println(dto.getPum()+"\t"
							+dto.getJan()+"\t"
							+dto.getFeb()+"\t"
							+dto.getMar()+"\t"
							+dto.getTot());
	
			
		}
		System.out.println("------------------------------------");
		System.out.print("\t"+(ft[0].getJan()+ft[1].getJan()+ft[2].getJan()));
		System.out.print("\t"+(ft[0].getFeb()+ft[1].getFeb()+ft[2].getFeb()));
		System.out.print("\t"+(ft[0].getMar()+ft[1].getMar()+ft[2].getMar()));
		Practice02.output();
	}
	public static void output() {
		Practice02 ar = new Practice02();
		Fruit ft = new Fruit();
		//Fruit[] ft = new Fruit[3];
		System.out.println();
		
		System.out.print("\t"+(ft[0].getJan()+ft[1].getJan()+ft[2].getJan()));
		System.out.print("\t"+(ft[0].getFeb()+ft[1].getFeb()+ft[2].getFeb()));
		System.out.print("\t"+(ft[0].getMar()+ft[1].getMar()+ft[2].getMar()));
		
		
		
		
		
		
	}
	

}

package ClassMake;

public class SimsMain {

	public static void main(String[] args) {

//		Sims[] sims = new Sims[3];
//
//		for (int i = 0; i < sims.length; i++) {
//			sims[i] = new Sims();
//			System.out.println(sims[i]);
//		}
//		
//		System.out.println(sims[0]);

		Sims 유진 = new Sims();
		Sims 준서 = new Sims("준서", 26, '남', 63, 1);
		Sims 동현 = new Sims("동현", 24, '남', 67, 1);
		Sims 대영 = new Sims("대영", 27, '남', 69, 2);
		Sims 동욱 = new Sims("동욱", 25, '남', 70, 3);

	   유진.toString();
	   준서.toString();
	   동현.toString();
	   대영.toString();
	   동욱.toString();
	
	   유진.eat();
	   준서.eat();
	   동현.eat();
	   대영.eat();
	   동욱.eat();

	   System.out.println(유진);
	   System.out.println(준서);
	   System.out.println(동현);
	   System.out.println(대영);
	   System.out.println(동욱);
	}

}

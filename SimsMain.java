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

		Sims ���� = new Sims();
		Sims �ؼ� = new Sims("�ؼ�", 26, '��', 63, 1);
		Sims ���� = new Sims("����", 24, '��', 67, 1);
		Sims �뿵 = new Sims("�뿵", 27, '��', 69, 2);
		Sims ���� = new Sims("����", 25, '��', 70, 3);

	   ����.toString();
	   �ؼ�.toString();
	   ����.toString();
	   �뿵.toString();
	   ����.toString();
	
	   ����.eat();
	   �ؼ�.eat();
	   ����.eat();
	   �뿵.eat();
	   ����.eat();

	   System.out.println(����);
	   System.out.println(�ؼ�);
	   System.out.println(����);
	   System.out.println(�뿵);
	   System.out.println(����);
	}

}

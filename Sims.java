package ClassMake;

public class Sims {

	private String name;
	private int age;
	private char gender;
	private double weight;
	private int eat;
	
	public Sims() {
		this.name ="����";
		this.age = 20;
		this.gender ='��';
		this.weight = 45;
		this.eat = 5;
	}
	
	public Sims(String name, int age, char gender, double weight, int eat) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.eat = eat;
	}
	
	public String getName() {
		return name;
	}
	public void setName() {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge() {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender() {
		this.gender = gender;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight() {
		this.weight = weight;
	}

	
	
	@Override
	public String toString() {
		
		return "Sims [name=" + name + ", age=" + age + ", gender=" + gender + ", weight=" + weight + ", " + eat()
				+ "]";
	}
	

	public String eat() {
		if(eat==1) {
			System.out.println(name + "��ħ �ȳ�");
			return "��ħ �ȳ�";
		}
		else if(eat==2) {
			System.out.println(name + "���� �ܲ�");
			return "���ɲܰ�";
		}
		else if(eat==3) {
			System.out.println(name + "���� ����");
			return "��������";
		}
		else {
			System.out.println(name + "����");
			return "����";
		}
		
	}
}

package basic;

public class EnumDemo {

	
	void add() {
		
	}
	void sub() {
		add();
	}
	public static void main(String[] args) {

		//object > 
//		add();
		
		System.out.println(Drink.SMALL);
		System.out.println(Drink.SMALL.value);

		Drink SMALL2;
		SMALL2 = Drink.SMALL;

	}
}

class ColdDrink {
	final int LARGE = 3;
	final int SMALL = 1;
	final int MED = 2;
}

enum Drink {
	SMALL(1), MED(2), LARGE(3);

	int value;

	Drink(int x) {
		value = x;
	}
}

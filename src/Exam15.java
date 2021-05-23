
public final class Exam15 extends AllProduct {
	final static int qty = 12;
	Gender m;

	public Exam15() {
		m = Gender.Male;
	}

	public final void finalMethod() {
		System.out.println("Final Method can not change");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam15 ex = new Exam15();

		ex.getName();
		ex.getPrice();
		ex.getQuantity();
		System.out.println("qty is " + qty);

		ex.finalMethod();
		if (ex.m == Gender.Male)
			System.out.println("You are male");
		else if (ex.m == Gender.Female)
			System.out.println("You are female");
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("Product:Tv sumsung");
	}

	@Override
	public void getPrice() {
		// TODO Auto-generated method stub
		System.out.println("Price:6000");
	}

	@Override
	public void getQuantity() {
		// TODO Auto-generated method stub
		System.out.println("Quantity:20");

	}

}

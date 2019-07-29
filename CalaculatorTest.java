
public class CalaculatorTest {

	public static void main(String[] args) {
		Calculator calc1 = new Calculator();
		Calculator calc2 = new Calculator();
		
		calc1.setOperandOne(5.67);
		calc1.setOperation("+");
		calc1.setOperandTwo(21.3);
		
		calc2.setOperandOne(51.99);
		calc2.setOperation("-");
		calc2.setOperandTwo(30.10);
		
		calc1.performOperation();
		calc2.performOperation();
		System.out.println(calc1.getResults());
		System.out.println(calc2.getResults());

	}

}

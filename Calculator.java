
public class Calculator {
	private double operandOne;
	private double operandTwo;
	private double result;
	private String operation;
	
	public void setOperandOne(double num) {
		operandOne = num;
	}
	
	public void setOperandTwo(double num) {
		operandTwo = num;
	}

	public void setOperation(String operator) {
		operation = operator;
	}
	
	public double getOperandOne() {
		return operandOne;
	}
	
	public double getOperandTwo() {
		return operandTwo;
	}

	public String getOperation() {
		return operation;
	}
	
	public void performOperation() {
		if(operation == "+") {
			result = operandOne + operandTwo;
		}
		if(operation == "-") {
			result = operandOne - operandTwo;
		}
	}
	
	public double getResults() {
		return result;
	}
	
	
	
}

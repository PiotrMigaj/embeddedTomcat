package pl.migibud.calc;

public class CalculatorBean{

	private int accumulator;
	private int input;

	public void setAccumulator(String accumulator) {
		this.accumulator=toInt(accumulator);
	}

	public void setInput(String input) {

	}

	private int toInt(String input){
		if (input!=null && input.length()>0){
			return Integer.parseInt(input);
		}
		return 0;
	}

	public int getAccumulator() {
		return accumulator;
	}

	public int getInput() {
		return input;
	}
}

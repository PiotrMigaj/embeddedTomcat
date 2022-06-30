package pl.migibud.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorBeanTest {

	@Test
	void shouldParseAccumulator(){
		//given
		CalculatorBean calculatorBean = new CalculatorBean();
		//when
		calculatorBean.setAccumulator("123");
		//then
		assertEquals(123,calculatorBean.getAccumulator());

	}

}
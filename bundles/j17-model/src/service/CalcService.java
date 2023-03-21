package service;

import com.baeldung.soap.ws.client.generated.Calculator;

public class CalcService {
	public int add(int a, int b) {
		return new Calculator().getCalculatorSoap().add(a, b);
	}
}

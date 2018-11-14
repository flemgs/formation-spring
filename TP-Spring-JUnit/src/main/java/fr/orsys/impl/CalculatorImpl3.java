package fr.orsys.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import fr.orsys.interfaces.Calculator;

@Component
@Qualifier("calc3")
public class CalculatorImpl3 implements Calculator {
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}
}

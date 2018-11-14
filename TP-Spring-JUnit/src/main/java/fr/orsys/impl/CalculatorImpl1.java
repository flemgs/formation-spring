package fr.orsys.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import fr.orsys.interfaces.Calculator;

@Component
@Qualifier("calc1")
@Profile("dev")
public class CalculatorImpl1 implements Calculator {

	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}
	
}

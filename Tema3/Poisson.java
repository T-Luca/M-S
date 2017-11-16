package nrandom;

/**
 *
 * @author Luca
 */
import java.util.Random;

import interfata.Generator;

public class Poisson implements Generator {

	private Random randomNumber;
	private double L;
	private Double lambda;
	private Integer n;

	public Poisson(Integer n, Double lambda) {
		this.n = n;
		this.lambda = lambda;
		this.randomNumber = new Random();
		this.L = 1 / (Math.pow(Math.E, this.lambda));
	}

	@Override
	public float next() {

		int k = 0;
		float p = 1f;

		do {
			k = k + 1;
			p = p * randomNumber.nextFloat();
		} while (p > L && k < n);
		int result = (k - 1);

		return result;
	}

}

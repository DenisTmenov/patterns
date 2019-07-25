package com.epam.study.patterns.builder;

import java.util.Arrays;

public class BuilderMain
{
	public static void start()
	{
		Director.createStoneHouse();
		Director.addCustomerFeatures(Arrays.asList("pool", "garden"));
		Director.printResult();

		Director.createStoneHouse();
		Director.addCustomerFeatures(Arrays.asList("garage", "garden"));
		Director.printResult();

	}
}

package com.epam.study.patterns.builder;

import java.util.List;

import com.epam.study.patterns.builder.builder.Builder;
import com.epam.study.patterns.builder.builder.StoneBuilder;
import com.epam.study.patterns.builder.builder.WoodBuilder;

public class Director
{

	private static Builder builder = new StoneBuilder();

	public static void createWoodHouse()
	{
		builder = new WoodBuilder();
		createHouse();
	}

	public static void createStoneHouse()
	{
		builder = new StoneBuilder();
		createHouse();
	}

	public static void addCustomerFeatures(List<String> features)
	{
		features.forEach(f -> builder.addCustomerFeature(f));
	}

	public static void printResult()
	{
		builder.getResult().getHouseElements().forEach(System.out::println);
	}

	private static void createHouse()
	{
		builder.buildBase();
		builder.buildWalls();
		builder.buildRoof();
		builder.montageDoors();
		builder.montageWindows();
	}
}

package com.epam.study.patterns.abstractFactory;

import com.epam.study.patterns.abstractFactory.factory.FurnitureFactoryAbstract;
import com.epam.study.patterns.abstractFactory.factory.ModernFurnitureFactory;
import com.epam.study.patterns.abstractFactory.factory.VictorianFurnitureFactory;

public class AbstractFactory
{

	public static void start()
	{
		FurnitureFactoryAbstract factory = new ModernFurnitureFactory();

		factory.createChair().chairAction();
		factory.createTable().tableAction();

		factory = new VictorianFurnitureFactory();

		factory.createChair().chairAction();
		factory.createTable().tableAction();
	}
}

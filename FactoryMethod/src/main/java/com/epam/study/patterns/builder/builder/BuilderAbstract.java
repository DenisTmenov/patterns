package com.epam.study.patterns.builder.builder;

import java.util.ArrayList;
import java.util.List;

import com.epam.study.patterns.builder.House;

public abstract class BuilderAbstract implements Builder
{

	private House house = new House();

	@Override
	public House getResult()
	{
		return house;
	}

	@Override
	public void addCustomerFeature(String feature)
	{
		house.getHouseElements().add(feature);
	}

	protected void addElementToHouse(String element)
	{
		house.getHouseElements().add(element);
	}
}

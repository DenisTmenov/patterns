package com.epam.study.patterns.abstractFactory.furniture.victorian;

import com.epam.study.patterns.abstractFactory.furniture.Table;

public class VictorianTable extends VictorianFurniture implements Table
{
	@Override
	public void tableAction()
	{
		System.out.println("This is " + VICTORIAN + " " + TABLE + ".");
	}
}

package com.epam.study.patterns.abstractFactory.furniture.modern;

import com.epam.study.patterns.abstractFactory.furniture.Table;

public class ModernTable extends ModernFurniture implements Table
{
	@Override
	public void tableAction()
	{
		System.out.println("This is " + MODERN + " " + TABLE + ".");
	}
}

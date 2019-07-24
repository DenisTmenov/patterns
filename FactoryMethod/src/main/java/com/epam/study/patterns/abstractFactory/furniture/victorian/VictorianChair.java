package com.epam.study.patterns.abstractFactory.furniture.victorian;

import com.epam.study.patterns.abstractFactory.furniture.Chair;

public class VictorianChair extends VictorianFurniture implements Chair
{
	@Override
	public void chairAction()
	{
		System.out.println("This is " + VICTORIAN + " " + CHAIR + ".");
	}
}

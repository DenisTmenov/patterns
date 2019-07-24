package com.epam.study.patterns.abstractFactory.furniture.modern;

import com.epam.study.patterns.abstractFactory.furniture.Chair;

public class ModernChair extends ModernFurniture implements Chair
{
	@Override
	public void chairAction()
	{
		System.out.println("This is " + MODERN + " " + CHAIR + ".");
	}
}

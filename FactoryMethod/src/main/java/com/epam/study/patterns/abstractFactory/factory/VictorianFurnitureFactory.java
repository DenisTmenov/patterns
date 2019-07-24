package com.epam.study.patterns.abstractFactory.factory;

import com.epam.study.patterns.abstractFactory.furniture.Chair;
import com.epam.study.patterns.abstractFactory.furniture.Table;
import com.epam.study.patterns.abstractFactory.furniture.victorian.VictorianChair;
import com.epam.study.patterns.abstractFactory.furniture.victorian.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactoryAbstract
{
	@Override
	public Chair createChair()
	{
		return new VictorianChair();
	}

	@Override
	public Table createTable()
	{
		return new VictorianTable();
	}
}

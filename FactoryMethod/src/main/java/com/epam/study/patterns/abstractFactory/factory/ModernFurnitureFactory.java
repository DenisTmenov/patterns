package com.epam.study.patterns.abstractFactory.factory;

import com.epam.study.patterns.abstractFactory.furniture.Chair;
import com.epam.study.patterns.abstractFactory.furniture.Table;
import com.epam.study.patterns.abstractFactory.furniture.modern.ModernChair;
import com.epam.study.patterns.abstractFactory.furniture.modern.ModernTable;

public class ModernFurnitureFactory implements FurnitureFactoryAbstract
{
	@Override
	public Chair createChair()
	{
		return new ModernChair();
	}

	@Override
	public Table createTable()
	{
		return new ModernTable();
	}
}

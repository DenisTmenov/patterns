package com.epam.study.patterns.abstractFactory.factory;

import com.epam.study.patterns.abstractFactory.furniture.Chair;
import com.epam.study.patterns.abstractFactory.furniture.Table;

public interface FurnitureFactoryAbstract
{
	Chair createChair();

	Table createTable();
}

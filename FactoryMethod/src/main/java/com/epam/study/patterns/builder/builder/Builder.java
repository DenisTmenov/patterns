package com.epam.study.patterns.builder.builder;

import com.epam.study.patterns.builder.House;

public interface Builder
{
	void buildBase();

	void buildWalls();

	void buildRoof();

	void montageDoors();

	void montageWindows();

	House getResult();

	void addCustomerFeature(String feature);
}

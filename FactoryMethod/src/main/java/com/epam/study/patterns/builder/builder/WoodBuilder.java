package com.epam.study.patterns.builder.builder;

public class WoodBuilder extends BuilderAbstract
{
	@Override
	public void buildBase()
	{
		addElementToHouse("Build base for wood house!");
	}

	@Override
	public void buildWalls()
	{
		addElementToHouse("Build walls for wood house!");
	}

	@Override
	public void buildRoof()
	{
		addElementToHouse("Build roof for wood house!");
	}

	@Override
	public void montageDoors()
	{
		addElementToHouse("Montage doors in wood house!");
	}

	@Override
	public void montageWindows()
	{
		addElementToHouse("Montage windows in wood house!");
	}
}

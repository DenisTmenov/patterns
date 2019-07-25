package com.epam.study.patterns.builder.builder;

public class StoneBuilder extends BuilderAbstract
{
	@Override
	public void buildBase()
	{
		addElementToHouse("Build base for stone house!");
	}

	@Override
	public void buildWalls()
	{
		addElementToHouse("Build walls for stone house!");
	}

	@Override
	public void buildRoof()
	{
		addElementToHouse("Build roof for stone house!");
	}

	@Override
	public void montageDoors()
	{
		addElementToHouse("Montage doors in stone house!");
	}

	@Override
	public void montageWindows()
	{
		addElementToHouse("Montage windows in stone house!");
	}
}

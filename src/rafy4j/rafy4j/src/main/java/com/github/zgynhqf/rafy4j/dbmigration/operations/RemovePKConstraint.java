package com.github.zgynhqf.rafy4j.dbmigration.operations;

public class RemovePKConstraint extends ColumnOperation
{
	@Override
	protected void Down()
	{
		AddPKConstraint tempVar = new AddPKConstraint();
		tempVar.copyFrom(this);
		this.AddOperation(tempVar);
	}
}
package com.github.zgynhqf.rafy4j.dbmigration.operations;

public class RemoveNotNullConstraint extends ColumnOperation
{
	@Override
	protected void Down()
	{
		AddNotNullConstraint tempVar = new AddNotNullConstraint();
		tempVar.copyFrom(this);
		this.AddOperation(tempVar);
	}
}
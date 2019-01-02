package com.github.zgynhqf.rafy4j.dbmigration.operations;

public class DropNormalColumn extends ColumnOperation {
    private boolean primaryKey;
    private boolean autoIncrement;

    //region gs
    public final boolean isPrimaryKey() {
        return primaryKey;
    }

    public final void setPrimaryKey(boolean value) {
        primaryKey = value;
    }

    public final boolean isAutoIncrement() {
        return autoIncrement;
    }

    public final void setAutoIncrement(boolean value) {
        autoIncrement = value;
    }
    //endregion

    @Override
    protected void Down() {
        CreateNormalColumn tempVar = new CreateNormalColumn();
        tempVar.copyFrom(this);
        tempVar.setPrimaryKey(this.isPrimaryKey());
        tempVar.setAutoIncrement(this.isAutoIncrement());
        this.AddOperation(tempVar);
    }
}
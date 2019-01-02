package com.github.zgynhqf.rafy4j.dbmigration.run;

import com.github.zgynhqf.rafy4j.data.FormattedSql;
import com.github.zgynhqf.rafy4j.data.DbAccesser;
import com.github.zgynhqf.rafy4j.dbmigration.MigrationRun;

public class FormattedSqlMigrationRun extends MigrationRun {
    private FormattedSql sql;

    public final FormattedSql getSql() {
        return sql;
    }

    public final void setSql(FormattedSql value) {
        sql = value;
    }

    @Override
    protected void RunCore(DbAccesser db) {
        db.ExecuteText(sql);
    }
}
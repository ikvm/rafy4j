package com.github.zgynhqf.rafy4j.dbmigration.model;

/** 
 目标数据库 Schema 的读取器
 
*/
public interface DestinationDatabaseReader extends MetadataReader
{
	/**
	 * 读取整个库的元数据
	 * @return
	 */
	DestinationDatabase Read();
}
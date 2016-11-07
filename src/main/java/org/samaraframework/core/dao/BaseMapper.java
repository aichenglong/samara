package org.samaraframework.core.dao;

import java.util.List;

/**
 * 通用Mapper 基类
 * 
 * @author ACL
 *
 * @param <T>
 * @param <ID>
 */
public interface BaseMapper<T, ID extends java.io.Serializable> {

	public List<T> findByEntity(T t);

	public T findByPrimaryKey(ID id);
	

	int deleteByPrimaryKey(ID id);

	int insert(T record);

	int insertSelective(T record);

	T selectByPrimaryKey(ID id);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKeyWithBLOBs(T record);

	int updateByPrimaryKey(T record);
}

package org.samaraframework.core.service;

import java.util.List;

/**
 * service层公共的操作方法
 * 
 * @author ACL
 *
 * @param <T>
 * @param <ID>
 */
public interface ICommonService<T, ID extends java.io.Serializable> {

	public List<T> findAll(T t);

	public T findById(ID id);

	public void save(T t);

	public void update(T t);

	public void delete(ID id);
}

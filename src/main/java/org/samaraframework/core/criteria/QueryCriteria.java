package org.samaraframework.core.criteria;

import java.io.Serializable;

/**
 * 查询条件的接口
 * 
 * @author ACL
 *
 */
public interface QueryCriteria<T> extends Serializable {

	public T getModel();

	public void setModel(T model);
	
	
}

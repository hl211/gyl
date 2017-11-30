/**   
 * Copyright © 2017 公司名. All rights reserved.
 * 
 * @Title: BaseDao.java 
 * @Prject: gyl
 * @Package: com.hl.dao 
 * @Description: TODO
 * @author: hl   
 * @date: 2017年11月30日 上午10:49:35 
 * @version: V1.0   
 */
package com.hl.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;



/** 
 * @ClassName: BaseDao 
 * @Description: TODO
 * @author: hl
 * @date: 2017年11月30日 上午10:49:35  
 */
public interface IBaseDao<T>
{
    /**
     * @param userId
     * @return T
     */
    public T selectByPrimaryKey(Integer id);
    
    /**
     * 
     * @Title: selectEntryByWhere 
     * @Description: TODO
     * @param t
     * @return
     * @return: List<T>
     */
    List<T> selectEntryByWhere(T t);
    
    List<T> selectEntryAll();
    
    List<T> selectEntryAllSort(@Param("orderField") String orderField,
        @Param("orderDirection") String orderDirection);
    
    int insertEntry(T t);
    
    int insertEntryBatch(List<T> list);
    
    int updateEntryByPrimaryKey(T t);
    
    int deleteByWhere(T t);
    
    int deleteByPrimaryKey(Integer Id);
    
    int deleteByPrimaryKeyBatch(List<T> list);
    
    
 
}

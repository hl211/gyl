/**   
 * Copyright © 2017 公司名. All rights reserved.
 * 
 * @Title: BaseService.java 
 * @Prject: gyl
 * @Package: com.hl.service 
 * @Description: TODO
 * @author: hl   
 * @date: 2017年11月30日 上午10:36:06 
 * @version: V1.0   
 */
package com.hl.service;

import java.util.List;

import com.hl.util.PagedResult;

/**
 * @ClassName: BaseService
 * @Description: TODO
 * @author: hl
 * @date: 2017年11月30日 上午10:36:06
 */
public interface IBaseService<T>
{
    
    T selectByPrimaryKey(Integer id);
    
    /**
     * 
     * @author hl
     * @since 2017年11月16日
     * @param userName 查询条件，可为空
     * @param pageNo 查询条件，可为空，默认取1
     * @param pageSize 查询条件，可为空，默认取10
     * @return
     */
    PagedResult<T> selectEntryByWhere(T t, Integer pageNo, Integer pageSize);
    
    PagedResult<T> selectEntryAll(Integer pageNo, Integer pageSize);
    
    PagedResult<T> selectEntryAllSort(Integer pageNo, Integer pageSize, String orderField, String orderDirection);
    
    int insertEntry(T t);
    
    int insertEntryBatch(List<T> list);
    
    int updateEntryByPrimaryKey(T t);
    
    
    int deleteByPrimaryKey(Integer Id);
    
    int deleteByPrimaryKeyBatch(List<T> list);
    int deleteByWhere(T t);
    
}

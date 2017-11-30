/**   
 * Copyright © 2017 公司名. All rights reserved.
 * 
 * @Title: UserServiceImpl.java 
 * @Prject: gyl
 * @Package: com.hl.service 
 * @Description: TODO
 * @author: hl   
 * @date: 2017年10月24日 下午9:17:30 
 * @version: V1.0   
 */
package com.hl.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hl.dao.IBaseDao;
import com.hl.service.IBaseService;
import com.hl.util.BeanUtil;
import com.hl.util.PagedResult;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @author: hl
 * @date: 2017年10月24日 下午9:17:30
 */

@Service
public abstract class BaseServiceImpl<T> implements IBaseService<T>
{
    
    public abstract IBaseDao<T> getBaseDao();
    
    public T selectByPrimaryKey(Integer userId)
    {
        return this.getBaseDao().selectByPrimaryKey(userId);
        
    }
    
    /*
     * (non Javadoc)
     * 
     * @Title: queryUserBywhere
     * 
     * @Description: TODO
     * 
     * @param user
     * 
     * @return
     * 
     * @see com.hl.service.IUserService#queryUserBywhere(com.hl.domain.User)
     */
    public PagedResult<T> selectEntryByWhere(T t, Integer pageNo, Integer pageSize)
    {
        // TODO Auto-generated method stub
        pageNo = pageNo == null ? 1 : pageNo;
        pageSize = pageSize == null ? 10 : pageSize;
        PageHelper.startPage(pageNo, pageSize); // startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
        return BeanUtil.toPagedResult(this.getBaseDao().selectEntryByWhere(t));
        
    }
    
    /*
     * (non Javadoc)
     * 
     * @Title: selectEntryAll
     * 
     * @Description: TODO
     * 
     * @return
     * 
     * @see com.hl.service.IUserService#selectEntryAll()
     */
    public PagedResult<T> selectEntryAll(Integer pageNo, Integer pageSize)
    {
        // TODO Auto-generated method stub
        pageNo = pageNo == null ? 1 : pageNo;
        pageSize = pageSize == null ? 10 : pageSize;
        PageHelper.startPage(pageNo, pageSize); // startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
        return BeanUtil.toPagedResult(this.getBaseDao().selectEntryAll());
        
    }
    
    /*
     * (non Javadoc)
     * 
     * @Title: selectEntryAllSort
     * 
     * @Description: TODO
     * 
     * @param pageNo
     * 
     * @param pageSize
     * 
     * @param orderField
     * 
     * @param orderDirection
     * 
     * @return
     * 
     * @see com.hl.service.IUserService#selectEntryAllSort(java.lang.Integer, java.lang.Integer, java.lang.String,
     * java.lang.String)
     */
    public PagedResult<T> selectEntryAllSort(Integer pageNo, Integer pageSize, String orderField, String orderDirection)
    {
        // TODO Auto-generated method stub
        pageNo = pageNo == null ? 1 : pageNo;
        pageSize = pageSize == null ? 10 : pageSize;
        PageHelper.startPage(pageNo, pageSize); // startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
        return BeanUtil.toPagedResult(this.getBaseDao().selectEntryAllSort(orderField, orderDirection));
    }
    
    /*
     * (non Javadoc)
     * 
     * @Title: insertEntry
     * 
     * @Description: TODO
     * 
     * @param user
     * 
     * @see com.hl.service.IUserService#insertEntry(com.hl.domain.User)
     */
    public int insertEntry(T t)
    {
        // TODO Auto-generated method stub
        return this.getBaseDao().insertEntry(t);
        
    }
    
    /*
     * (non Javadoc)
     * 
     * @Title: insertEntryBatch
     * 
     * @Description: TODO
     * 
     * @param list
     * 
     * @return
     * 
     * @see com.hl.service.IUserService#insertEntryBatch(java.util.List)
     */
    public int insertEntryBatch(List<T> list)
    {
        // TODO Auto-generated method stub
        
        return this.getBaseDao().insertEntryBatch(list);
    }
    
    public int updateEntryByPrimaryKey(T t)
    {
        return this.getBaseDao().updateEntryByPrimaryKey(t);
    }
    
    public int deleteByPrimaryKey(Integer Id)
    {
        return this.getBaseDao().deleteByPrimaryKey(Id);
    }
    
    /*
     * (non Javadoc)
     * 
     * @Title: deleteByPrimaryKeyBatch
     * 
     * @Description: TODO
     * 
     * @param list
     * 
     * @return
     * 
     * @see com.hl.service.IUserService#deleteByPrimaryKeyBatch(java.util.List)
     */
    public int deleteByPrimaryKeyBatch(List<T> list)
    {
        // TODO Auto-generated method stub
        return this.getBaseDao().deleteByPrimaryKeyBatch(list);
        
    }
    
    public int deleteByWhere(T t)
    {
        return this.getBaseDao().deleteByWhere(t);
    }
    
}

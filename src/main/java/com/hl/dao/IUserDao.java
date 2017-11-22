/**   
 * Copyright © 2017 公司名. All rights reserved.
 * 
 * @Title: UserDao.java 
 * @Prject: gyl
 * @Package: com.hl.dao 
 * @Description: TODO
 * @author: hl   
 * @date: 2017年10月24日 下午9:15:27 
 * @version: V1.0   
 */
package com.hl.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hl.domain.User;

/**
 * @ClassName: UserDao
 * @Description: TODO
 * @author: hl
 * @date: 2017年10月24日 下午9:15:27
 */
public interface IUserDao
{
    /**
     * @param userId
     * @return User
     */
    public User selectByPrimaryKey(Integer userId);
    
    List<User> selectUserEntry();
    
    /**
     * 
     * @author hl
     * @since 2017年11月16日
     * @param userName
     * @return
     */
    List<User> selectUserByUserName(@Param("userName") String userName);
    
    List<User> selectEntryByWhere(User user);
    
    int insertEntry(User user);
    
    int insertEntryBatch(List<User> list);
    
    int deleteByPrimaryKeyBatch(List<User> list);
    
    List<User> selectEntryAll();
    
    List<User> selectEntryAllSort(@Param("orderField") String orderField,
        @Param("orderDirection") String orderDirection);
    
}

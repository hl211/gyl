/**   
 * Copyright © 2017 公司名. All rights reserved.
 * 
 * @Title: UserService.java 
 * @Prject: gyl
 * @Package: com.hl.service 
 * @Description: TODO
 * @author: hl   
 * @date: 2017年10月24日 下午9:16:06 
 * @version: V1.0   
 */
package com.hl.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hl.domain.User;
import com.hl.util.PagedResult;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @author: hl
 * @date: 2017年10月24日 下午9:16:06
 */
public interface IUserService
{
    User selectByPrimaryKey(Integer userId);
    
    /**
     * 
     * @author hl
     * @since 2017年11月16日
     * @param userName 查询条件，可为空
     * @param pageNo 查询条件，可为空，默认取1
     * @param pageSize 查询条件，可为空，默认取10
     * @return
     */
  
    
    PagedResult<User> queryUserBywhere(User user, Integer pageNo, Integer pageSize);
    
    int insertEntry(User user);
    
    int insertEntryBatch(List<User> list);
    
    int deleteByPrimaryKeyBatch(List<User> list);
    
    PagedResult<User> selectEntryAll(Integer pageNo, Integer pageSize);
    
    PagedResult<User> selectEntryAllSort(Integer pageNo, Integer pageSize, String orderField, String orderDirection);
    
}

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
public interface UserDao
{
    /**
     * @param userId
     * @return User
     */
    public User selectUserById(Integer userId);  
    
    
    /**
     * 
     * @author hl
     * @since  2017年11月16日 
     * @param userName
     * @return
     */
    List<User> selectUserByUserName(@Param("userName") String userName);


}

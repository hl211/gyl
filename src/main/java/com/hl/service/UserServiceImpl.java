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
package com.hl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hl.dao.UserDao;
import com.hl.domain.User;
import com.hl.util.BeanUtil;
import com.hl.util.PagedResult;

/** 
 * @ClassName: UserServiceImpl 
 * @Description: TODO
 * @author: hl
 * @date: 2017年10月24日 下午9:17:30  
 */

@Service 
public class UserServiceImpl implements UserService {

    @Autowired  
    private UserDao userDao;  

    public User selectUserById(Integer userId) {  
        return userDao.selectUserById(userId);  

    }  

    public PagedResult<User> queryByPage(String userName,Integer pageNo,Integer pageSize ) {
        pageNo = pageNo == null?1:pageNo;
        pageSize = pageSize == null?10:pageSize;
        PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
        return BeanUtil.toPagedResult(userDao.selectUserByUserName(userName));
    }
}

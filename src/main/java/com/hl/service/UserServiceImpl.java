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
import com.hl.dao.UserDao;
import com.hl.domain.User;

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

    
}

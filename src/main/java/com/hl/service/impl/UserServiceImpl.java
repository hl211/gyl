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



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hl.dao.IBaseDao;
import com.hl.dao.IUserDao;
import com.hl.domain.User;
import com.hl.service.IUserService;


/** 
 * @ClassName: UserServiceImpl 
 * @Description: TODO
 * @author: hl
 * @date: 2017年10月24日 下午9:17:30  
 */

@Service 
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {

    @Autowired  
    private IUserDao userDao; 
    

    /* (non Javadoc) 
     * @Title: getBaseDao
     * @Description: TODO
     * @return 
     * @see com.hl.service.base.BaseServiceImpl#getBaseDao() 
     */
    @Override
    public IBaseDao<User> getBaseDao()
    {
        // TODO Auto-generated method stub
        return this.userDao;
    }


}

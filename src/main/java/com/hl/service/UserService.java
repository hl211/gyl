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

import com.hl.domain.User;
import com.hl.util.PagedResult;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @author: hl
 * @date: 2017年10月24日 下午9:16:06
 */
public interface UserService
{
    User selectUserById(Integer userId);
    
    /**
     * 
     * @author hl
     * @since 2017年11月16日
     * @param userName 查询条件，可为空
     * @param pageNo 查询条件，可为空，默认取1
     * @param pageSize 查询条件，可为空，默认取10
     * @return
     */
    PagedResult<User> queryByPage(String userName, Integer pageNo, Integer pageSize);
    
}

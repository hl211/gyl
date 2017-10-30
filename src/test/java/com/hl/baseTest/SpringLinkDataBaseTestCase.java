/**   
 * Copyright © 2017 公司名. All rights reserved.
 * 
 * @Title: SpringTestCase.java 
 * @Prject: gyl
 * @Package: com.hl.baseTest 
 * @Description: TODO
 * @author: hl   
 * @date: 2017年10月30日 下午6:58:22 
 * @version: V1.0   
 */
package com.hl.baseTest;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hl.domain.User;
import com.hl.service.UserService;

/**
 * @ClassName: SpringTestCase
 * @Description: TODO
 * @author: hl
 * @date: 2017年10月30日 下午6:58:22
 */
// 指定bean注入的配置文件
@ContextConfiguration(locations = {"classpath:application.xml"})
// 使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner
@RunWith(SpringJUnit4ClassRunner.class)

public class SpringLinkDataBaseTestCase extends AbstractJUnit4SpringContextTests
{
    @Resource 
    //@Autowired
    private UserService userService; 
    @Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(1);  
        System.out.println(user.getUserName() + ":" + user.getUserPassword());
    }  

}

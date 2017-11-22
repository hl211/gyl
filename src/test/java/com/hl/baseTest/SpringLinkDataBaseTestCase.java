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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.hl.controller.UserController;
import com.hl.domain.User;
import com.hl.service.IUserService;
import com.hl.util.PagedResult;

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
    private final static Logger logger = LoggerFactory.getLogger(SpringLinkDataBaseTestCase.class);
    
    @Resource
    // @Autowired
    private IUserService userService;
    
    @Test
    public void selectUserByIdTest()
    {
        User user = userService.selectByPrimaryKey(1);
        System.out.println(JSON.toJSONString(user));
        
    }
    

   
    
    @Test
    public void queryUserByWhere()
    {
        User u = new User();
        
        u.setUserName("hl");
        
        PagedResult<User> pagedResult = userService.queryUserBywhere(u, 1, 10);
        System.out.println(pagedResult.getTotal());
    }
    
    @Test
    public void insertEntry()
    {
        User u = new User();
        u.setUserName("hl111");
        u.setUserPassword("dd");
        System.out.println(u.getUserId());
        System.out.println(userService.insertEntry(u));
        System.out.println(u.getUserId());
    }
    
    @Test
    public void insertEntryBatch() {
        List<User> list=new ArrayList<User>();
        for (int i = 0; i < 10; i++)
        {
            User u = new User();
            u.setUserName("hl"+i);
         
            u.setUserPassword("123"+i);
            
            list.add(u);
        }
        try
        {
            System.out.println(userService.insertEntryBatch(list));
        }
        catch (Exception e)
        {
            // TODO: handle exception
          System.out.println("插入失败"+e.getCause());
        }
        
        for (User user : list)
        {
            System.out.println(user);
        }
        
    }
    
    @Test
    public void deleteByPrimaryKeyBatch() {
        List l=new ArrayList();
        for (int i = 0; i < 5; i++)
        {
            l.add(i);
        }
        
        try
        {
            System.out.println(userService.deleteByPrimaryKeyBatch(l));
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            System.out.println(e.getCause());
        }
    }
    @Test
    public void selectEntryAll() {
        PagedResult<User> pagedResult = userService.selectEntryAll(1, 30);
        for (User iterable_element : pagedResult.getDataList())
        {
            System.out.println(iterable_element);
        }
        
        System.out.println(pagedResult.getTotal());
    }
    
    @Test
    public void selectEntryAllSort() {
        PagedResult<User> pagedResult = userService.selectEntryAllSort(1, 30, "USER_NAME", "DESC");
        for (User iterable_element : pagedResult.getDataList())
        {
            System.out.println(iterable_element);
        }
        
        System.out.println(pagedResult.getTotal());
    }
}

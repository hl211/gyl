/**   
 * Copyright © 2017 公司名. All rights reserved.
 * 
 * @Title: UserController.java 
 * @Prject: gyl
 * @Package: com.hl.controller 
 * @Description: TODO
 * @author: hl   
 * @date: 2017年10月24日 下午9:33:03 
 * @version: V1.0   
 */
package com.hl.controller;


import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.hl.domain.User;
import com.hl.service.IUserService;
/** 
 * @ClassName: UserController 
 * @Description: TODO
 * @author: hl
 * @date: 2017年10月24日 下午9:33:03  
 */

@Controller  
public class UserController
{
    private  final static Logger logger = LoggerFactory.getLogger(UserController.class);
    
    @Resource 
    //@Autowired
    private IUserService userService;  

    @RequestMapping("/")    
    public ModelAndView getIndex(){      
        ModelAndView mav = new ModelAndView("index");   
        User user = userService.selectUserById(1);  
        mav.addObject("user", user);  
        logger.info("测试：{}", "输出日志"); 
        return mav;    
    }    
    
    @RequestMapping("/user")   
    public @ResponseBody User getuser(User u){  
        System.out.println(u);
        User user = userService.selectUserById(1);     
        //logger.info("测试：{}", "输出日志"); 
        return user;    
    }

}

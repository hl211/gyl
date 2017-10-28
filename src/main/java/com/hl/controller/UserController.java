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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.hl.domain.User;
import com.hl.service.UserService;
/** 
 * @ClassName: UserController 
 * @Description: TODO
 * @author: hl
 * @date: 2017年10月24日 下午9:33:03  
 */

@Controller  
public class UserController
{
    @Resource  
    private UserService userService;  

    @RequestMapping("/")    
    public ModelAndView getIndex(){      
        ModelAndView mav = new ModelAndView("index");   
        User user = userService.selectUserById(1);  
        mav.addObject("user", user);   
        return mav;    
    }    

}

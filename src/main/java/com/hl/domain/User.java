/**   
 * Copyright © 2017 公司名. All rights reserved.
 * 
 * @Title: User.java 
 * @Prject: gyl
 * @Package: com.hl.domain 
 * @Description: TODO
 * @author: hl   
 * @date: 2017年10月24日 下午9:14:33 
 * @version: V1.0   
 */
package com.hl.domain;

/** 
 * @ClassName: User 
 * @Description: TODO
 * @author: hl
 * @date: 2017年10月24日 下午9:14:33  
 */
public class User
{
    private Integer userId;  
    private String userName;  
    private String userPassword;
    /**
     * @return the userId
     */
    public Integer getUserId()
    {
        return userId;
    }
    /**
     * @param userId the userId to set
     */
    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }
    /**
     * @return the userName
     */
    public String getUserName()
    {
        return userName;
    }
    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    /**
     * @return the userPassword
     */
    public String getUserPassword()
    {
        return userPassword;
    }
    /**
     * @param userPassword the userPassword to set
     */
    public void setUserPassword(String userPassword)
    {
        this.userPassword = userPassword;
    }  


}

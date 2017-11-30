/**   
 * Copyright © 2017 公司名. All rights reserved.
 * 
 * @Title: PageRusult.java 
 * @Prject: gyl
 * @Package: com.hl.common 
 * @Description: TODO
 * @author: hl   
 * @date: 2017年11月29日 下午10:08:09 
 * @version: V1.0   
 */
package com.hl.common;

/**
 * @ClassName: PageRusult
 * @Description: TODO
 * @author: hl
 * @date: 2017年11月29日 下午10:08:09
 */
public class PageResultPojo<T>
{
    /* 错误码 */
    private boolean flag;
    
    /* 提示信息 */
    private String msg;
    
    /* 具体的内容 */
    private T data;
    
    public boolean getCode()
    {
        return flag;
    }
    
    public void setFlag(boolean flag)
    {
        this.flag = flag;
    }
    
    public String getMsg()
    {
        return msg;
    }
    
    public void setMsg(String msg)
    {
        this.msg = msg;
    }
    
    public T getData()
    {
        return data;
    }
    
    public void setData(T data)
    {
        this.data = data;
    }
}

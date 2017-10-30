/**   
 * Copyright © 2016 公司名. All rights reserved.
 * 
 * @Title: VerifyUtil.java 
 * @Prject: com.hl.util;
 * @Package: com.hl.util; 
 * @Description: TODO
 * @author: hl   
 * @date: 2016年6月25日 上午10:46:10 
 * @version: V1.0   
 */
package com.hl.util;

import java.util.Collection;
import java.util.Map;

/**
 * @ClassName: VerifyUtil
 * @Description: verify is empty util
 * @author: hl
 * @date: 2016年6月25日 上午10:46:10
 */
public final class VerifyUtil
{
    /**
     * @Title:VerifyUtil
     * @Description:TODO
     */
    public VerifyUtil()
    {
        // TODO Auto-generated constructor stub
    }
    
    /**
     * @Title: 判断集合是否为空
     * @Description: TODO
     * @param collection
     * @return 为空：true
     * @return: boolean
     */
    public static boolean isEmpty(Collection<?> collection)
    {
        return (null == collection) || collection.isEmpty();
    }
    
    /**
     * 
     * @Title: 判断对象是否为空
     * @Description: TODO
     * @param object
     * @return 为空：true
     * @return: boolean
     */
    public static boolean isEmpty(Object object)
    {
        return null == object;
        
    }
    
    /**
     * 
     * @Title: 判断map是否为空
     * @Description: TODO
     * @param map
     * @return 为空：true
     * @return: boolean
     */
    public static boolean isEmpty(Map<?, ?> map)
    {
        return null == map || map.isEmpty();
    }
    
    /**
     * 
     * @Title: 判断map中是否含有key
     * @Description: TODO
     * @param map
     * @param key
     * @return 为空：true
     * @return: boolean
     */
    public static boolean isEmpty(Map<?, ?> map, Object key)
    {
        if (isEmpty(map))
        {
            return true;
        }
        else
        {
            return !map.containsKey(key) || null == map.get(key) || "".equals(map.get(key));
        }
    }
    
    /**
     * 
     * @Title: 判断字符串是否为空
     * @Description: TODO
     * @param string
     * @return 为空：true
     * @return: boolean
     */
    public static boolean isEmpty(String string)
    {
        return null == string || string.length() <= 0;
    }
    
    /**
     * 
     * @Title: 判断一维数组是否为空
     * @Description: TODO
     * @param objects
     * @return 为空：true
     * @return: boolean
     */
    public static boolean isEmpty(Object[] objects)
    {
        return objects == null || objects.length == 0;
    }
    
    /**
     * 
     * @Title: 判断二维数组是否为空
     * @Description: TODO
     * @param objects
     * @return 为空：true
     * @return: boolean
     */
    public static boolean isEmpty(Object[][] objects)
    {
        if (objects == null || objects.length == 0)
        {
            return true;
        }
        else
        {
            for (Object[] objecArray : objects)
            {
                if (objecArray.length == 0)
                {
                    return true;
                }
            }
            return false;
        }
    }
    
    /**
     * 
     * @Title: 判断多个参数是否为空
     * @Description: TODO
     * @param objects
     * @return 为空：true
     * @return: boolean
     */
    public static boolean isMultiEmpty(Object... objects)
    {
        if (objects == null)
        {
            return true;
        }
        for (int i = 0; i < objects.length; i++)
        {
            if (objects[i] == null)
            {
                return true;
            }
        }
        return false;
    }
}

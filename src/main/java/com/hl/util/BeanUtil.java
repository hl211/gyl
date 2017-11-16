/**   
 * Copyright © 2017 公司名. All rights reserved.
 * 
 * @Title: BeanUtil.java 
 * @Prject: gyl
 * @Package: com.hl.util 
 * @Description: TODO
 * @author: hl   
 * @date: 2017年11月16日 下午9:42:45 
 * @version: V1.0   
 */
package com.hl.util;

import java.util.List;

import com.github.pagehelper.Page;

/**
 * @ClassName: BeanUtil
 * @Description: TODO
 * @author: hl
 * @date: 2017年11月16日 下午9:42:45
 */
public class BeanUtil
{
    public static <T> PagedResult<T> toPagedResult(List<T> datas)
    {
        PagedResult<T> result = new PagedResult<T>();
        if (datas instanceof Page)
        {
           
            Page page = (Page)datas;
            result.setPageNo(page.getPageNum());
            result.setPageSize(page.getPageSize());
            result.setDataList(page.getResult());
            result.setTotal(page.getTotal());
            result.setPages(page.getPages());
        }
        else
        {
            result.setPageNo(1);
            result.setPageSize(datas.size());
            result.setDataList(datas);
            result.setTotal(datas.size());
        }
        
        return result;
    }
}

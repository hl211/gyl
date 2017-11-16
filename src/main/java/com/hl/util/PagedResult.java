/**   
 * Copyright © 2017 公司名. All rights reserved.
 * 
 * @Title: PagedResult.java 
 * @Prject: gyl
 * @Package: com.hl.util 
 * @Description: TODO
 * @author: hl   
 * @date: 2017年11月16日 下午9:39:46 
 * @version: V1.0   
 */
package com.hl.util;

import java.util.List;

/** 
 * @ClassName: PagedResult 
 * @Description: TODO
 * @author: hl
 * @date: 2017年11月16日 下午9:39:46  
 */
public class PagedResult<T> extends BaseEntity
{
   

    /**
     * @fieldName: serialVersionUID
     * @fieldType: long
     * @Description: TODO
     */
    private static final long serialVersionUID = 3597904881830013521L;

    private List<T> dataList;//数据
    
    private long pageNo;//当前页
    
    private long pageSize;//条数
    
    private long total;//总条数
    
    private long pages;//总页面数目

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    public long getPageNo() {
        return pageNo;
    }

    public void setPageNo(long pageNo) {
        this.pageNo = pageNo;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }

    
}

/**   
 * Copyright © 2017 公司名. All rights reserved.
 * 
 * @Title: BaseController.java 
 * @Prject: gyl
 * @Package: com.hl.controller 
 * @Description: TODO
 * @author: hl   
 * @date: 2017年11月29日 下午9:21:26 
 * @version: V1.0   
 */
package com.hl.controller;

import com.alibaba.fastjson.JSON;
import com.hl.common.PageResultPojo;

/** 
 * @ClassName: Controller的基类 
 * @Description: TODO
 * @author: hl
 * @date: 2017年11月29日 下午9:21:26  
 */
public class BaseController
{

    public  String returnSuccess(Object object) {
        PageResultPojo<Object> result = new PageResultPojo<Object>();
        result.setFlag(true);
        result.setMsg("成功");
        result.setData(object);
        return JSON.toJSONString(result);
    }


//    public static Result success() {
//        return success(null);
//    }
//
//
//    public static Result error(Integer code, String msg) {
//        Result result = new Result();
//        result.setCode(code);
//        result.setMsg(msg);
//        result.setData(object);
//        return result;
//    }
}

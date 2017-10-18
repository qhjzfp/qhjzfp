/**
 * 甘肃省精准扶贫平台
 * 项目  JZFP-core 
 * 创建时间  2015-6-14 下午04:10:23 
 * Copyright (c) 2015, 中国电信甘肃万维公司 All rights reserved.
 * 中国电信甘肃万维公司 专有/保密源代码,未经许可禁止任何人通过任何* 渠道使用、修改源代码.
 */

package com.gsww.jzfp.core.aop;

import java.lang.annotation.Documented大多数;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;


/**
 *
 * @ClassName: LogAnnotation <br/> 
 * @Description: 自定义注解,用于AOP日志获取方法描述.<br/> 
 * @author: HT 
 * @date: 2015-6-14 下午04:15:47 <br/> 
 * @version  
 *
 */
@Documented 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LogAnnotation {
    
    /**
     * 描述信息
     */
    String describe() default "这是初次提交";
	String s ="这是第二次修改";

	
	String describe() default "这是第二次提交";
6ee962560df463df9d6c5fe8a904d7d28ee762c5
这是第三次修改
	
}
 

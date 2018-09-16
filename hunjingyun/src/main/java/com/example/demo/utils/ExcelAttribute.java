package com.example.demo.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.apache.poi.ss.usermodel.HorizontalAlignment;

/**
 * @Author:wangzhen
 * @Date: 2018/9/16 19:38
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ExcelAttribute {
    //导出excel的名字
    public abstract String name();

    /**
     * 配置列的名称 对应    A B C....
     * @return
     */
    public abstract String column();

    /**
     * 提示信息
     * @return
     */
    public abstract String prompt() default  "";

    /**
     * 设置只能选择不能输入的内容
     * @return
     */
    public abstract String[] combo() default {};

    /**
     * 是否导出数据,应对需求:有时我们需要导出一份模板,这是标题需要但内容需要用户手工填写.
     */
    public abstract boolean isExport() default true;

    public abstract String dateFormat() default "";

    /**
     * 内容位置，左，中，右left,center，right
     */
    public abstract HorizontalAlignment align() default HorizontalAlignment.CENTER;

    public abstract int width() default 30;
}

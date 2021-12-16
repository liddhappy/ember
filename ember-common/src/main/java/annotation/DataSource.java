package annotation;

import enums.DataSourceType;

import java.lang.annotation.*;

/**
 * @ClassName DataSource
 * @Description 数据源
 * @Author liddhappy
 * @Date 2021/12/16 15:38
 * @Version 1.8
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface DataSource {
    /**
     * 切换数据源名称
     */
    public DataSourceType value() default DataSourceType.MASTER;
}

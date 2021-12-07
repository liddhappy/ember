package domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * @ClassName BaseEntity
 * @Description Entity基础类
 * @Author liddhappy
 * @Date 2021/12/7 10:44
 * @Version 1.8
 */
public class BaseEntity implements Serializable {
    /**
     * 序列化
     */
    private static final long serialVersionUID = 1L;
    /** 搜索值 */
    private String searchValue;

    /** 创建者 */
    private String createBy;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 更新者 */
    private String updateBy;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /** 备注 */
    private String remark;

    /** 请求参数 */
    private Map<String, Object> params;
}

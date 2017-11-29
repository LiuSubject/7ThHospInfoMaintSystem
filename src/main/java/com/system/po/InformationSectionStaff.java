package com.system.po;

/**
 *
 * 项目名称：绍兴第七人民医院信息维护系统
 * 类名称：InformationSectionStaff
 * 类描述：信息科人员pojo
 * 创建人：lxk
 * 创建时间：2017-11-29 14:01:44
 * 修改人：
 * 修改时间：
 * 修改备注：
 * @version
 *
 */

public class InformationSectionStaff {
    private Integer id;

    private String code;

    private String name;

    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}
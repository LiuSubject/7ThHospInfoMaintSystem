package com.system.po;

/**
 *
 * 项目名称：绍兴第七人民医院信息维护系统
 * 类名称：Menu
 * 类描述：菜单pojo
 * 创建人：lxk
 * 创建时间：2017-11-29 14:01:44
 * 修改人：
 * 修改时间：
 * 修改备注：
 * @version
 *
 */

public class Menu {
    private Integer id;

    private String name;

    private String url;

    private Integer pid;

    private String icon;

    private Integer location;

    private Integer sort;

    private Integer tType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer gettType() {
        return tType;
    }

    public void settType(Integer tType) {
        this.tType = tType;
    }
}
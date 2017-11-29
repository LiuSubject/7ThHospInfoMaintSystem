package com.system.po;

/**
 *
 * 项目名称：绍兴第七人民医院信息维护系统
 * 类名称：MaType
 * 类描述：问题-负责人pojo
 * 创建人：lxk
 * 创建时间：2017-11-29 14:01:44
 * 修改人：
 * 修改时间：
 * 修改备注：
 * @version
 *
 */

public class MaType {
    private Integer id;

    private String name;

    private String leader;

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

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader == null ? null : leader.trim();
    }
}
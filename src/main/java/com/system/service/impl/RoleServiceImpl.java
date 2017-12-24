package com.system.service.impl;

import com.system.mapper.RoleMapper;
import com.system.po.Role;
import com.system.po.RoleExample;
import com.system.po.Userlogin;
import com.system.po.UserloginExample;
import com.system.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：RoleServiceImpl
 * 类描述：Role 权限表Service层具体实现
 * 创建人：lxk
 * 创建时间：2017-12-3 14:52:22
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    public List<Role> findByRoleId(String roleId) throws Exception {
        RoleExample roleExample = new RoleExample();

        RoleExample.Criteria criteria = roleExample.createCriteria();
        criteria.andRoleidEqualTo(roleId);

        List<Role> list = roleMapper.selectByExample(roleExample);

        return list;
    }

    public List<Role> findByRoleName(String roleName) throws Exception {
        RoleExample roleExample = new RoleExample();

        RoleExample.Criteria criteria = roleExample.createCriteria();
        criteria.andRolenameEqualTo(roleName);

        List<Role> list = roleMapper.selectByExample(roleExample);

        return list;
    }
}

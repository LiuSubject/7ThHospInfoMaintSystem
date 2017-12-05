package com.system.realm;

import com.system.po.Role;
import com.system.po.ViewEmployeeMiPsd;
import com.system.service.RoleService;
import com.system.service.ViewEmployeeMiPsdService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：LoginRealm
 * 类描述：登录相关身份信息
 * 创建人：lxk
 * 创建时间：2017-12-01 19:24
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
@Component
public class LoginRealm extends AuthorizingRealm{


    @Resource(name = "roleServiceImpl")
    private RoleService roleService;

    @Resource(name = "viewEmployeeMiPsdServiceImpl")
    private ViewEmployeeMiPsdService viewEmployeeMiPsdService;

    /**
     *      获取身份信息，我们可以在这个方法中，从数据库获取该用户的权限和角色信息
     *      当调用权限验证时，就会调用此方法
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        String code = (String) getAvailablePrincipal(principalCollection);

        Role role = null;

        try {
            ViewEmployeeMiPsd viewEmployeeMiPsd = viewEmployeeMiPsdService.findByCode(code);
            //获取角色对象
            role = roleService.findByid(Integer.parseInt(viewEmployeeMiPsd.getCode()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //通过用户名从数据库获取权限/角色信息
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Set<String> r = new HashSet<String>();
        if (role != null) {
            r.add(role.getRolename());
            info.setRoles(r);
        }

        return info;
    }

    /**
     * 在这个方法中，进行身份验证
     * login时调用
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //工号
        String code = (String) token.getPrincipal();
        //密码
        String password = new String((char[])token.getCredentials());

        ViewEmployeeMiPsd viewEmployeeMiPsd = null;
        try {
            viewEmployeeMiPsd = viewEmployeeMiPsdService.findByCode(code);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (viewEmployeeMiPsd == null) {
            //没有该用户名
            throw new UnknownAccountException();
        } else if (!password.equals(viewEmployeeMiPsd.getPsd())) {
            //密码错误
            throw new IncorrectCredentialsException();
        }

        //身份验证通过,返回一个身份信息
        AuthenticationInfo aInfo = new SimpleAuthenticationInfo(code,password,getName());

        return aInfo;
    }
}

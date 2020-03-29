package com.kehai.realm;

import com.kehai.pojo.SysUser;
import com.kehai.service.RoleService;
import com.kehai.service.SysMenuService;
import com.kehai.service.SysUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private SysUserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private SysMenuService menuService;
    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        final SysUser user = (SysUser) principalCollection.getPrimaryPrincipal();
        final Long userId = user.getUserId();
        final List<String> roles = roleService.findRolesNameByUserID(userId);
        final List<String> perms = menuService.findPermsByUserID(userId);

        final SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRoles(roles);
        info.addStringPermissions(perms);
        return info;
    }
    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        final UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        final String username = token.getUsername();
        final String password = new String(token.getPassword());
        final SysUser userByName = userService.findUserByName(username);

        if(userByName==null){
            throw  new  UnknownAccountException("用户不存在");
        }
        if(!userByName.getPassword().equals(password)){
            throw  new  IncorrectCredentialsException("密码不匹配");
        }

        if(userByName.getStatus()==0){
            throw new  LockedAccountException("用户被冻结");
        }
        final SimpleAuthenticationInfo  info = new SimpleAuthenticationInfo(userByName, password, this.getName());

        return info;
    }
}

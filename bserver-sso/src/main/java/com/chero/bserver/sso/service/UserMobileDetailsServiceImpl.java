//package com.chero.bserver.sso.service;
//
//import com.chero.bserver.sso.model.pojo.domain.UserPO;
//import com.chero.bserver.sso.model.service.UserService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import java.util.List;
//import java.util.Map;
//
///**
// * Created by hxh on 2018/3/28.
// */
//@Slf4j
//public class UserMobileDetailsServiceImpl implements UserDetailsService {
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see org.springframework.com.chero.server.sleep.security.com.chero.server.sleep.security.core.userdetails.UserDetailsService#
//     * loadUserByUsername(java.lang.String)
//     */
//
//    @Autowired
//    private UserService userService;
//
//
//    @Override
//    public UserDetails loadUserByUsername(String mobile) throws UsernameNotFoundException {
//
//        Map<String, Object> map = userService.getAuthByMobile(mobile);
//        log.warn("现在正在使用默认用户登录安全配置");
//        log.info("【load用户名】={}", mobile);
//
//
//        UserPO user = (UserPO)map.get("user");
//        if (user == null) {
//            throw new RuntimeException("用户" + mobile + "信息不存在！");
//        }
//        List<String> allRoles = (List<String>) map.get("allRoles");
////        Iterator<String> iter = allRoles.iterator();
////        List<GrantedAuthority> allGrantedAuthority = new ArrayList<>();
////        while (iter.hasNext()) {
////            allGrantedAuthority.add(new SimpleGrantedAuthority(iter.next()));
////        }
//        return new User(mobile, user.getPassword(), AuthorityUtils.createAuthorityList((String [])allRoles.toArray(new String[allRoles.size()])));
//
////        throw new RuntimeException("用户名错误");
//    }
//
//}

package com.chero.bserver.sso.convert;

import com.chero.bserver.sso.model.pojo.po.ClientPO;
import com.chero.bserver.sso.model.pojo.domain.ClientDO;
import org.apache.commons.lang.StringUtils;
import org.springframework.security.core.authority.AuthorityUtils;

import java.util.Arrays;

/**
 * Created by hxh on 2018/5/23.
 */
public class ClientConverter extends CheroConverter<ClientPO, ClientDO>{

    private ClientConverter(Class<ClientPO> clazzI, Class<ClientDO> clazzO) {
        super(clazzI, clazzO);
    }

    @Override
    protected ClientDO doForward(ClientPO clientPO) {
        ClientDO clientDO = new ClientDO();
        // 客户端账号
        clientDO.setClientId(clientPO.getClientId());
        // 客户端密码
        clientDO.setClientSecret(clientPO.getClientSecret());
        // 是否能使用（true能使用，false停用）
        clientDO.setEnabled(clientPO.getEnabled());
        // accessToken时效
        clientDO.setAccessTokenValiditySeconds(99999);
        // refreshToken时效
        clientDO.setRefreshTokenValiditySeconds(99999);
        // 授权方式（密码 ， 授权码...）
        String[] authorizedGrantTypes = StringUtils.split(clientPO.getAuthorizedGrantTypes(), ",");
        clientDO.setAuthorizedGrantTypes(Arrays.asList(authorizedGrantTypes));
        // 授权权限
        clientDO.setAuthorities(AuthorityUtils.commaSeparatedStringToAuthorityList(clientPO.getAuthorities()));
        // scope
        String[] scope = StringUtils.split(clientPO.getScope(), ",");
        clientDO.setScope(Arrays.asList(scope));
        // resourceIds
        String[] resourceIds = StringUtils.split(clientPO.getResourceIds(), ",");
        clientDO.setResourceIds(Arrays.asList(resourceIds));
        //不知道什么用
        clientDO.setAutoApproveScopes(clientDO.getScope());
        //不知道什么用
        //        clientDO.setAutoApproveScopes();
//        clientDO.setAdditionalInformation();
//        clientDO.setRegisteredRedirectUri();
        return clientDO;
    }

    public static final ClientConverter INSTANCE = new ClientConverter(ClientPO.class, ClientDO.class);
}

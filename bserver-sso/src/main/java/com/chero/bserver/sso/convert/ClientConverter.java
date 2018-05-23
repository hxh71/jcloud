package com.chero.bserver.sso.convert;

import com.chero.bserver.sso.model.pojo.domain.ClientPO;
import com.chero.bserver.sso.model.pojo.domain.MenuDTO;
import com.chero.bserver.sso.model.pojo.domain.MenuPO;
import com.chero.bserver.sso.model.pojo.dto.ClientDTO;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.security.core.authority.AuthorityUtils;

import java.util.Arrays;

/**
 * Created by hxh on 2018/5/23.
 */
public class ClientConverter extends CheroConverter<ClientPO, ClientDTO>{

    private ClientConverter(Class<ClientPO> clazzI, Class<ClientDTO> clazzO) {
        super(clazzI, clazzO);
    }

    @Override
    protected ClientDTO doForward(ClientPO clientPO) {
        ClientDTO clientDTO = new ClientDTO();
        // 客户端账号
        clientDTO.setClientId(clientPO.getClientId());
        // 客户端密码
        clientDTO.setClientSecret(clientPO.getClientSecret());
        // 是否被锁
        clientDTO.setLocked(clientPO.getLocked());
        // accessToken时效
        clientDTO.setAccessTokenValiditySeconds(9999);
        // refreshToken时效
        clientDTO.setRefreshTokenValiditySeconds(9999);
        // 授权方式（密码 ， 授权码...）
        String[] authorizedGrantTypes = StringUtils.split(clientPO.getAuthorizedGrantTypes(), ",");
        clientDTO.setAuthorizedGrantTypes(Arrays.asList(authorizedGrantTypes));
        // 授权权限
        clientDTO.setAuthorities(AuthorityUtils.commaSeparatedStringToAuthorityList(clientPO.getAuthorities()));
        // scope
        String[] scope = StringUtils.split(clientPO.getScope(), ",");
        clientDTO.setScope(Arrays.asList(scope));
        // resourceIds
        String[] resourceIds = StringUtils.split(clientPO.getResourceIds(), ",");
        clientDTO.setResourceIds(Arrays.asList(resourceIds));
        //不知道什么用
        //        clientDTO.setAutoApproveScopes();
//        clientDTO.setAdditionalInformation();
//        clientDTO.setRegisteredRedirectUri();
        return clientDTO;
    }

    public static final ClientConverter INSTANCE = new ClientConverter(ClientPO.class, ClientDTO.class);
}

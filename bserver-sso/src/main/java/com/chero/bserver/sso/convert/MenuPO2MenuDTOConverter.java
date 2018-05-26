package com.chero.bserver.sso.convert;

import com.chero.bserver.sso.model.pojo.dto.MenuDTO;
import com.chero.bserver.sso.model.pojo.domain.MenuPO;

/**
 * Created by hxh on 2018/5/21.
 */
public class MenuPO2MenuDTOConverter extends CheroConverter<MenuPO, MenuDTO> {


    private MenuPO2MenuDTOConverter(Class<MenuPO> clazzI, Class<MenuDTO> clazzO) {
        super(clazzI, clazzO);
    }

    @Override
    protected MenuPO doBackward(MenuDTO menuDTO) {
        return new MenuPO();
    }

    public static final MenuPO2MenuDTOConverter INSTANCE = new MenuPO2MenuDTOConverter(MenuPO.class, MenuDTO.class);


}

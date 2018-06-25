package com.chero.bserver.sso.convert;

import com.chero.bserver.sso.model.pojo.domain.MenuDO;
import com.chero.bserver.sso.model.pojo.po.MenuPO;

/**
 * Created by hxh on 2018/5/21.
 */
public class MenuPO2MenuDTOConverter extends CheroConverter<MenuPO, MenuDO> {


    private MenuPO2MenuDTOConverter(Class<MenuPO> clazzI, Class<MenuDO> clazzO) {
        super(clazzI, clazzO);
    }

    @Override
    protected MenuPO doBackward(MenuDO menuDO) {
        return new MenuPO();
    }

    public static final MenuPO2MenuDTOConverter INSTANCE = new MenuPO2MenuDTOConverter(MenuPO.class, MenuDO.class);


}

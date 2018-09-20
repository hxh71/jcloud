package com.chero.bserver.sso.convert;

import com.google.common.base.Converter;
import com.sun.istack.internal.Nullable;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author hxh
 * @date 2018/5/21
 */
public abstract class CheroConverter<I , O> extends Converter<I, O> {
    Class<I> clazzI;
    Class<O> clazzO;

    protected CheroConverter(Class<I> clazzI, Class<O> clazzO) {
        this.clazzI = clazzI;
        this.clazzO = clazzO;
    }

    private CheroConverter() {}

    private O createO(Class<O> clazz){
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        throw new AssertionError("createO error");
    }

    private I createI(Class<I> clazz){
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        throw new AssertionError("createI error");
    }

    @Override
    protected O doForward(I i) {
        O o = createO(clazzO);
        BeanUtils.copyProperties(i, o);
        return o;
    }

    @Override
    protected I doBackward(O o) {
        I i = createI(clazzI);
        BeanUtils.copyProperties(o, i);
        return i;
    }

    /**
     * list转换
     *
     * @param
     * @return
     */
    public List<O> convert(@Nullable Collection<I> iList) {

        return iList.stream().map(e ->
                convert(e)
        ).collect(Collectors.toList());
    }

    /**
     * page转换
     *
     * @param iPage
     * @return
     */
    public Page<O> convert(@Nullable Page<I> iPage) {
        List<I> iList = iPage.getContent();
        Pageable pageable = new PageRequest(iPage.getNumber(), iPage.getSize(), iPage.getSort());
        Page<O> oPage = new PageImpl(convert(iList), pageable, iPage.getTotalElements());
        return oPage;
    }

    /**
     * 反转
     */
    public I reverseConvert(@Nullable O o) {
        return super.reverse().convert(o);
    }
    public List<I> reverseConvert(@Nullable List<O> oList) {
        return oList.stream().map(e ->
                reverseConvert(e)
        ).collect(Collectors.toList());
    }
    public Page<I> reverseConvert(@Nullable Page<O> oPage) {
        List<O> oList = oPage.getContent();
        Pageable pageable = new PageRequest(oPage.getNumber(), oPage.getSize(), oPage.getSort());
        Page<I> iPage = new PageImpl(reverseConvert(oList), pageable, oPage.getTotalElements());
        return iPage;
    }


}

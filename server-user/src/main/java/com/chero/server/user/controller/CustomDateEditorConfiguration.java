package com.chero.server.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


//@Configuration
public class CustomDateEditorConfiguration {

    /**
     * 让配置在request请求时生效
     */
    @Autowired
    public void setWebBindingInitializer(RequestMappingHandlerAdapter requestMappingHandlerAdapter) {
        requestMappingHandlerAdapter.setWebBindingInitializer(new CustomDateWebBindingInitializer());

    }
    /**
     * 扩展web初始化的配置
     */
    class CustomDateWebBindingInitializer implements WebBindingInitializer {

        /**
         * @see org.springframework.web.bind.support.WebBindingInitializer#initBinder(org.springframework.web.bind.WebDataBinder,
         *      org.springframework.web.context.request.WebRequest)
         */
        @Override
        public void initBinder(WebDataBinder binder, WebRequest request) {
            binder.registerCustomEditor(Date.class, new CustomDateEditor(true, 13));
        }

    }
    /**
     * 扩展类型转换
     */
    class CustomDateEditor extends PropertyEditorSupport {

        private boolean allowEmpty;
        private int exactDateLength;

        CustomDateEditor(boolean allowEmpty, int exactDateLength) {
            this.allowEmpty = allowEmpty;
            this.exactDateLength = exactDateLength;
        }

        /**
         * @see java.beans.PropertyEditorSupport#setAsText(java.lang.String)
         */
        @Override
        public void setAsText(String text) throws IllegalArgumentException {
            if (allowEmpty && !StringUtils.hasText(text)) {
                setValue(null);
            } else if (text != null && this.exactDateLength >= 0 && text.length() != this.exactDateLength) {
                throw new IllegalArgumentException("Could not parse date: it is not exactly" + this.exactDateLength + "characters long");
            } else {
                setValue(new Date(Long.valueOf(text)));
            }
        }

        /**
         * @see java.beans.PropertyEditorSupport#getAsText()  //这个不作用在json返回
         */
        @Override
        public String getAsText() {
            Date value = (Date) getValue();
            return (value != null ? String.valueOf(TimeUnit.MILLISECONDS.toSeconds(value.getTime())) : "");
        }

    }

}






package com.chero.common.utils;


import com.chero.common.pojo.vo.PageVO;
import com.chero.common.pojo.vo.ResultVO;
import org.springframework.data.domain.Page;

/**
 * Created by hxh
 * 2017-12-09 22:53
 */
public class ResultVOUtil {
    public static ResultVO success(Object object, String message, PageVO pageVO){
        ResultVO resultVO = new ResultVO();
        resultVO.setStatus(0);
        resultVO.setMessage(message);
        resultVO.setContent(object);
        resultVO.setPage(pageVO);
        return resultVO;
    }
    public static ResultVO success(Object object, PageVO pageVO){
        return success(object,"成功",pageVO);
    }
    public static ResultVO success(Object object, String message){
        return success(object,message,null);
    }
    public static ResultVO success(Object object){
        return success(object,"成功",null);
    }
    public static ResultVO success(String message){
        return success(null,message,null);
    }

    public static ResultVO success(){
        return success(null,"成功",null);
    }

    public static ResultVO success(Page page){
        PageVO pageVO = pageConvertToPageVO(page);
        ResultVO resultVO = new ResultVO();
        resultVO.setStatus(0);
        resultVO.setMessage("成功");
        resultVO.setContent(page.getContent());
        resultVO.setPage(pageVO);

        return resultVO;
    }

    public static ResultVO error(Integer status,String message,String content){
        ResultVO resultVO = new ResultVO();
        resultVO.setStatus(status);
        resultVO.setMessage(message);
        resultVO.setContent(content);
        resultVO.setPage(null);
        return resultVO;
    }
    public static ResultVO error(Integer status,String message){
        return error(status,message,null);

    }
    public static ResultVO error(){

        return error(-1,"未知错误");
    }

    private static PageVO pageConvertToPageVO(Page page){
        PageVO pageVO = new PageVO();
        pageVO.setSize(page.getSize());
        pageVO.setNumber(page.getNumber());
        pageVO.setTotalElements(page.getTotalElements());
        pageVO.setTotalPages(page.getTotalPages());
        return pageVO;
    }
}

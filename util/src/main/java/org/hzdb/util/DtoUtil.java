package org.hzdb.util;

import org.hzdb.beans.pojo.dto.OutDto;

public class DtoUtil {

        /*
            返回成功不带数据的DTO
            返回成功带数据的DTO
            返回失败不带数据的DTO
            返回失败带数据的DTO
            返回异常不带数据的DTO
         */
        public static OutDto getSuccessDto(String msg){
            return getSuccessWithData(msg,null);
        }

        public static OutDto getSuccessWithData(String msg,Object data){
            OutDto dto=new OutDto();
            dto.setSuccess("true");
            dto.setErrorCode("0");
            dto.setMsg(msg);
            dto.setData(data);
            return dto;
        }

        public static OutDto getErrorDto(String msg,String errorCode){
            OutDto dto=new OutDto();
            dto.setSuccess("false");
            dto.setErrorCode(errorCode);
            dto.setMsg(msg);
            return dto;
        }


}

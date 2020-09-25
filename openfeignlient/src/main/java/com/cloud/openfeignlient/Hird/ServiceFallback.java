package com.cloud.openfeignlient.Hird;

import com.cloud.common.entity.RestfulResult;
import com.cloud.openfeignlient.service.UserClienta;

public class ServiceFallback implements UserClienta

{
    @Override
    public String getUserName(String userId) {
//        RestfulResult result = new RestfulResult();
//        result.setData1("服务调用失败");
        String result="服务调用失败";
        return result;

    }
}

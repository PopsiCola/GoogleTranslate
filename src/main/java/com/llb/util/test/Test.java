package com.llb.util.test;

import com.llb.util.api.GoogleApi;

/**
 * Ceate By llb on 2019/7/25
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // 普通方式初始化
        GoogleApi googleApi = new GoogleApi();
        // 通过代理
        //        GoogleApi googleApi = new GoogleApi("122.224.227.202", 3128);
        String result = googleApi.translate("我爱你",  "En");
        System.out.println(result);
    }
}

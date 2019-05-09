package com.ws.client;

import com.ws.client.util.WsUtils;

/**
 * @author xinput
 * @date 2018-10-13 12:07
 */
public class AppClient {
    public static void main(String[] args) {
        String message = "测试";
        try {
            Object[] objects = WsUtils.wsXiangYaService(message);
            System.out.println(String.valueOf(objects[0]));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

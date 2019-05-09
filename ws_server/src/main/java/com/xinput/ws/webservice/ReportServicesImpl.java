package com.xinput.ws.webservice;

import javax.jws.WebService;

/**
 * @author xinput
 * @date 2018-06-22 20:51
 */
@WebService(endpointInterface = "com.xinput.ws.webservice.ReportServices", serviceName = "ReportServices")
public class ReportServicesImpl implements ReportServices {

    @Override
    public String jtptCommonWebService(String message) {
        return "success: " + message;
    }
}

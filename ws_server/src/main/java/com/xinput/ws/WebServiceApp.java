package com.xinput.ws;

import com.xinput.ws.webservice.ReportServices;
import com.xinput.ws.webservice.ReportServicesImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.ws.Endpoint;

/**
 * 启动后访问 http://127.0.0.1:8092/ReportServices?wsdl
 *
 * @author yuanlai
 */
public class WebServiceApp {

    private final static Logger logger = LoggerFactory.getLogger(WebServiceApp.class);

    private final static String address = "http://127.0.0.1:8092/ReportServices";

    public static void main(String[] args) {
        logger.info("web service start");
        ReportServices reportServices = new ReportServicesImpl();
        Endpoint.publish(address, reportServices);
        logger.info("web service started");
    }
}

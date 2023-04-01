package webservice;

import javax.xml.ws.Endpoint;

public class SoapPublisher {

    public static final String WS_URL = "http://localhost:8080/ws/users";
    //duong dan truy cap xem du lieu la WS_URL + '?wsdl' : "http://localhost:8080/ws/users?wsdl"

    public static void main(String[] args) {
        Endpoint.publish(WS_URL, new UserServiceImpl());
    }
}

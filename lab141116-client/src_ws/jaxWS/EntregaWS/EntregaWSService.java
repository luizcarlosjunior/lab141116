
package jaxWS.EntregaWS;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EntregaWSService", targetNamespace = "http://jaxWS/", wsdlLocation = "http://localhost:8080/lab141116/EntregaWS?wsdl")
public class EntregaWSService
    extends Service
{

    private final static URL ENTREGAWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException ENTREGAWSSERVICE_EXCEPTION;
    private final static QName ENTREGAWSSERVICE_QNAME = new QName("http://jaxWS/", "EntregaWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/lab141116/EntregaWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ENTREGAWSSERVICE_WSDL_LOCATION = url;
        ENTREGAWSSERVICE_EXCEPTION = e;
    }

    public EntregaWSService() {
        super(__getWsdlLocation(), ENTREGAWSSERVICE_QNAME);
    }

    public EntregaWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ENTREGAWSSERVICE_QNAME, features);
    }

    public EntregaWSService(URL wsdlLocation) {
        super(wsdlLocation, ENTREGAWSSERVICE_QNAME);
    }

    public EntregaWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ENTREGAWSSERVICE_QNAME, features);
    }

    public EntregaWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EntregaWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EntregaWS
     */
    @WebEndpoint(name = "EntregaWSPort")
    public EntregaWS getEntregaWSPort() {
        return super.getPort(new QName("http://jaxWS/", "EntregaWSPort"), EntregaWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EntregaWS
     */
    @WebEndpoint(name = "EntregaWSPort")
    public EntregaWS getEntregaWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jaxWS/", "EntregaWSPort"), EntregaWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ENTREGAWSSERVICE_EXCEPTION!= null) {
            throw ENTREGAWSSERVICE_EXCEPTION;
        }
        return ENTREGAWSSERVICE_WSDL_LOCATION;
    }

}

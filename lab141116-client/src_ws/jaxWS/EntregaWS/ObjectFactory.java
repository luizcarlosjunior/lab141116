
package jaxWS.EntregaWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jaxWS.EntregaWS package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EntregaWSResponse_QNAME = new QName("http://jaxWS/", "EntregaWSResponse");
    private final static QName _EntregaWS_QNAME = new QName("http://jaxWS/", "EntregaWS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jaxWS.EntregaWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EntregaWSResponse }
     * 
     */
    public EntregaWSResponse createEntregaWSResponse() {
        return new EntregaWSResponse();
    }

    /**
     * Create an instance of {@link EntregaWS_Type }
     * 
     */
    public EntregaWS_Type createEntregaWS_Type() {
        return new EntregaWS_Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntregaWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS/", name = "EntregaWSResponse")
    public JAXBElement<EntregaWSResponse> createEntregaWSResponse(EntregaWSResponse value) {
        return new JAXBElement<EntregaWSResponse>(_EntregaWSResponse_QNAME, EntregaWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntregaWS_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS/", name = "EntregaWS")
    public JAXBElement<EntregaWS_Type> createEntregaWS(EntregaWS_Type value) {
        return new JAXBElement<EntregaWS_Type>(_EntregaWS_QNAME, EntregaWS_Type.class, null, value);
    }

}

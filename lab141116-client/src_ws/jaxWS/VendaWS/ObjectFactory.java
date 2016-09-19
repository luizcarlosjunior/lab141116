
package jaxWS.VendaWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jaxWS.VendaWS package. 
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

    private final static QName _VendaWS_QNAME = new QName("http://jaxWS/", "VendaWS");
    private final static QName _VendaWSResponse_QNAME = new QName("http://jaxWS/", "VendaWSResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jaxWS.VendaWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VendaWS_Type }
     * 
     */
    public VendaWS_Type createVendaWS_Type() {
        return new VendaWS_Type();
    }

    /**
     * Create an instance of {@link VendaWSResponse }
     * 
     */
    public VendaWSResponse createVendaWSResponse() {
        return new VendaWSResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendaWS_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS/", name = "VendaWS")
    public JAXBElement<VendaWS_Type> createVendaWS(VendaWS_Type value) {
        return new JAXBElement<VendaWS_Type>(_VendaWS_QNAME, VendaWS_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendaWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS/", name = "VendaWSResponse")
    public JAXBElement<VendaWSResponse> createVendaWSResponse(VendaWSResponse value) {
        return new JAXBElement<VendaWSResponse>(_VendaWSResponse_QNAME, VendaWSResponse.class, null, value);
    }

}

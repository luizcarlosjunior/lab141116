
package jaxWS.ProdutoWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jaxWS.ProdutoWS package. 
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

    private final static QName _ProdutoWSAtualizarResponse_QNAME = new QName("http://jaxWS/", "ProdutoWSAtualizarResponse");
    private final static QName _ProdutoWSCriarResponse_QNAME = new QName("http://jaxWS/", "ProdutoWSCriarResponse");
    private final static QName _ProdutoWSLerResponse_QNAME = new QName("http://jaxWS/", "ProdutoWSLerResponse");
    private final static QName _ProdutoWSCriar_QNAME = new QName("http://jaxWS/", "ProdutoWSCriar");
    private final static QName _ProdutoWSApagar_QNAME = new QName("http://jaxWS/", "ProdutoWSApagar");
    private final static QName _ProdutoWSApagarResponse_QNAME = new QName("http://jaxWS/", "ProdutoWSApagarResponse");
    private final static QName _ProdutoWSLer_QNAME = new QName("http://jaxWS/", "ProdutoWSLer");
    private final static QName _ProdutoWSAtualizar_QNAME = new QName("http://jaxWS/", "ProdutoWSAtualizar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jaxWS.ProdutoWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProdutoWSCriarResponse }
     * 
     */
    public ProdutoWSCriarResponse createProdutoWSCriarResponse() {
        return new ProdutoWSCriarResponse();
    }

    /**
     * Create an instance of {@link ProdutoWSAtualizarResponse }
     * 
     */
    public ProdutoWSAtualizarResponse createProdutoWSAtualizarResponse() {
        return new ProdutoWSAtualizarResponse();
    }

    /**
     * Create an instance of {@link ProdutoWSCriar }
     * 
     */
    public ProdutoWSCriar createProdutoWSCriar() {
        return new ProdutoWSCriar();
    }

    /**
     * Create an instance of {@link ProdutoWSLerResponse }
     * 
     */
    public ProdutoWSLerResponse createProdutoWSLerResponse() {
        return new ProdutoWSLerResponse();
    }

    /**
     * Create an instance of {@link ProdutoWSApagarResponse }
     * 
     */
    public ProdutoWSApagarResponse createProdutoWSApagarResponse() {
        return new ProdutoWSApagarResponse();
    }

    /**
     * Create an instance of {@link ProdutoWSApagar }
     * 
     */
    public ProdutoWSApagar createProdutoWSApagar() {
        return new ProdutoWSApagar();
    }

    /**
     * Create an instance of {@link ProdutoWSAtualizar }
     * 
     */
    public ProdutoWSAtualizar createProdutoWSAtualizar() {
        return new ProdutoWSAtualizar();
    }

    /**
     * Create an instance of {@link ProdutoWSLer }
     * 
     */
    public ProdutoWSLer createProdutoWSLer() {
        return new ProdutoWSLer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoWSAtualizarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS/", name = "ProdutoWSAtualizarResponse")
    public JAXBElement<ProdutoWSAtualizarResponse> createProdutoWSAtualizarResponse(ProdutoWSAtualizarResponse value) {
        return new JAXBElement<ProdutoWSAtualizarResponse>(_ProdutoWSAtualizarResponse_QNAME, ProdutoWSAtualizarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoWSCriarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS/", name = "ProdutoWSCriarResponse")
    public JAXBElement<ProdutoWSCriarResponse> createProdutoWSCriarResponse(ProdutoWSCriarResponse value) {
        return new JAXBElement<ProdutoWSCriarResponse>(_ProdutoWSCriarResponse_QNAME, ProdutoWSCriarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoWSLerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS/", name = "ProdutoWSLerResponse")
    public JAXBElement<ProdutoWSLerResponse> createProdutoWSLerResponse(ProdutoWSLerResponse value) {
        return new JAXBElement<ProdutoWSLerResponse>(_ProdutoWSLerResponse_QNAME, ProdutoWSLerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoWSCriar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS/", name = "ProdutoWSCriar")
    public JAXBElement<ProdutoWSCriar> createProdutoWSCriar(ProdutoWSCriar value) {
        return new JAXBElement<ProdutoWSCriar>(_ProdutoWSCriar_QNAME, ProdutoWSCriar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoWSApagar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS/", name = "ProdutoWSApagar")
    public JAXBElement<ProdutoWSApagar> createProdutoWSApagar(ProdutoWSApagar value) {
        return new JAXBElement<ProdutoWSApagar>(_ProdutoWSApagar_QNAME, ProdutoWSApagar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoWSApagarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS/", name = "ProdutoWSApagarResponse")
    public JAXBElement<ProdutoWSApagarResponse> createProdutoWSApagarResponse(ProdutoWSApagarResponse value) {
        return new JAXBElement<ProdutoWSApagarResponse>(_ProdutoWSApagarResponse_QNAME, ProdutoWSApagarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoWSLer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS/", name = "ProdutoWSLer")
    public JAXBElement<ProdutoWSLer> createProdutoWSLer(ProdutoWSLer value) {
        return new JAXBElement<ProdutoWSLer>(_ProdutoWSLer_QNAME, ProdutoWSLer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoWSAtualizar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS/", name = "ProdutoWSAtualizar")
    public JAXBElement<ProdutoWSAtualizar> createProdutoWSAtualizar(ProdutoWSAtualizar value) {
        return new JAXBElement<ProdutoWSAtualizar>(_ProdutoWSAtualizar_QNAME, ProdutoWSAtualizar.class, null, value);
    }

}

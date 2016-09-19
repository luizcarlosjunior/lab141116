
package jaxWS.ProdutoWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProdutoWSApagarResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdutoWSApagarResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProdutoWSApagarResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdutoWSApagarResponse", propOrder = {
    "produtoWSApagarResult"
})
public class ProdutoWSApagarResponse {

    @XmlElement(name = "ProdutoWSApagarResult")
    protected String produtoWSApagarResult;

    /**
     * Gets the value of the produtoWSApagarResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdutoWSApagarResult() {
        return produtoWSApagarResult;
    }

    /**
     * Sets the value of the produtoWSApagarResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdutoWSApagarResult(String value) {
        this.produtoWSApagarResult = value;
    }

}

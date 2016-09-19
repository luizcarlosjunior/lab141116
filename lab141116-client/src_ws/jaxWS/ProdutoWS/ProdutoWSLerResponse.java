
package jaxWS.ProdutoWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProdutoWSLerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdutoWSLerResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProdutoWSLerResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdutoWSLerResponse", propOrder = {
    "produtoWSLerResult"
})
public class ProdutoWSLerResponse {

    @XmlElement(name = "ProdutoWSLerResult")
    protected String produtoWSLerResult;

    /**
     * Gets the value of the produtoWSLerResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdutoWSLerResult() {
        return produtoWSLerResult;
    }

    /**
     * Sets the value of the produtoWSLerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdutoWSLerResult(String value) {
        this.produtoWSLerResult = value;
    }

}


package jaxWS.ProdutoWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProdutoWSAtualizarResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdutoWSAtualizarResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProdutoWSAtualizarResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdutoWSAtualizarResponse", propOrder = {
    "produtoWSAtualizarResult"
})
public class ProdutoWSAtualizarResponse {

    @XmlElement(name = "ProdutoWSAtualizarResult")
    protected String produtoWSAtualizarResult;

    /**
     * Gets the value of the produtoWSAtualizarResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdutoWSAtualizarResult() {
        return produtoWSAtualizarResult;
    }

    /**
     * Sets the value of the produtoWSAtualizarResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdutoWSAtualizarResult(String value) {
        this.produtoWSAtualizarResult = value;
    }

}

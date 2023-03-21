
package com.baeldung.soap.ws.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="intA" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="intB" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "intA",
    "intB"
})
@XmlRootElement(name = "Subtract")
public class Subtract {

    protected int intA;
    protected int intB;

    /**
     * Ruft den Wert der intA-Eigenschaft ab.
     * 
     */
    public int getIntA() {
        return intA;
    }

    /**
     * Legt den Wert der intA-Eigenschaft fest.
     * 
     */
    public void setIntA(int value) {
        this.intA = value;
    }

    /**
     * Ruft den Wert der intB-Eigenschaft ab.
     * 
     */
    public int getIntB() {
        return intB;
    }

    /**
     * Legt den Wert der intB-Eigenschaft fest.
     * 
     */
    public void setIntB(int value) {
        this.intB = value;
    }

}

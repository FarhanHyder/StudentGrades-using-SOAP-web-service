//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.14 at 11:56:17 AM EDT 
//


package com.hyder.students;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Student complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Student">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gpa" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="standing" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Student", propOrder = {
    "id",
    "name",
    "gpa",
    "standing"
})
public class Student {

    protected int id;
    @XmlElement(required = true)
    protected String name;
    protected double gpa;
    @XmlElement(required = true)
    protected String standing;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the gpa property.
     * 
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * Sets the value of the gpa property.
     * 
     */
    public void setGpa(double value) {
        this.gpa = value;
    }

    /**
     * Gets the value of the standing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStanding() {
        return standing;
    }

    /**
     * Sets the value of the standing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStanding(String value) {
        this.standing = value;
    }

}

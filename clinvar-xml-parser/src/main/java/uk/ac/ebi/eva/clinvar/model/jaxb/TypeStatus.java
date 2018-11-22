//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.18 at 10:27:29 PM BST 
//


package uk.ac.ebi.eva.clinvar.model.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="current"/>
 *     &lt;enumeration value="completed and retired"/>
 *     &lt;enumeration value="delete"/>
 *     &lt;enumeration value="in development"/>
 *     &lt;enumeration value="reclassified"/>
 *     &lt;enumeration value="reject"/>
 *     &lt;enumeration value="secondary"/>
 *     &lt;enumeration value="suppressed"/>
 *     &lt;enumeration value="under review"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeStatus")
@XmlEnum
public enum TypeStatus {

    @XmlEnumValue("current")
    CURRENT("current"),
    @XmlEnumValue("completed and retired")
    COMPLETED_AND_RETIRED("completed and retired"),
    @XmlEnumValue("delete")
    DELETE("delete"),
    @XmlEnumValue("in development")
    IN_DEVELOPMENT("in development"),
    @XmlEnumValue("reclassified")
    RECLASSIFIED("reclassified"),
    @XmlEnumValue("reject")
    REJECT("reject"),
    @XmlEnumValue("secondary")
    SECONDARY("secondary"),
    @XmlEnumValue("suppressed")
    SUPPRESSED("suppressed"),
    @XmlEnumValue("under review")
    UNDER_REVIEW("under review");
    private final String value;

    TypeStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeStatus fromValue(String v) {
        for (TypeStatus c: TypeStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
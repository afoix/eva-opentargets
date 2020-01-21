//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.21 at 10:36:51 AM GMT 
//


package uk.ac.ebi.eva.clinvar.model.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Documents in what populations or samples an allele or genotype has been observed 
 * 				relative to the described trait. Summary observations can be registered per 
 * 				submitted assertion, grouped by common citation, study type, origin, ethnicity, tissue, cell line,
 * 				and species data. Not all options are valid per study type, but these will not be validated in the xsd.
 * 			
 * 
 * <p>Java class for ObservationSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObservationSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sample" type="{}SampleType"/>
 *         &lt;element name="Method" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{}MethodType">
 *                 &lt;sequence>
 *                   &lt;element name="Type" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="curation"/>
 *                         &lt;enumeration value="literature only"/>
 *                         &lt;enumeration value="reference population"/>
 *                         &lt;enumeration value="re-interpretation"/>
 *                         &lt;enumeration value="case-control"/>
 *                         &lt;enumeration value="clinical testing"/>
 *                         &lt;enumeration value="in vitro"/>
 *                         &lt;enumeration value="in vivo"/>
 *                         &lt;enumeration value="inferred from source"/>
 *                         &lt;enumeration value="research"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ObservedData" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Attribute">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;>AttributeType">
 *                           &lt;attribute name="Type" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Description"/>
 *                                 &lt;enumeration value="VariantAlleles"/>
 *                                 &lt;enumeration value="SubjectsWithVariant"/>
 *                                 &lt;enumeration value="SubjectsWithDifferentCausativeVariant"/>
 *                                 &lt;enumeration value="VariantChromosomes"/>
 *                                 &lt;enumeration value="IndependentObservations"/>
 *                                 &lt;enumeration value="SingleHeterozygote"/>
 *                                 &lt;enumeration value="CompoundHeterozygote"/>
 *                                 &lt;enumeration value="Homozygote"/>
 *                                 &lt;enumeration value="Hemizygote"/>
 *                                 &lt;enumeration value="NumberMosaic"/>
 *                                 &lt;enumeration value="ObservedUnspecified"/>
 *                                 &lt;enumeration value="AlleleFrequency"/>
 *                                 &lt;enumeration value="SecondaryFinding"/>
 *                                 &lt;enumeration value="GenotypeAndMOIConsistent"/>
 *                                 &lt;enumeration value="UnaffectedFamilyMemberWithCausativeVariant"/>
 *                                 &lt;enumeration value="HetParentTransmitNormalAllele"/>
 *                                 &lt;enumeration value="CosegregatingFamilies"/>
 *                                 &lt;enumeration value="InformativeMeioses"/>
 *                                 &lt;enumeration value="SampleLocalID"/>
 *                                 &lt;enumeration value="FamilyHistory"/>
 *                                 &lt;enumeration value="NumFamiliesWithVariant"/>
 *                                 &lt;enumeration value="NumFamiliesWithSegregationObserved"/>
 *                                 &lt;enumeration value="SegregationObserved"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Severity" type="{}SeverityType" minOccurs="0"/>
 *                   &lt;element name="Citation" type="{}CitationType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="XRef" type="{}XrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Comment" type="{}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{}CVIdentifiers"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Co-occurrenceSet" type="{}Co-occurrenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TraitSet" type="{}ClinAsserTraitSetType" minOccurs="0"/>
 *         &lt;element name="Citation" type="{}CitationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="XRef" type="{}XrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Comment" type="{}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservationSet", propOrder = {
    "sample",
    "method",
    "observedData",
    "coOccurrenceSet",
    "traitSet",
    "citation",
    "xRef",
    "comment"
})
public class ObservationSet {

    @XmlElement(name = "Sample", required = true)
    protected SampleType sample;
    @XmlElement(name = "Method")
    protected List<ObservationSet.Method> method;
    @XmlElement(name = "ObservedData", required = true)
    protected List<ObservationSet.ObservedData> observedData;
    @XmlElement(name = "Co-occurrenceSet")
    protected List<CoOccurrenceType> coOccurrenceSet;
    @XmlElement(name = "TraitSet")
    protected ClinAsserTraitSetType traitSet;
    @XmlElement(name = "Citation")
    protected List<CitationType> citation;
    @XmlElement(name = "XRef")
    protected List<XrefType> xRef;
    @XmlElement(name = "Comment")
    protected List<CommentType> comment;

    /**
     * Gets the value of the sample property.
     * 
     * @return
     *     possible object is
     *     {@link SampleType }
     *     
     */
    public SampleType getSample() {
        return sample;
    }

    /**
     * Sets the value of the sample property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleType }
     *     
     */
    public void setSample(SampleType value) {
        this.sample = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the method property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservationSet.Method }
     * 
     * 
     */
    public List<ObservationSet.Method> getMethod() {
        if (method == null) {
            method = new ArrayList<ObservationSet.Method>();
        }
        return this.method;
    }

    /**
     * Gets the value of the observedData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observedData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObservedData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservationSet.ObservedData }
     * 
     * 
     */
    public List<ObservationSet.ObservedData> getObservedData() {
        if (observedData == null) {
            observedData = new ArrayList<ObservationSet.ObservedData>();
        }
        return this.observedData;
    }

    /**
     * Gets the value of the coOccurrenceSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coOccurrenceSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoOccurrenceSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoOccurrenceType }
     * 
     * 
     */
    public List<CoOccurrenceType> getCoOccurrenceSet() {
        if (coOccurrenceSet == null) {
            coOccurrenceSet = new ArrayList<CoOccurrenceType>();
        }
        return this.coOccurrenceSet;
    }

    /**
     * Gets the value of the traitSet property.
     * 
     * @return
     *     possible object is
     *     {@link ClinAsserTraitSetType }
     *     
     */
    public ClinAsserTraitSetType getTraitSet() {
        return traitSet;
    }

    /**
     * Sets the value of the traitSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinAsserTraitSetType }
     *     
     */
    public void setTraitSet(ClinAsserTraitSetType value) {
        this.traitSet = value;
    }

    /**
     * Gets the value of the citation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitationType }
     * 
     * 
     */
    public List<CitationType> getCitation() {
        if (citation == null) {
            citation = new ArrayList<CitationType>();
        }
        return this.citation;
    }

    /**
     * Gets the value of the xRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XrefType }
     * 
     * 
     */
    public List<XrefType> getXRef() {
        if (xRef == null) {
            xRef = new ArrayList<XrefType>();
        }
        return this.xRef;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentType }
     * 
     * 
     */
    public List<CommentType> getComment() {
        if (comment == null) {
            comment = new ArrayList<CommentType>();
        }
        return this.comment;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{}MethodType">
     *       &lt;sequence>
     *         &lt;element name="Type" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="curation"/>
     *               &lt;enumeration value="literature only"/>
     *               &lt;enumeration value="reference population"/>
     *               &lt;enumeration value="re-interpretation"/>
     *               &lt;enumeration value="case-control"/>
     *               &lt;enumeration value="clinical testing"/>
     *               &lt;enumeration value="in vitro"/>
     *               &lt;enumeration value="in vivo"/>
     *               &lt;enumeration value="inferred from source"/>
     *               &lt;enumeration value="research"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "type"
    })
    public static class Method
        extends MethodType
    {

        @XmlElement(name = "Type")
        protected String type;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Attribute">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;>AttributeType">
     *                 &lt;attribute name="Type" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Description"/>
     *                       &lt;enumeration value="VariantAlleles"/>
     *                       &lt;enumeration value="SubjectsWithVariant"/>
     *                       &lt;enumeration value="SubjectsWithDifferentCausativeVariant"/>
     *                       &lt;enumeration value="VariantChromosomes"/>
     *                       &lt;enumeration value="IndependentObservations"/>
     *                       &lt;enumeration value="SingleHeterozygote"/>
     *                       &lt;enumeration value="CompoundHeterozygote"/>
     *                       &lt;enumeration value="Homozygote"/>
     *                       &lt;enumeration value="Hemizygote"/>
     *                       &lt;enumeration value="NumberMosaic"/>
     *                       &lt;enumeration value="ObservedUnspecified"/>
     *                       &lt;enumeration value="AlleleFrequency"/>
     *                       &lt;enumeration value="SecondaryFinding"/>
     *                       &lt;enumeration value="GenotypeAndMOIConsistent"/>
     *                       &lt;enumeration value="UnaffectedFamilyMemberWithCausativeVariant"/>
     *                       &lt;enumeration value="HetParentTransmitNormalAllele"/>
     *                       &lt;enumeration value="CosegregatingFamilies"/>
     *                       &lt;enumeration value="InformativeMeioses"/>
     *                       &lt;enumeration value="SampleLocalID"/>
     *                       &lt;enumeration value="FamilyHistory"/>
     *                       &lt;enumeration value="NumFamiliesWithVariant"/>
     *                       &lt;enumeration value="NumFamiliesWithSegregationObserved"/>
     *                       &lt;enumeration value="SegregationObserved"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Severity" type="{}SeverityType" minOccurs="0"/>
     *         &lt;element name="Citation" type="{}CitationType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="XRef" type="{}XrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Comment" type="{}CommentType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{}CVIdentifiers"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attribute",
        "severity",
        "citation",
        "xRef",
        "comment"
    })
    public static class ObservedData {

        @XmlElement(name = "Attribute", required = true)
        protected ObservationSet.ObservedData.Attribute attribute;
        @XmlElement(name = "Severity")
        @XmlSchemaType(name = "string")
        protected SeverityType severity;
        @XmlElement(name = "Citation")
        protected List<CitationType> citation;
        @XmlElement(name = "XRef")
        protected List<XrefType> xRef;
        @XmlElement(name = "Comment")
        protected List<CommentType> comment;
        @XmlAttribute(name = "ID")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger id;

        /**
         * Gets the value of the attribute property.
         * 
         * @return
         *     possible object is
         *     {@link ObservationSet.ObservedData.Attribute }
         *     
         */
        public ObservationSet.ObservedData.Attribute getAttribute() {
            return attribute;
        }

        /**
         * Sets the value of the attribute property.
         * 
         * @param value
         *     allowed object is
         *     {@link ObservationSet.ObservedData.Attribute }
         *     
         */
        public void setAttribute(ObservationSet.ObservedData.Attribute value) {
            this.attribute = value;
        }

        /**
         * Gets the value of the severity property.
         * 
         * @return
         *     possible object is
         *     {@link SeverityType }
         *     
         */
        public SeverityType getSeverity() {
            return severity;
        }

        /**
         * Sets the value of the severity property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeverityType }
         *     
         */
        public void setSeverity(SeverityType value) {
            this.severity = value;
        }

        /**
         * Gets the value of the citation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the citation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCitation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CitationType }
         * 
         * 
         */
        public List<CitationType> getCitation() {
            if (citation == null) {
                citation = new ArrayList<CitationType>();
            }
            return this.citation;
        }

        /**
         * Gets the value of the xRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the xRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getXRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XrefType }
         * 
         * 
         */
        public List<XrefType> getXRef() {
            if (xRef == null) {
                xRef = new ArrayList<XrefType>();
            }
            return this.xRef;
        }

        /**
         * Gets the value of the comment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the comment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CommentType }
         * 
         * 
         */
        public List<CommentType> getComment() {
            if (comment == null) {
                comment = new ArrayList<CommentType>();
            }
            return this.comment;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setID(BigInteger value) {
            this.id = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;>AttributeType">
         *       &lt;attribute name="Type" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Description"/>
         *             &lt;enumeration value="VariantAlleles"/>
         *             &lt;enumeration value="SubjectsWithVariant"/>
         *             &lt;enumeration value="SubjectsWithDifferentCausativeVariant"/>
         *             &lt;enumeration value="VariantChromosomes"/>
         *             &lt;enumeration value="IndependentObservations"/>
         *             &lt;enumeration value="SingleHeterozygote"/>
         *             &lt;enumeration value="CompoundHeterozygote"/>
         *             &lt;enumeration value="Homozygote"/>
         *             &lt;enumeration value="Hemizygote"/>
         *             &lt;enumeration value="NumberMosaic"/>
         *             &lt;enumeration value="ObservedUnspecified"/>
         *             &lt;enumeration value="AlleleFrequency"/>
         *             &lt;enumeration value="SecondaryFinding"/>
         *             &lt;enumeration value="GenotypeAndMOIConsistent"/>
         *             &lt;enumeration value="UnaffectedFamilyMemberWithCausativeVariant"/>
         *             &lt;enumeration value="HetParentTransmitNormalAllele"/>
         *             &lt;enumeration value="CosegregatingFamilies"/>
         *             &lt;enumeration value="InformativeMeioses"/>
         *             &lt;enumeration value="SampleLocalID"/>
         *             &lt;enumeration value="FamilyHistory"/>
         *             &lt;enumeration value="NumFamiliesWithVariant"/>
         *             &lt;enumeration value="NumFamiliesWithSegregationObserved"/>
         *             &lt;enumeration value="SegregationObserved"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Attribute
            extends AttributeType
        {

            @XmlAttribute(name = "Type", required = true)
            protected String type;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

        }

    }

}

//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci\u00f3n de la referencia de enlace (JAXB) XML v2.2.7-b41 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder\u00e1n si se vuelve a compilar el esquema de origen. 
// Generado el: PM.12.14 a las 10:47:57 PM CLST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="style">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="location">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="interesting">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="url">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="var" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                             &lt;element name="data">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="forecast" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="data_sequence" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="idB" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="valueB" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="id2" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="value2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="city" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "style",
    "location"
})
@XmlRootElement(name = "report")
public class Report {

    @XmlElement(required = true)
    protected Report.Style style;
    @XmlElement(required = true)
    protected Report.Location location;

    /**
     * Obtiene el valor de la propiedad style.
     * 
     * @return
     *     possible object is
     *     {@link Report.Style }
     *     
     */
    public Report.Style getStyle() {
        return style;
    }

    /**
     * Define el valor de la propiedad style.
     * 
     * @param value
     *     allowed object is
     *     {@link Report.Style }
     *     
     */
    public void setStyle(Report.Style value) {
        this.style = value;
    }

    /**
     * Obtiene el valor de la propiedad location.
     * 
     * @return
     *     possible object is
     *     {@link Report.Location }
     *     
     */
    public Report.Location getLocation() {
        return location;
    }

    /**
     * Define el valor de la propiedad location.
     * 
     * @param value
     *     allowed object is
     *     {@link Report.Location }
     *     
     */
    public void setLocation(Report.Location value) {
        this.location = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="interesting">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="url">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="var" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                   &lt;element name="data">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="forecast" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="data_sequence" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="idB" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="valueB" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="id2" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="value2" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="city" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "interesting",
        "var"
    })
    public static class Location {

        @XmlElement(required = true)
        protected Report.Location.Interesting interesting;
        @XmlElement(required = true)
        protected List<Report.Location.Var> var;
        @XmlAttribute(name = "city", required = true)
        protected String city;

        /**
         * Obtiene el valor de la propiedad interesting.
         * 
         * @return
         *     possible object is
         *     {@link Report.Location.Interesting }
         *     
         */
        public Report.Location.Interesting getInteresting() {
            return interesting;
        }

        /**
         * Define el valor de la propiedad interesting.
         * 
         * @param value
         *     allowed object is
         *     {@link Report.Location.Interesting }
         *     
         */
        public void setInteresting(Report.Location.Interesting value) {
            this.interesting = value;
        }

        /**
         * Gets the value of the var property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the var property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVar().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Report.Location.Var }
         * 
         * 
         */
        public List<Report.Location.Var> getVar() {
            if (var == null) {
                var = new ArrayList<Report.Location.Var>();
            }
            return this.var;
        }

        /**
         * Obtiene el valor de la propiedad city.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * Define el valor de la propiedad city.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        public void setVar(List<Report.Location.Var> value) {
            this.var = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="url">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "url"
        })
        public static class Interesting {

            @XmlElement(required = true)
            protected Report.Location.Interesting.Url url;

            /**
             * Obtiene el valor de la propiedad url.
             * 
             * @return
             *     possible object is
             *     {@link Report.Location.Interesting.Url }
             *     
             */
            public Report.Location.Interesting.Url getUrl() {
                return url;
            }

            /**
             * Define el valor de la propiedad url.
             * 
             * @param value
             *     allowed object is
             *     {@link Report.Location.Interesting.Url }
             *     
             */
            public void setUrl(Report.Location.Interesting.Url value) {
                this.url = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Url {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "description", required = true)
                protected String description;

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad description.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Define el valor de la propiedad description.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *         &lt;element name="data">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="forecast" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="data_sequence" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="idB" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="valueB" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="id2" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="value2" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "icon",
            "data"
        })
        public static class Var {

            @XmlElement(required = true)
            protected String name;
            @XmlSchemaType(name = "unsignedByte")
            protected short icon;
            @XmlElement(required = true)
            protected Report.Location.Var.Data data;

            /**
             * Obtiene el valor de la propiedad name.
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
             * Define el valor de la propiedad name.
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
             * Obtiene el valor de la propiedad icon.
             * 
             */
            public short getIcon() {
                return icon;
            }

            /**
             * Define el valor de la propiedad icon.
             * 
             */
            public void setIcon(short value) {
                this.icon = value;
            }

            /**
             * Obtiene el valor de la propiedad data.
             * 
             * @return
             *     possible object is
             *     {@link Report.Location.Var.Data }
             *     
             */
            public Report.Location.Var.Data getData() {
                return data;
            }

            /**
             * Define el valor de la propiedad data.
             * 
             * @param value
             *     allowed object is
             *     {@link Report.Location.Var.Data }
             *     
             */
            public void setData(Report.Location.Var.Data value) {
                this.data = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="forecast" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="data_sequence" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="idB" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="valueB" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="id2" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="value2" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "forecast"
            })
            public static class Data {

                @XmlElement(required = true)
                protected List<Report.Location.Var.Data.Forecast> forecast;

                /**
                 * Gets the value of the forecast property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the forecast property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getForecast().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Report.Location.Var.Data.Forecast }
                 * 
                 * 
                 */
                public List<Report.Location.Var.Data.Forecast> getForecast() {
                    if (forecast == null) {
                        forecast = new ArrayList<Report.Location.Var.Data.Forecast>();
                    }
                    return this.forecast;
                }

                public void setForecast(List<Report.Location.Var.Data.Forecast> value) {
                    this.forecast = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="data_sequence" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="idB" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="valueB" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="id2" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="value2" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Forecast {

                    @XmlAttribute(name = "data_sequence", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short dataSequence;
                    @XmlAttribute(name = "value", required = true)
                    protected String value;
                    @XmlAttribute(name = "id")
                    @XmlSchemaType(name = "unsignedByte")
                    protected Short id;
                    @XmlAttribute(name = "idB")
                    @XmlSchemaType(name = "unsignedByte")
                    protected Short idB;
                    @XmlAttribute(name = "valueB")
                    protected String valueB;
                    @XmlAttribute(name = "id2")
                    @XmlSchemaType(name = "unsignedByte")
                    protected Short id2;
                    @XmlAttribute(name = "value2")
                    protected String value2;

                    /**
                     * Obtiene el valor de la propiedad dataSequence.
                     * 
                     */
                    public short getDataSequence() {
                        return dataSequence;
                    }

                    /**
                     * Define el valor de la propiedad dataSequence.
                     * 
                     */
                    public void setDataSequence(short value) {
                        this.dataSequence = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad value.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Define el valor de la propiedad value.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad id.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Short }
                     *     
                     */
                    public Short getId() {
                        return id;
                    }

                    /**
                     * Define el valor de la propiedad id.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Short }
                     *     
                     */
                    public void setId(Short value) {
                        this.id = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad idB.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Short }
                     *     
                     */
                    public Short getIdB() {
                        return idB;
                    }

                    /**
                     * Define el valor de la propiedad idB.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Short }
                     *     
                     */
                    public void setIdB(Short value) {
                        this.idB = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad valueB.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValueB() {
                        return valueB;
                    }

                    /**
                     * Define el valor de la propiedad valueB.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValueB(String value) {
                        this.valueB = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad id2.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Short }
                     *     
                     */
                    public Short getId2() {
                        return id2;
                    }

                    /**
                     * Define el valor de la propiedad id2.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Short }
                     *     
                     */
                    public void setId2(Short value) {
                        this.id2 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad value2.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue2() {
                        return value2;
                    }

                    /**
                     * Define el valor de la propiedad value2.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue2(String value) {
                        this.value2 = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Style {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "class", required = true)
        protected String clazz;

        /**
         * Obtiene el valor de la propiedad value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Define el valor de la propiedad value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Obtiene el valor de la propiedad clazz.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClazz() {
            return clazz;
        }

        /**
         * Define el valor de la propiedad clazz.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClazz(String value) {
            this.clazz = value;
        }

    }

}

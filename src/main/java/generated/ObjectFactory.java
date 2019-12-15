//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci\u00f3n de la referencia de enlace (JAXB) XML v2.2.7-b41 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder\u00e1n si se vuelve a compilar el esquema de origen. 
// Generado el: PM.12.14 a las 10:47:57 PM CLST 
//


package generated;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Report }
     * 
     */
    public Report createReport() {
        return new Report();
    }

    /**
     * Create an instance of {@link Report.Location }
     * 
     */
    public Report.Location createReportLocation() {
        return new Report.Location();
    }

    /**
     * Create an instance of {@link Report.Location.Var }
     * 
     */
    public Report.Location.Var createReportLocationVar() {
        return new Report.Location.Var();
    }

    /**
     * Create an instance of {@link Report.Location.Var.Data }
     * 
     */
    public Report.Location.Var.Data createReportLocationVarData() {
        return new Report.Location.Var.Data();
    }

    /**
     * Create an instance of {@link Report.Location.Interesting }
     * 
     */
    public Report.Location.Interesting createReportLocationInteresting() {
        return new Report.Location.Interesting();
    }

    /**
     * Create an instance of {@link Report.Style }
     * 
     */
    public Report.Style createReportStyle() {
        return new Report.Style();
    }

    /**
     * Create an instance of {@link Report.Location.Var.Data.Forecast }
     * 
     */
    public Report.Location.Var.Data.Forecast createReportLocationVarDataForecast() {
        return new Report.Location.Var.Data.Forecast();
    }

    /**
     * Create an instance of {@link Report.Location.Interesting.Url }
     * 
     */
    public Report.Location.Interesting.Url createReportLocationInterestingUrl() {
        return new Report.Location.Interesting.Url();
    }

}

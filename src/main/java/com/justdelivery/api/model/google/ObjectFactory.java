//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.06 at 10:46:09 AM GMT 
//


package com.justdelivery.api.model.google;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.justdelivery.api.model.google package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.justdelivery.api.model.google
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DistanceMatrixResponse }
     * 
     */
    public DistanceMatrixResponse createDistanceMatrixResponse() {
        return new DistanceMatrixResponse();
    }

    /**
     * Create an instance of {@link DistanceMatrixResponse.Row.Element }
     * 
     */
    public DistanceMatrixResponse.Row.Element createDistanceMatrixResponseRowElement() {
        return new DistanceMatrixResponse.Row.Element();
    }

    /**
     * Create an instance of {@link DistanceMatrixResponse.Row.Element.Duration }
     * 
     */
    public DistanceMatrixResponse.Row.Element.Duration createDistanceMatrixResponseRowElementDuration() {
        return new DistanceMatrixResponse.Row.Element.Duration();
    }

    /**
     * Create an instance of {@link DistanceMatrixResponse.Row.Element.Distance }
     * 
     */
    public DistanceMatrixResponse.Row.Element.Distance createDistanceMatrixResponseRowElementDistance() {
        return new DistanceMatrixResponse.Row.Element.Distance();
    }

    /**
     * Create an instance of {@link DistanceMatrixResponse.Row }
     * 
     */
    public DistanceMatrixResponse.Row createDistanceMatrixResponseRow() {
        return new DistanceMatrixResponse.Row();
    }

}
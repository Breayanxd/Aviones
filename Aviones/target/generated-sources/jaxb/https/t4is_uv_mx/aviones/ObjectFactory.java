//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.04.15 a las 02:25:27 PM CDT 
//


package https.t4is_uv_mx.aviones;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.t4is_uv_mx.aviones package. 
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

    private final static QName _ReadAllAvionesRequest_QNAME = new QName("https://t4is.uv.mx/aviones", "ReadAllAvionesRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.t4is_uv_mx.aviones
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateAvionRequest }
     * 
     */
    public CreateAvionRequest createCreateAvionRequest() {
        return new CreateAvionRequest();
    }

    /**
     * Create an instance of {@link CreateAvionResponse }
     * 
     */
    public CreateAvionResponse createCreateAvionResponse() {
        return new CreateAvionResponse();
    }

    /**
     * Create an instance of {@link ReadAllAvionesResponse }
     * 
     */
    public ReadAllAvionesResponse createReadAllAvionesResponse() {
        return new ReadAllAvionesResponse();
    }

    /**
     * Create an instance of {@link ReadOneAvionRequest }
     * 
     */
    public ReadOneAvionRequest createReadOneAvionRequest() {
        return new ReadOneAvionRequest();
    }

    /**
     * Create an instance of {@link ReadOneAvionResponse }
     * 
     */
    public ReadOneAvionResponse createReadOneAvionResponse() {
        return new ReadOneAvionResponse();
    }

    /**
     * Create an instance of {@link UpdateAvionRequest }
     * 
     */
    public UpdateAvionRequest createUpdateAvionRequest() {
        return new UpdateAvionRequest();
    }

    /**
     * Create an instance of {@link UpdateAvionResponse }
     * 
     */
    public UpdateAvionResponse createUpdateAvionResponse() {
        return new UpdateAvionResponse();
    }

    /**
     * Create an instance of {@link DeleteAvionRequest }
     * 
     */
    public DeleteAvionRequest createDeleteAvionRequest() {
        return new DeleteAvionRequest();
    }

    /**
     * Create an instance of {@link DeleteAvionResponse }
     * 
     */
    public DeleteAvionResponse createDeleteAvionResponse() {
        return new DeleteAvionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/aviones", name = "ReadAllAvionesRequest")
    public JAXBElement<Object> createReadAllAvionesRequest(Object value) {
        return new JAXBElement<Object>(_ReadAllAvionesRequest_QNAME, Object.class, null, value);
    }

}

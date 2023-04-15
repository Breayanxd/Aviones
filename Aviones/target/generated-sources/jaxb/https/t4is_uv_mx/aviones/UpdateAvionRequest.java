//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.04.15 a las 02:25:27 PM CDT 
//


package https.t4is_uv_mx.aviones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="newModelo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="newAerolinea" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="newNoAsientos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="newTipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "id",
    "newModelo",
    "newAerolinea",
    "newNoAsientos",
    "newTipo"
})
@XmlRootElement(name = "UpdateAvionRequest")
public class UpdateAvionRequest {

    protected int id;
    @XmlElement(required = true)
    protected String newModelo;
    @XmlElement(required = true)
    protected String newAerolinea;
    protected int newNoAsientos;
    @XmlElement(required = true)
    protected String newTipo;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad newModelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewModelo() {
        return newModelo;
    }

    /**
     * Define el valor de la propiedad newModelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewModelo(String value) {
        this.newModelo = value;
    }

    /**
     * Obtiene el valor de la propiedad newAerolinea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewAerolinea() {
        return newAerolinea;
    }

    /**
     * Define el valor de la propiedad newAerolinea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewAerolinea(String value) {
        this.newAerolinea = value;
    }

    /**
     * Obtiene el valor de la propiedad newNoAsientos.
     * 
     */
    public int getNewNoAsientos() {
        return newNoAsientos;
    }

    /**
     * Define el valor de la propiedad newNoAsientos.
     * 
     */
    public void setNewNoAsientos(int value) {
        this.newNoAsientos = value;
    }

    /**
     * Obtiene el valor de la propiedad newTipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewTipo() {
        return newTipo;
    }

    /**
     * Define el valor de la propiedad newTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewTipo(String value) {
        this.newTipo = value;
    }

}

//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.09 um 03:22:23 PM CEST 
//


package generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für recipe complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="recipe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}title"/>
 *         &lt;element ref="{}subtitle" minOccurs="0"/>
 *         &lt;element ref="{}photos"/>
 *         &lt;element ref="{}portions"/>
 *         &lt;element ref="{}ingredients"/>
 *         &lt;element ref="{}time"/>
 *         &lt;element ref="{}difficulty"/>
 *         &lt;element ref="{}nutrition"/>
 *         &lt;element ref="{}step"/>
 *         &lt;element ref="{}comment"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recipe", propOrder = {
    "title",
    "subtitle",
    "photos",
    "portions",
    "ingredients",
    "time",
    "difficulty",
    "nutrition",
    "step",
    "comment"
})
public class Recipe {

    @XmlElement(required = true)
    protected String title;
    protected String subtitle;
    @XmlElement(required = true)
    protected PhotosType photos;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger portions;
    @XmlElement(required = true)
    protected Ingredients ingredients;
    @XmlElement(required = true)
    protected Time time;
    @XmlElement(required = true)
    protected Difficulty difficulty;
    @XmlElement(required = true)
    protected Nutrition nutrition;
    @XmlElement(required = true)
    protected String step;
    @XmlElement(required = true)
    protected CommentType comment;

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Ruft den Wert der subtitle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * Legt den Wert der subtitle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtitle(String value) {
        this.subtitle = value;
    }

    /**
     * Ruft den Wert der photos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PhotosType }
     *     
     */
    public PhotosType getPhotos() {
        return photos;
    }

    /**
     * Legt den Wert der photos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PhotosType }
     *     
     */
    public void setPhotos(PhotosType value) {
        this.photos = value;
    }

    /**
     * Ruft den Wert der portions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPortions() {
        return portions;
    }

    /**
     * Legt den Wert der portions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPortions(BigInteger value) {
        this.portions = value;
    }

    /**
     * Ruft den Wert der ingredients-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Ingredients }
     *     
     */
    public Ingredients getIngredients() {
        return ingredients;
    }

    /**
     * Legt den Wert der ingredients-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Ingredients }
     *     
     */
    public void setIngredients(Ingredients value) {
        this.ingredients = value;
    }

    /**
     * Ruft den Wert der time-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getTime() {
        return time;
    }

    /**
     * Legt den Wert der time-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setTime(Time value) {
        this.time = value;
    }

    /**
     * Ruft den Wert der difficulty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Difficulty }
     *     
     */
    public Difficulty getDifficulty() {
        return difficulty;
    }

    /**
     * Legt den Wert der difficulty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Difficulty }
     *     
     */
    public void setDifficulty(Difficulty value) {
        this.difficulty = value;
    }

    /**
     * Ruft den Wert der nutrition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Nutrition }
     *     
     */
    public Nutrition getNutrition() {
        return nutrition;
    }

    /**
     * Legt den Wert der nutrition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Nutrition }
     *     
     */
    public void setNutrition(Nutrition value) {
        this.nutrition = value;
    }

    /**
     * Ruft den Wert der step-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStep() {
        return step;
    }

    /**
     * Legt den Wert der step-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStep(String value) {
        this.step = value;
    }

    /**
     * Ruft den Wert der comment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommentType }
     *     
     */
    public CommentType getComment() {
        return comment;
    }

    /**
     * Legt den Wert der comment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentType }
     *     
     */
    public void setComment(CommentType value) {
        this.comment = value;
    }

	
	

}

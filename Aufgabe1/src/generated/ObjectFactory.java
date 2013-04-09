//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// €nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.09 um 03:22:23 PM CEST 
//


package generated;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


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

    private final static QName _Recipe_QNAME = new QName("", "recipe");
    private final static QName _Sort_QNAME = new QName("", "sort");
    private final static QName _Difficulty_QNAME = new QName("", "difficulty");
    private final static QName _Collection_QNAME = new QName("", "collection");
    private final static QName _Date_QNAME = new QName("", "date");
    private final static QName _Avatar_QNAME = new QName("", "avatar");
    private final static QName _Photo_QNAME = new QName("", "photo");
    private final static QName _Message_QNAME = new QName("", "message");
    private final static QName _Photos_QNAME = new QName("", "photos");
    private final static QName _Ingredients_QNAME = new QName("", "ingredients");
    private final static QName _Amount_QNAME = new QName("", "amount");
    private final static QName _Unit_QNAME = new QName("", "unit");
    private final static QName _Portions_QNAME = new QName("", "portions");
    private final static QName _Title_QNAME = new QName("", "title");
    private final static QName _Time_QNAME = new QName("", "time");
    private final static QName _Nutrition_QNAME = new QName("", "nutrition");
    private final static QName _Address_QNAME = new QName("", "address");
    private final static QName _Subtitle_QNAME = new QName("", "subtitle");
    private final static QName _Ingredient_QNAME = new QName("", "ingredient");
    private final static QName _Comment_QNAME = new QName("", "comment");
    private final static QName _Writer_QNAME = new QName("", "writer");
    private final static QName _User_QNAME = new QName("", "user");
    private final static QName _Step_QNAME = new QName("", "step");
    private final static QName _Comments_QNAME = new QName("", "comments");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Recipe }
     * 
     */
    public Recipe createRecipe() {
        return new Recipe();
    }

    /**
     * Create an instance of {@link Collection }
     * 
     */
    public Collection createCollection() {
        return new Collection();
    }

    /**
     * Create an instance of {@link PhotoType }
     * 
     */
    public PhotoType createPhotoType() {
        return new PhotoType();
    }

    /**
     * Create an instance of {@link PhotosType }
     * 
     */
    public PhotosType createPhotosType() {
        return new PhotosType();
    }

    /**
     * Create an instance of {@link Ingredients }
     * 
     */
    public Ingredients createIngredients() {
        return new Ingredients();
    }

    /**
     * Create an instance of {@link Nutrition }
     * 
     */
    public Nutrition createNutrition() {
        return new Nutrition();
    }

    /**
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link Ingredient }
     * 
     */
    public Ingredient createIngredient() {
        return new Ingredient();
    }

    /**
     * Create an instance of {@link CommentType }
     * 
     */
    public CommentType createCommentType() {
        return new CommentType();
    }

    /**
     * Create an instance of {@link CommentsType }
     * 
     */
    public CommentsType createCommentsType() {
        return new CommentsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Recipe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "recipe")
    public JAXBElement<Recipe> createRecipe(Recipe value) {
        return new JAXBElement<Recipe>(_Recipe_QNAME, Recipe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sort")
    public JAXBElement<String> createSort(String value) {
        return new JAXBElement<String>(_Sort_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Difficulty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "difficulty")
    public JAXBElement<Difficulty> createDifficulty(Difficulty value) {
        return new JAXBElement<Difficulty>(_Difficulty_QNAME, Difficulty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "collection")
    public JAXBElement<Collection> createCollection(Collection value) {
        return new JAXBElement<Collection>(_Collection_QNAME, Collection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "date")
    public JAXBElement<XMLGregorianCalendar> createDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_Date_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "avatar")
    public JAXBElement<String> createAvatar(String value) {
        return new JAXBElement<String>(_Avatar_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhotoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "photo")
    public JAXBElement<PhotoType> createPhoto(PhotoType value) {
        return new JAXBElement<PhotoType>(_Photo_QNAME, PhotoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "message")
    public JAXBElement<String> createMessage(String value) {
        return new JAXBElement<String>(_Message_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhotosType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "photos")
    public JAXBElement<PhotosType> createPhotos(PhotosType value) {
        return new JAXBElement<PhotosType>(_Photos_QNAME, PhotosType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ingredients }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ingredients")
    public JAXBElement<Ingredients> createIngredients(Ingredients value) {
        return new JAXBElement<Ingredients>(_Ingredients_QNAME, Ingredients.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "amount")
    public JAXBElement<BigDecimal> createAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Amount_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "unit")
    public JAXBElement<String> createUnit(String value) {
        return new JAXBElement<String>(_Unit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "portions")
    public JAXBElement<BigInteger> createPortions(BigInteger value) {
        return new JAXBElement<BigInteger>(_Portions_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Time }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "time")
    public JAXBElement<Time> createTime(Time value) {
        return new JAXBElement<Time>(_Time_QNAME, Time.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Nutrition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nutrition")
    public JAXBElement<Nutrition> createNutrition(Nutrition value) {
        return new JAXBElement<Nutrition>(_Nutrition_QNAME, Nutrition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "address")
    public JAXBElement<String> createAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "subtitle")
    public JAXBElement<String> createSubtitle(String value) {
        return new JAXBElement<String>(_Subtitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ingredient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ingredient")
    public JAXBElement<Ingredient> createIngredient(Ingredient value) {
        return new JAXBElement<Ingredient>(_Ingredient_QNAME, Ingredient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "comment")
    public JAXBElement<CommentType> createComment(CommentType value) {
        return new JAXBElement<CommentType>(_Comment_QNAME, CommentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "writer")
    public JAXBElement<String> createWriter(String value) {
        return new JAXBElement<String>(_Writer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "user")
    public JAXBElement<String> createUser(String value) {
        return new JAXBElement<String>(_User_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "step")
    public JAXBElement<String> createStep(String value) {
        return new JAXBElement<String>(_Step_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommentsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "comments")
    public JAXBElement<CommentsType> createComments(CommentsType value) {
        return new JAXBElement<CommentsType>(_Comments_QNAME, CommentsType.class, null, value);
    }

}

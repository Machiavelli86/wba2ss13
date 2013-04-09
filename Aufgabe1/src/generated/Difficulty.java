//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.09 um 03:22:23 PM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für difficulty.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="difficulty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="easy"/>
 *     &lt;enumeration value="medium"/>
 *     &lt;enumeration value="hard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "difficulty")
@XmlEnum
public enum Difficulty {

    @XmlEnumValue("easy")
    EASY("easy"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("hard")
    HARD("hard");
    private final String value;

    Difficulty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Difficulty fromValue(String v) {
        for (Difficulty c: Difficulty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

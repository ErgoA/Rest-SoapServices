
package ee.ttu.idu0075._2015.ws.subject;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="studentCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="programme" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
    "token",
    "firstName",
    "lastName",
    "studentCode",
    "programme",
    "age"
})
@XmlRootElement(name = "addStudentRequest")
public class AddStudentRequest {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected String firstName;
    @XmlElement(required = true)
    protected String lastName;
    @XmlElement(required = true)
    protected String studentCode;
    @XmlElement(required = true)
    protected String programme;
    @XmlElement(required = true)
    protected BigInteger age;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the studentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentCode() {
        return studentCode;
    }

    /**
     * Sets the value of the studentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentCode(String value) {
        this.studentCode = value;
    }

    /**
     * Gets the value of the programme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramme() {
        return programme;
    }

    /**
     * Sets the value of the programme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramme(String value) {
        this.programme = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAge(BigInteger value) {
        this.age = value;
    }

}

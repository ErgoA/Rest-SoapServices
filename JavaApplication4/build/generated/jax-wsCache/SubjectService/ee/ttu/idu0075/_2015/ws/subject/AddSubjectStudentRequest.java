
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
 *         &lt;element name="SubjectId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="StudentId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "subjectId",
    "studentId",
    "grade"
})
@XmlRootElement(name = "addSubjectStudentRequest")
public class AddSubjectStudentRequest {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(name = "SubjectId", required = true)
    protected BigInteger subjectId;
    @XmlElement(name = "StudentId", required = true)
    protected BigInteger studentId;
    @XmlElement(name = "Grade")
    protected double grade;

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
     * Gets the value of the subjectId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubjectId() {
        return subjectId;
    }

    /**
     * Sets the value of the subjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubjectId(BigInteger value) {
        this.subjectId = value;
    }

    /**
     * Gets the value of the studentId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStudentId() {
        return studentId;
    }

    /**
     * Sets the value of the studentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStudentId(BigInteger value) {
        this.studentId = value;
    }

    /**
     * Gets the value of the grade property.
     * 
     */
    public double getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     */
    public void setGrade(double value) {
        this.grade = value;
    }

}

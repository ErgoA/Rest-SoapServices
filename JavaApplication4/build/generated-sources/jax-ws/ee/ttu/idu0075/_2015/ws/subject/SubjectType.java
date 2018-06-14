
package ee.ttu.idu0075._2015.ws.subject;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="subjectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subjectCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="teacher" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="assessmentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="credits" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="SubjectStudentList" type="{http://www.ttu.ee/idu0075/2015/ws/Subject}SubjectStudentListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectType", propOrder = {
    "id",
    "subjectName",
    "subjectCode",
    "teacher",
    "assessmentType",
    "credits",
    "subjectStudentList"
})
public class SubjectType {

    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    protected String subjectName;
    @XmlElement(required = true)
    protected String subjectCode;
    @XmlElement(required = true)
    protected String teacher;
    @XmlElement(required = true)
    protected String assessmentType;
    @XmlElement(required = true)
    protected BigInteger credits;
    @XmlElement(name = "SubjectStudentList", required = true)
    protected SubjectStudentListType subjectStudentList;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the subjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Sets the value of the subjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName(String value) {
        this.subjectName = value;
    }

    /**
     * Gets the value of the subjectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectCode() {
        return subjectCode;
    }

    /**
     * Sets the value of the subjectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectCode(String value) {
        this.subjectCode = value;
    }

    /**
     * Gets the value of the teacher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeacher() {
        return teacher;
    }

    /**
     * Sets the value of the teacher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeacher(String value) {
        this.teacher = value;
    }

    /**
     * Gets the value of the assessmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentType() {
        return assessmentType;
    }

    /**
     * Sets the value of the assessmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentType(String value) {
        this.assessmentType = value;
    }

    /**
     * Gets the value of the credits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCredits() {
        return credits;
    }

    /**
     * Sets the value of the credits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCredits(BigInteger value) {
        this.credits = value;
    }

    /**
     * Gets the value of the subjectStudentList property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectStudentListType }
     *     
     */
    public SubjectStudentListType getSubjectStudentList() {
        return subjectStudentList;
    }

    /**
     * Sets the value of the subjectStudentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectStudentListType }
     *     
     */
    public void setSubjectStudentList(SubjectStudentListType value) {
        this.subjectStudentList = value;
    }

}

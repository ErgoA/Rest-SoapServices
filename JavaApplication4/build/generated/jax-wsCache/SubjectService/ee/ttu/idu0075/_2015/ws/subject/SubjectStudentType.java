
package ee.ttu.idu0075._2015.ws.subject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubjectStudentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectStudentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Student" type="{http://www.ttu.ee/idu0075/2015/ws/Subject}StudentType"/>
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
@XmlType(name = "SubjectStudentType", propOrder = {
    "student",
    "grade"
})
public class SubjectStudentType {

    @XmlElement(name = "Student", required = true)
    protected StudentType student;
    @XmlElement(name = "Grade")
    protected double grade;

    /**
     * Gets the value of the student property.
     * 
     * @return
     *     possible object is
     *     {@link StudentType }
     *     
     */
    public StudentType getStudent() {
        return student;
    }

    /**
     * Sets the value of the student property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentType }
     *     
     */
    public void setStudent(StudentType value) {
        this.student = value;
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

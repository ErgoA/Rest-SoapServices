
package ee.ttu.idu0075._2015.ws.subject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubjectStudentListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectStudentListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubjectStudent" type="{http://www.ttu.ee/idu0075/2015/ws/Subject}SubjectStudentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectStudentListType", propOrder = {
    "subjectStudent"
})
public class SubjectStudentListType {

    @XmlElement(name = "SubjectStudent")
    protected List<SubjectStudentType> subjectStudent;

    /**
     * Gets the value of the subjectStudent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectStudent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectStudent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubjectStudentType }
     * 
     * 
     */
    public List<SubjectStudentType> getSubjectStudent() {
        if (subjectStudent == null) {
            subjectStudent = new ArrayList<SubjectStudentType>();
        }
        return this.subjectStudent;
    }

}

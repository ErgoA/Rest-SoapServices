
package ee.ttu.idu0075._2015.ws.subject;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ee.ttu.idu0075._2015.ws.subject package. 
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

    private final static QName _AddSubjectStudentResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/Subject", "addSubjectStudentResponse");
    private final static QName _AddStudentResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/Subject", "addStudentResponse");
    private final static QName _GetSubjectResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/Subject", "getSubjectResponse");
    private final static QName _GetStudentResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/Subject", "getStudentResponse");
    private final static QName _AddSubjectResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/Subject", "addSubjectResponse");
    private final static QName _GetSubjectStudentListResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/Subject", "getSubjectStudentListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.ttu.idu0075._2015.ws.subject
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubjectType }
     * 
     */
    public SubjectType createSubjectType() {
        return new SubjectType();
    }

    /**
     * Create an instance of {@link AddSubjectStudentRequest }
     * 
     */
    public AddSubjectStudentRequest createAddSubjectStudentRequest() {
        return new AddSubjectStudentRequest();
    }

    /**
     * Create an instance of {@link GetStudentRequest }
     * 
     */
    public GetStudentRequest createGetStudentRequest() {
        return new GetStudentRequest();
    }

    /**
     * Create an instance of {@link GetStudentListResponse }
     * 
     */
    public GetStudentListResponse createGetStudentListResponse() {
        return new GetStudentListResponse();
    }

    /**
     * Create an instance of {@link StudentType }
     * 
     */
    public StudentType createStudentType() {
        return new StudentType();
    }

    /**
     * Create an instance of {@link GetSubjectListRequest }
     * 
     */
    public GetSubjectListRequest createGetSubjectListRequest() {
        return new GetSubjectListRequest();
    }

    /**
     * Create an instance of {@link AddSubjectRequest }
     * 
     */
    public AddSubjectRequest createAddSubjectRequest() {
        return new AddSubjectRequest();
    }

    /**
     * Create an instance of {@link SubjectStudentListType }
     * 
     */
    public SubjectStudentListType createSubjectStudentListType() {
        return new SubjectStudentListType();
    }

    /**
     * Create an instance of {@link GetSubjectRequest }
     * 
     */
    public GetSubjectRequest createGetSubjectRequest() {
        return new GetSubjectRequest();
    }

    /**
     * Create an instance of {@link GetSubjectListResponse }
     * 
     */
    public GetSubjectListResponse createGetSubjectListResponse() {
        return new GetSubjectListResponse();
    }

    /**
     * Create an instance of {@link GetStudentListRequest }
     * 
     */
    public GetStudentListRequest createGetStudentListRequest() {
        return new GetStudentListRequest();
    }

    /**
     * Create an instance of {@link AddStudentRequest }
     * 
     */
    public AddStudentRequest createAddStudentRequest() {
        return new AddStudentRequest();
    }

    /**
     * Create an instance of {@link SubjectStudentType }
     * 
     */
    public SubjectStudentType createSubjectStudentType() {
        return new SubjectStudentType();
    }

    /**
     * Create an instance of {@link GetSubjectStudentListRequest }
     * 
     */
    public GetSubjectStudentListRequest createGetSubjectStudentListRequest() {
        return new GetSubjectStudentListRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectStudentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/Subject", name = "addSubjectStudentResponse")
    public JAXBElement<SubjectStudentType> createAddSubjectStudentResponse(SubjectStudentType value) {
        return new JAXBElement<SubjectStudentType>(_AddSubjectStudentResponse_QNAME, SubjectStudentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/Subject", name = "addStudentResponse")
    public JAXBElement<StudentType> createAddStudentResponse(StudentType value) {
        return new JAXBElement<StudentType>(_AddStudentResponse_QNAME, StudentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/Subject", name = "getSubjectResponse")
    public JAXBElement<SubjectType> createGetSubjectResponse(SubjectType value) {
        return new JAXBElement<SubjectType>(_GetSubjectResponse_QNAME, SubjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/Subject", name = "getStudentResponse")
    public JAXBElement<StudentType> createGetStudentResponse(StudentType value) {
        return new JAXBElement<StudentType>(_GetStudentResponse_QNAME, StudentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/Subject", name = "addSubjectResponse")
    public JAXBElement<SubjectType> createAddSubjectResponse(SubjectType value) {
        return new JAXBElement<SubjectType>(_AddSubjectResponse_QNAME, SubjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectStudentListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/Subject", name = "getSubjectStudentListResponse")
    public JAXBElement<SubjectStudentListType> createGetSubjectStudentListResponse(SubjectStudentListType value) {
        return new JAXBElement<SubjectStudentListType>(_GetSubjectStudentListResponse_QNAME, SubjectStudentListType.class, null, value);
    }

}

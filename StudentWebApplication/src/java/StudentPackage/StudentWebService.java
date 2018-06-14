/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPackage;

import ee.ttu.idu0075._2015.ws.subject.AddStudentRequest;
import ee.ttu.idu0075._2015.ws.subject.AddSubjectRequest;
import ee.ttu.idu0075._2015.ws.subject.AddSubjectStudentRequest;
import ee.ttu.idu0075._2015.ws.subject.GetStudentListRequest;
import ee.ttu.idu0075._2015.ws.subject.GetStudentListResponse;
import ee.ttu.idu0075._2015.ws.subject.GetStudentRequest;
import ee.ttu.idu0075._2015.ws.subject.GetSubjectListRequest;
import ee.ttu.idu0075._2015.ws.subject.GetSubjectListResponse;
import ee.ttu.idu0075._2015.ws.subject.GetSubjectRequest;
import ee.ttu.idu0075._2015.ws.subject.GetSubjectStudentListRequest;
import ee.ttu.idu0075._2015.ws.subject.StudentType;
import ee.ttu.idu0075._2015.ws.subject.SubjectStudentListType;
import ee.ttu.idu0075._2015.ws.subject.SubjectStudentType;
import ee.ttu.idu0075._2015.ws.subject.SubjectType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author eralti
 */
@WebService(serviceName = "SubjectService", portName = "SubjectPort", endpointInterface = "ee.ttu.idu0075._2015.ws.subject.SubjectPortType", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/Subject", wsdlLocation = "WEB-INF/wsdl/StudentWebService/projekt.wsdl")
public class StudentWebService {


    static int nextStudentId = 1;
    static int nextSubjectId = 1;
    static List<StudentType> StudentList = new ArrayList<StudentType>();
    static List<SubjectType> SubjectList = new ArrayList<SubjectType>();
    
    public ee.ttu.idu0075._2015.ws.subject.StudentType getStudent(ee.ttu.idu0075._2015.ws.subject.GetStudentRequest parameter) {
        StudentType pt = null;
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < StudentList.size(); i++) {
                if (StudentList.get(i).getId().equals(parameter.getId())) {
                    pt = StudentList.get(i);
                }

            }    
        }
        return pt;   
    }

    public ee.ttu.idu0075._2015.ws.subject.StudentType addStudent(ee.ttu.idu0075._2015.ws.subject.AddStudentRequest parameter) {
        StudentType pt = new StudentType();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            pt.setFirstName(parameter.getFirstName());
            pt.setLastName(parameter.getLastName());
            pt.setStudentCode(parameter.getStudentCode());
            pt.setProgramme(parameter.getProgramme());
            pt.setAge(parameter.getAge());
            pt.setId(BigInteger.valueOf(nextStudentId++));
            StudentList.add(pt);
        }
        return pt;
    }

    public ee.ttu.idu0075._2015.ws.subject.GetStudentListResponse getStudentList(ee.ttu.idu0075._2015.ws.subject.GetStudentListRequest parameter) {
        GetStudentListResponse response = new GetStudentListResponse();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (StudentType StudentType : StudentList) {
                response.getStudent().add(StudentType);
            }
        }
        return response;
    }

    public ee.ttu.idu0075._2015.ws.subject.SubjectType getSubject(ee.ttu.idu0075._2015.ws.subject.GetSubjectRequest parameter) {
        SubjectType it = null;
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < SubjectList.size(); i++) {
                if (SubjectList.get(i).getId().equals(parameter.getId())) {
                    it = SubjectList.get(i);
                }

            }    
        }
        return it;
    }

    public ee.ttu.idu0075._2015.ws.subject.SubjectType addSubject(ee.ttu.idu0075._2015.ws.subject.AddSubjectRequest parameter) {
        SubjectType it = new SubjectType();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            it.setId(BigInteger.valueOf(nextSubjectId++));
            it.setSubjectName(parameter.getSubjectName());
            it.setSubjectCode(parameter.getSubjectCode());
            it.setTeacher(parameter.getTeacher());
            it.setAssessmentType(parameter.getAssessmentType());
            it.setCredits(parameter.getCredits());
            it.setSubjectStudentList(new SubjectStudentListType());
            SubjectList.add(it);
        }
        return it;
    }

    public ee.ttu.idu0075._2015.ws.subject.GetSubjectListResponse getSubjectList(ee.ttu.idu0075._2015.ws.subject.GetSubjectListRequest parameter) {
        GetSubjectListResponse response = new GetSubjectListResponse();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (SubjectType SubjectType : SubjectList) {
                response.getSubject().add(SubjectType);
            }
        }
        return response;
    }

    public ee.ttu.idu0075._2015.ws.subject.SubjectStudentListType getSubjectStudentList(ee.ttu.idu0075._2015.ws.subject.GetSubjectStudentListRequest parameter) {
        SubjectStudentListType SubjectStudentList = null;
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < SubjectList.size(); i++) {
                if (SubjectList.get(i).getId().equals(parameter.getSubjectId())) {
                    SubjectStudentList = SubjectList.get(i).getSubjectStudentList();
                }

            }    
        }
        return SubjectStudentList;
    }

    public ee.ttu.idu0075._2015.ws.subject.SubjectStudentType addSubjectStudent(ee.ttu.idu0075._2015.ws.subject.AddSubjectStudentRequest parameter) {
        SubjectStudentType SubjectStudent = new SubjectStudentType();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            GetStudentRequest StudentRequest = new GetStudentRequest();
            StudentRequest.setId(parameter.getStudentId());
            StudentRequest.setToken(parameter.getToken());
            SubjectStudent.setStudent(getStudent(StudentRequest));
            SubjectStudent.setGrade(parameter.getGrade());
        
            for (int i = 0; i < SubjectList.size(); i++) {
                if (SubjectList.get(i).getId().equals(parameter.getSubjectId())) {
                    SubjectList.get(i).getSubjectStudentList().getSubjectStudent().add(SubjectStudent);
                    return SubjectStudent;
                }

            } 
        }
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import ee.ttu.idu0075._2015.ws.subject.AddStudentRequest;
import ee.ttu.idu0075._2015.ws.subject.GetStudentRequest;
import ee.ttu.idu0075._2015.ws.subject.StudentType;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author eralti
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean run=true;
    while(run){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Operation number: \n"
                + "1. Add Student\n"
                + "2. Get Student\n");
        String operation=obj.next();
        try{
            int operationInt=Integer.parseInt(operation);
            switch(operationInt){
                case 1: addStudent();                     
                case 2: getStudent();
                case 3: run=false;
        }

        }catch(Exception ex){
            System.out.println("You must enter a number");
            run=false;
            return;
        }
        }
    }
  

    private static void addStudent(){
        Scanner obj=new Scanner(System.in);
        AddStudentRequest request=new AddStudentRequest();
        System.out.println("Enter token: ");
        request.setToken(obj.next());
        System.out.println("First name: ");
        request.setFirstName(obj.next());
        System.out.println("Last name: ");
        request.setLastName(obj.next());
        System.out.println("Student code: ");
        request.setStudentCode(obj.next());
        System.out.println("Programme: ");
        request.setProgramme(obj.next());
        System.out.println("Age: ");
        request.setAge(BigInteger.valueOf(Integer.parseInt(obj.next())));
        addStudent(request);
        System.exit(0);
    }

    private static StudentType addStudent(ee.ttu.idu0075._2015.ws.subject.AddStudentRequest parameter) {
        ee.ttu.idu0075._2015.ws.subject.SubjectService service = new ee.ttu.idu0075._2015.ws.subject.SubjectService();
        ee.ttu.idu0075._2015.ws.subject.SubjectPortType port = service.getSubjectPort();
        return port.addStudent(parameter);
    }
    
        private static void getStudent(){
      
            GetStudentRequest request=new GetStudentRequest();
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter Token: ");
            request.setToken(obj.next());
            System.out.println("Enter id: ");
            request.setId(BigInteger.valueOf(Integer.parseInt(obj.next())));
            StudentType student=getStudent(request);
            System.out.println("id: "+student.getId());
            System.out.println("First name: "+student.getFirstName());
            System.out.println("Last name: "+student.getLastName());
            System.out.println("Student Code: "+student.getStudentCode());
            System.out.println("Programme: "+student.getProgramme());
            System.out.println("Age: "+student.getAge());
            System.exit(0);
            
      
    }

    private static StudentType getStudent(ee.ttu.idu0075._2015.ws.subject.GetStudentRequest parameter) {
        ee.ttu.idu0075._2015.ws.subject.SubjectService service = new ee.ttu.idu0075._2015.ws.subject.SubjectService();
        ee.ttu.idu0075._2015.ws.subject.SubjectPortType port = service.getSubjectPort();
        return port.getStudent(parameter);
    }
    
}

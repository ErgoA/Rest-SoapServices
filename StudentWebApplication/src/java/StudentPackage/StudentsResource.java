/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPackage;

import ee.ttu.idu0075._2015.ws.subject.AddStudentRequest;
import ee.ttu.idu0075._2015.ws.subject.GetStudentListRequest;
import ee.ttu.idu0075._2015.ws.subject.GetStudentListResponse;
import ee.ttu.idu0075._2015.ws.subject.GetStudentRequest;
import ee.ttu.idu0075._2015.ws.subject.StudentType;
import java.math.BigInteger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author eralti
 */
@Path("students")
public class StudentsResource {

    @Context
    private UriInfo context;

    public StudentsResource() {
    }

    @GET
    @Produces("application/json")
    public GetStudentListResponse getStudentList(@QueryParam("token") String token) {
        StudentWebService ws = new StudentWebService();
        GetStudentListRequest request = new GetStudentListRequest();
        request.setToken(token);
        return ws.getStudentList(request);
    }

    @GET
    @Path("{id : //d+}")
    @Produces("application/json")
    public StudentType getStudent(@PathParam("id") String id,
            @QueryParam("token") String token) {
        StudentWebService ws = new StudentWebService();
        GetStudentRequest request = new GetStudentRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getStudent(request);
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public StudentType addStudent(StudentType content,
            @QueryParam("token") String token) {
        StudentWebService ws = new StudentWebService();
        AddStudentRequest request = new AddStudentRequest();
        request.setToken(token);
        request.setFirstName(content.getFirstName());
        request.setLastName(content.getLastName());
        request.setStudentCode(content.getStudentCode());
        request.setProgramme(content.getProgramme());
        request.setAge(content.getAge());
        return ws.addStudent(request);
    }
}

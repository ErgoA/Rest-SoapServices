/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPackage;

import ee.ttu.idu0075._2015.ws.subject.AddSubjectRequest;
import ee.ttu.idu0075._2015.ws.subject.GetSubjectListRequest;
import ee.ttu.idu0075._2015.ws.subject.GetSubjectListResponse;
import ee.ttu.idu0075._2015.ws.subject.GetSubjectRequest;
import ee.ttu.idu0075._2015.ws.subject.SubjectType;
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
@Path("subjects")
public class SubjectsResource {

    @Context
    private UriInfo context;
    
    public SubjectsResource() {
    }

    @GET
    @Produces("application/json")
    public GetSubjectListResponse getSubjectList(@QueryParam("token") String token) {
        StudentWebService ws = new StudentWebService();
        GetSubjectListRequest request = new GetSubjectListRequest();
        request.setToken(token);
        return ws.getSubjectList(request);
    }
    
    @GET
    @Path("{id : \\d+}") //supports digits only
    @Produces("application/json")
    public SubjectType getSubject(@PathParam("id") String id,
            @QueryParam("token") String token) {
        StudentWebService ws = new StudentWebService();
        GetSubjectRequest request = new GetSubjectRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getSubject(request);
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public SubjectType addSubject(SubjectType content, 
                                @QueryParam("token") String token) {
        StudentWebService ws = new StudentWebService();
        AddSubjectRequest request = new AddSubjectRequest();
        request.setToken(token);
        request.setSubjectName(content.getSubjectName());
        request.setSubjectCode(content.getSubjectCode());
        request.setTeacher(content.getTeacher());
        request.setAssessmentType(content.getAssessmentType());
        request.setCredits(content.getCredits());
        return ws.addSubject(request);
    }
}

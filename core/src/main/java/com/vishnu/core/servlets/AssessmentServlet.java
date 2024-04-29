package com.vishnu.core.servlets;

import com.google.gson.Gson;
import com.vishnu.core.models.AssessmentDTO;

import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.servlets.ServletResolverConstants;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.osgi.service.component.annotations.Component;

import java.io.IOException;


@Component(service = {javax.servlet.Servlet.class},
           property = {
               ServletResolverConstants.SLING_SERVLET_PATHS + "=/bin/assessmentServlet",
               ServletResolverConstants.SLING_SERVLET_METHODS + "=" + HttpConstants.METHOD_GET
           })
public class AssessmentServlet extends SlingAllMethodsServlet {

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException {
        // Retrieve JSON data from wherever it's stored in AEM
        String jsonData = "{\n" +
                "  \"id\": \"incididunt\",\n" +
                "  \"partnerId\": \"in aliquip \",\n" +
                "  \"status\": \"nostrud\",\n" +
                "  \"assessmentScore\": -40852550.48466876,\n" +
                "  \"relatedReference\": \"non nostrud nulla\",\n" +
                "  \"assessmentSpecification\": {\n" +
                "    \"id\": \"Excepteur ut amet nostrud\",\n" +
                "    \"name\": \"pariatur enim sunt sint\",\n" +
                "    \"href\": \"sit dolor\"\n" +
                "  },\n" +
                "  \"assessments\": [\n" +
                "    {\n" +
                "      \"assessmentType\": \"minim mollit in\",\n" +
                "      \"overallScore\": 56473039.976335436,\n" +
                "      \"status\": \"occaecat proident laboris\",\n" +
                "      \"statusReason\": \"culpa officia\",\n" +
                "      \"statusChangeDate\": \"mollit laborum esse\",\n" +
                "      \"completionDate\": \"eu sunt\",\n" +
                "      \"startDate\": \"quis qui labore do\",\n" +
                "      \"relatedParty\": [\n" +
                "        {\n" +
                "          \"id\": \"nulla aute tempor in officia\",\n" +
                "          \"name\": \"Lorem magna nulla et\",\n" +
                "          \"role\": \"ullamco cupidatat ea\",\n" +
                "          \"referredType\": \"eu\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"id\": \"eiusmod do aliquip\",\n" +
                "          \"name\": \"non sed\",\n" +
                "          \"role\": \"nulla Duis\",\n" +
                "          \"referredType\": \"proident veniant mollit et ex\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"characteristics\": [\n" +
                "        {\n" +
                "          \"name\": \"amet nisi Ut\",\n" +
                "          \"valueType\": \"et\",\n" +
                "          \"weightage\": 33208473.8130852,\n" +
                "          \"value\": \"Excepteur dolore consequat irure\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"amet irure minim\",\n" +
                "          \"valueType\": \"ad dolor\",\n" +
                "          \"weightage\": 7471900.335429683,\n" +
                "          \"value\": \"dolor aliquip\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"assessmentType\": \"amet labo\",\n" +
                "      \"overallScore\": -79657996.49026613,\n" +
                "      \"status\": \"laboris sint\",\n" +
                "      \"statusReason\": \"ullamco Ut elit\",\n" +
                "      \"statusChangeDate\": \"dolor\",\n" +
                "      \"completionDate\": \"dolor tempor\",\n" +
                "      \"startDate\": \"Ut officia\",\n" +
                "      \"relatedParty\": [\n" +
                "        {\n" +
                "          \"id\": \"caecat Duis cillum velit\",\n" +
                "          \"name\": \"ut nostrud consequat officia\",\n" +
                "          \"role\": \"enim deserunt aute\",\n" +
                "          \"referredType\": \"eiusmod elit Ut id\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        // Parse JSON data and map it to DTO class
        Gson gson = new Gson();
        AssessmentDTO assessmentDTO = gson.fromJson(jsonData, AssessmentDTO.class);

        // Set values for variables in the DTO
        assessmentDTO.setId("one");
        assessmentDTO.setPartnerId("in aliquip");
        assessmentDTO.setStatus("nostrud");
        assessmentDTO.setAssessmentScore(-40852550);
        assessmentDTO.setRelatedReference("non nostrud nulla");

    
        response.setContentType("application/json");
        response.getWriter().write(gson.toJson(assessmentDTO));
    }
}
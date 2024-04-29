package com.vishnu.core.servlets;

import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.ServletResolverConstants;
import org.osgi.service.component.annotations.Component;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

@Component(
        service = Servlet.class,
        property = {
                ServletResolverConstants.SLING_SERVLET_PATHS + "=/bin/print-vishnu",
                ServletResolverConstants.SLING_SERVLET_METHODS + "=GET"
        }
)
public class jack extends SlingAllMethodsServlet {

    @Override
   protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException
{
        // Set content type
        response.setContentType("text/plain");

        // Using PrintWriter
        PrintWriter out = response.getWriter();
        out.println("vishnu");
    }
}

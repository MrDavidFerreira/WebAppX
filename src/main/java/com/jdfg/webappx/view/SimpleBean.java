package com.jdfg.webappx.view;

import javax.faces.view.ViewScoped;
import javax.faces.webapp.FacesServlet;
import java.io.Serializable;

@ViewScoped
public class SimpleBean implements Serializable {
    javax.faces.webapp.FacesServlet facesServlet = new FacesServlet();
}

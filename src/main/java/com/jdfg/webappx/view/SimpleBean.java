package com.jdfg.webappx.view;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class SimpleBean implements Serializable {

    private String byteTexto;

    public String getByteTexto() {
        return byteTexto;
    }

    public void setByteTexto(String byteTexto) {
        this.byteTexto = byteTexto;
    }
}

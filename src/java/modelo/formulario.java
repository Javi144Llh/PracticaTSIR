/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Locale;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author jllaher
 */
@Named(value = "formulario")
@SessionScoped
public class formulario implements Serializable {

    private String a;
    private String localeCode = Locale.getDefault().toString();
    public formulario() {
    }
    public void cambioIdioma(ValueChangeEvent e){
    localeCode = e.getNewValue().toString();
    System.out.println("---> LOCALE: "+ localeCode);
    }

    

    public String getLocaleCode() {
        return localeCode;
    }

    public void setLocaleCode(String localeCode) {
        this.localeCode = localeCode;
    }
}

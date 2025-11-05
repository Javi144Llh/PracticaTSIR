package newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author jllaher
 */
@Named(value = "goTo")
@SessionScoped

public class NavigationManger implements Serializable {

    /**
     * Creates a new instance of NavigationManger
     */
    public NavigationManger() {
        
    }
        public String logout() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().invalidateSession();
        return "paginaSiguiente";

    }

    public String bienvenida() {
        return "paginaSiguiente";
    }

    public String carrito() {
        return "paginaSiguiente";
    }

    public String facturacion() {
        return "paginaSiguiente";
    }

    public String error() {
        return "paginaSiguiente";
    }

    public String login() {
        return "paginaSiguiente";
    }

    // CATEGORIAS WIP
    public String categoria() {
        return "paginaSiguiente";
    }

    public String accion() {
        return "paginaSiguiente";
    }

    public String deportes() {
        return "paginaSiguiente";
    }

    public String fantasia() {
        return "paginaSiguiente";
    }

    public String rpg() {
        return "paginaSiguiente";
    }
}

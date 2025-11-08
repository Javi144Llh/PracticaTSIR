package newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Point;
import java.io.Serializable;
import java.util.Map;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

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
    private Point click;
    private String acc = "acc1", fant = "fant1", dep = "dep1", rpgs = "rpg1";

    public String getAcc() {
        return acc;
    }

    public String setAcc(String acc) {
        this.acc = acc;
        return "paginaSiguiente";
    }

    public String getFant() {
        return fant;
    }

    public String setFant(String fant) {
        this.fant = fant;
        return "paginaSiguiente";
    }

    public String getDep() {
        return dep;
    }

    public String setDep(String dep) {
        this.dep = dep;
        return "paginaSiguiente";
    }

    public String getRpgs() {
        return rpgs;
    }

    public String setRpgs(String rpgs) {
        this.rpgs = rpgs;
        return "paginaSiguiente";
    }

    public String getNombreD() {
        String res;
        switch (dep) {
            case "dep2":
                res = "Lonely Mountains Downhill";
                break;
            case "dep3":
                res = "Descenders";
                break;
            default:
                res = "Skater XL";
        }
        return res;
    }

    public String getNombreA() {
        String res;
        switch (acc) {
            case "acc2":
                res = "Dead Cells";
                break;
            case "acc3":
                res = "Ruiner";
                break;
            default:
                res = "Katana Zero";
        }
        return res;
    }

    public String getNombreF() {
        String res;
        switch (fant) {
            case "fant2":
                res = "Ori and the blind forest";
                break;
            case "fant3":
                res = "Child of Light";
                break;
            default:
                res = "Moonlighter";
        }
        return res;
    }
    
        public String getNombreR(){
        String res;
    switch(rpgs){
        case "rpg2":
            res = "Ender Lilies";
            break;
        case "rpg3":
            res = "GreedFall";
            break;
        default:
            res = "CrossCode";
    }
    return res;
    }

    public NavigationManger() {

    }

    public void oyente(ActionEvent e) {
        FacesContext context = FacesContext.getCurrentInstance();
        String clientId = e.getComponent().getClientId(context);
        Map requestParams = context.getExternalContext().getRequestParameterMap();
        int x = new Integer((String) requestParams.get(clientId + ".x"));
        int y = new Integer((String) requestParams.get(clientId + ".y"));
        click = new Point(x, y);
        System.out.println("---> ACTION EVENT: " + e.toString());
        System.out.println("---> COORDS: " + click.toString());
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

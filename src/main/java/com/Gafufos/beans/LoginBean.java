/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Gafufos.beans;

import com.Gafufos.Controllers.LoginControl;
import com.Gafufos.Utils.Constants;
import com.Gafufos.Utils.JsfUtil;
import com.Gafufos.Utils.Navigation;
import com.Gafufos.entidades.Usuarios;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Gonza
 */
@ManagedBean
@RequestScoped
public class LoginBean implements Serializable{
    
    @EJB
    LoginControl loginControl;
    
    private Usuarios user;
    
    public Usuarios getUser() {
        if (user == null) {
            user = new Usuarios();
        }
        return user;
    }

    public void setUser(Usuarios user) {
        this.user = user;
    }
    
//    public void access(){
//        String dummy_user = "ammoraleso";
//        String dummy_pass = "123";
//        FacesContext context = FacesContext.getCurrentInstance();
//        //I use JDBC PostgreSQL driver for find the users in table "users"
//        if (user.getIdUsuario().equals(dummy_user) && user.getPassword().equals(dummy_pass)) {
//            //Here you must put your code to redirect or do something 
//            context.addMessage(null, new FacesMessage("Successful login",  "You are logged in") );
//        }
//        else{
//            context.addMessage(null, new FacesMessage("Wrong access",  "Use rahma and 123") );
//        }s
//    }
    
    public String login(){
        switch(loginControl.login(user)){
            case Constants.LOGIN_OK:
                return Navigation.PAGE_INDEX;
            case Constants.EXPIRED_USER:
                //JsfUtil.addErrorMessage(BundleUtils.getBundleProperty("ExpiredError"));
                return "";
            case Constants.LOGIN_FAIL:
                //JsfUtil.addErrorMessage(BundleUtils.getBundleProperty("LoginError"));
                return "";
            default:
                JsfUtil.addTecnicalErrorMessage();
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, Constants.LOGGER_ERROR_MESSAGE+"unexpected behavior: Tecnical error in login method");
                return "";
        }
    }
    
    public String logout(){
        loginControl.logout();
        return Navigation.PAGE_LOGIN;//Redirect to login
    }
    
    public void validSession(){
        if(!loginControl.validSession()){
            JsfUtil.redirectTo("");//Redirect to login  
        }
    }
}

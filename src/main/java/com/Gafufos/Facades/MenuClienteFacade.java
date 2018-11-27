/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Gafufos.Facades;

import com.Gafufos.entidades.MenuCliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author chernandez
 */
@Stateless
public class MenuClienteFacade extends AbstractQueryFacade<MenuCliente> {

    @PersistenceContext(unitName = "com.mycompany_InstaShop_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MenuClienteFacade() {
        super(MenuCliente.class);
    }
    
}

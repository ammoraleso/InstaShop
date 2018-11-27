/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Gafufos.Facades;

import com.Gafufos.entidades.MenuGafufos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author andre
 */
@Stateless
public class MenuGafufosFacade extends AbstractQueryFacade<MenuGafufos> {

    @PersistenceContext(unitName = "com.mycompany_InstaShop_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MenuGafufosFacade() {
        super(MenuGafufos.class);
    }
    
}

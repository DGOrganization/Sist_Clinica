/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.com.dgo.bean;

import clinica.com.dgo.entidades.Articulos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author gerardo
 */
@Stateless
public class ArticulosFacade extends AbstractFacade<Articulos> {

    @PersistenceContext(unitName = "ClinicaE_MEA-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ArticulosFacade() {
        super(Articulos.class);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.com.dgo.bean;

import clinica.com.dgo.controlador.CategoriaJpaController;
import clinica.com.dgo.entidades.Categoria;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author gerardo
 */
public class JavaBeanCategoria {
    private EntityManagerFactory emf;
    private CategoriaJpaController catControl;
    public JavaBeanCategoria(){
        emf=Persistence.createEntityManagerFactory("ClinicaE_MEA-warPU");
        catControl = new CategoriaJpaController(emf);
    }
    public void guardar(Categoria cat){
        try {
            catControl.create(cat);
        } catch (Exception ex) {
            Logger.getLogger(JavaBeanCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

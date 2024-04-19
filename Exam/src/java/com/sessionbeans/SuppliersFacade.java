package com.sessionbeans;

import com.entities.Suppliers;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class SuppliersFacade extends AbstractFacade<Suppliers> implements SuppliersFacadeLocal {

    @PersistenceContext(unitName = "ExamPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SuppliersFacade() {
        super(Suppliers.class);
    }

    @Override
    public List<Suppliers> search() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

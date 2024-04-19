package com.managedbeans;

import com.entities.Suppliers;
import com.sessionbeans.SuppliersFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

@Named(value = "supplierManagedBean")
@SessionScoped
public class supplierManagedBean implements Serializable {

    @EJB
    private SuppliersFacadeLocal suppliersFacade;

    private String name;
    private String address;
    private String email;
    private String phone;

    private Suppliers supplier = new Suppliers();

    public supplierManagedBean() {
    }

    public List<Suppliers> listSuppliers() {
        return suppliersFacade.findAll();
    }

    public String addSupplier() {
        return "addForm.xhtml?faces-redirect=true";
    }

    public String addProcess() {
        Suppliers sup = new Suppliers();

        sup.setName(name);
        sup.setAddress(address);
        sup.setPhone(phone);
        sup.setEmail(email);

        suppliersFacade.create(sup);
        return "index.xhtml?faces-redirect=true";
    }

    public String updateSupplier(Integer id) {
        supplier = suppliersFacade.find(id);
        return "updateForm.xhtml?faces-redirect=true;id=" + id;
    }

    public String updateProcess() {
        suppliersFacade.edit(supplier);
        return "index.xhtml?faces-redirect=true";
    }

    public String deleteProcess(Integer id) {
        Suppliers sup = suppliersFacade.find(id);
        suppliersFacade.remove(sup);
        return "index.xhtml?faces-redirect=true";
    }

    public SuppliersFacadeLocal getSuppliersFacade() {
        return suppliersFacade;
    }

    public void setSuppliersFacade(SuppliersFacadeLocal suppliersFacade) {
        this.suppliersFacade = suppliersFacade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Suppliers getSupplier() {
        return supplier;
    }

    public void setSupplier(Suppliers supplier) {
        this.supplier = supplier;
    }

}

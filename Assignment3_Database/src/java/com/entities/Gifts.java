/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TUONG
 */
@Entity
@Table(name = "Gifts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gifts.findAll", query = "SELECT g FROM Gifts g"),
    @NamedQuery(name = "Gifts.findByGiftID", query = "SELECT g FROM Gifts g WHERE g.giftID = :giftID"),
    @NamedQuery(name = "Gifts.findByGiftName", query = "SELECT g FROM Gifts g WHERE g.giftName = :giftName"),
    @NamedQuery(name = "Gifts.findByPrice", query = "SELECT g FROM Gifts g WHERE g.price = :price"),
    @NamedQuery(name = "Gifts.findByColors", query = "SELECT g FROM Gifts g WHERE g.colors = :colors"),
    @NamedQuery(name = "Gifts.findByCategory", query = "SELECT g FROM Gifts g WHERE g.category = :category")})
public class Gifts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "GiftID")
    private Integer giftID;
    @Size(max = 255)
    @Column(name = "GiftName")
    private String giftName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Price")
    private Double price;
    @Size(max = 100)
    @Column(name = "Colors")
    private String colors;
    @Size(max = 100)
    @Column(name = "Category")
    private String category;

    public Gifts() {
    }

    public Gifts(Integer giftID) {
        this.giftID = giftID;
    }

    public Integer getGiftID() {
        return giftID;
    }

    public void setGiftID(Integer giftID) {
        this.giftID = giftID;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (giftID != null ? giftID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gifts)) {
            return false;
        }
        Gifts other = (Gifts) object;
        if ((this.giftID == null && other.giftID != null) || (this.giftID != null && !this.giftID.equals(other.giftID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.Gifts[ giftID=" + giftID + " ]";
    }
    
}

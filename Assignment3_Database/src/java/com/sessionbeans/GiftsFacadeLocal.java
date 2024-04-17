/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sessionbeans;

import com.entities.Gifts;
import java.util.List;
import javax.ejb.Local;

@Local
public interface GiftsFacadeLocal {

    void create(Gifts gifts);

    void edit(Gifts gifts);

    void remove(Gifts gifts);

    Gifts find(Object id);

    List<Gifts> findAll();

    List<Gifts> findRange(int[] range);

    int count();
    
}

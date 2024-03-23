package com.controllers;

import com.models.Shipper;
import com.models.ShipperDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ShipperController {

    @Autowired
    private ShipperDAO shipperDAO;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String showListShipper(ModelMap model) {
        model.addAttribute("listShipper", shipperDAO.findAll());
        return "index";
    }

    @RequestMapping(value = "findShipper", method = RequestMethod.GET)
    public String findShipper(String keyword, ModelMap model) {
        List<Shipper> listShipper = shipperDAO.find(keyword);
        model.addAttribute("listShipper", listShipper);
        return "index";
    }

    @RequestMapping(value = "addForm", method = RequestMethod.GET)
    public String showAddShipperForm() {
        return "shipperAdd";
    }

    @ModelAttribute("shipper")
    public Shipper setShipperForm() {
        return new Shipper();
    }

    @RequestMapping(value = "addShipper", method = RequestMethod.POST)
    public String addShipper(@ModelAttribute("shipper") Shipper shipper, ModelMap model) {
        shipperDAO.add(shipper);
        return showListShipper(model);
    }

    @RequestMapping(value = "showUpdateForm", method = RequestMethod.GET)
    public String showUpdateShipperForm(int id, ModelMap model) {
        Shipper shipper = shipperDAO.get(id);
        model.addAttribute("shipperID", shipper.getShipperID());
        model.addAttribute("companyName", shipper.getCompanyName());
        model.addAttribute("phone", shipper.getPhone());
        return "shipperUpdate";
    }

    @RequestMapping(value = "updateShipper", method = RequestMethod.POST)
    public String updateShipper(@ModelAttribute("shipper") Shipper shipper, ModelMap model) {
        shipperDAO.update(shipper);
        return showListShipper(model);
    }

    @RequestMapping(value = "deleteShipper", method = RequestMethod.GET)
    public String deleteShipper(int id, ModelMap model) {
        shipperDAO.delete(id);
        return showListShipper(model);
    }
}

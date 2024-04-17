package com.controllers;

import com.entities.Gifts;
import com.entities.Orders;
import com.entities.Users;
import com.sessionbeans.GiftsFacadeLocal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class GiftController {

    GiftsFacadeLocal giftsFacade = lookupGiftsFacadeLocal();

    List<Gifts> giftItems = giftsFacade.findAll();
    
    @ModelAttribute("gifts")
    public Gifts setGift() {
        return new Gifts();
    }

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String redirectGreetingPage(ModelMap model) {
        model.addAttribute("userName", new Users());
        model.addAttribute("gifts", giftItems);
        return "index";
    }

    @RequestMapping(value = "greeting", method = RequestMethod.POST)
    public String greeting(@ModelAttribute("userName") Users user, ModelMap model) {
        String name = user.getName();
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping(value = "gift/{giftID}", method = RequestMethod.GET)
    public String displayGiftDetails(@PathVariable("giftID") Integer giftID, ModelMap model) {
        model.addAttribute("gift", giftsFacade.find(giftID));
        return "giftDetails";
    }

    @RequestMapping(value = "orders", method = RequestMethod.POST)
    public String orderGifts(@RequestParam(required = false) List<Integer> giftIds, ModelMap model) {
        if (giftIds == null || giftIds.isEmpty()) {
            model.addAttribute("checkGiftIdEmpty", true);
            model.addAttribute("initName", new Users());
            model.addAttribute("gifts", giftItems);
            return "index";
        }
        double totalPrice = 0.0;
        final double MINPRICEDISCOUNT = 5000.00;
        final double PRICEDISCOUNT = 0.9; // Apply 10% discount
        int quantity = 0;
        List<Orders> orderList = new ArrayList<>();
        for (long giftId : giftIds) {
            for (Gifts giftItem : giftItems) {
                if (giftItem.getGiftID() == giftId ) {
                    quantity += 1;
                    double discount = giftItem.getPrice() >= MINPRICEDISCOUNT ? PRICEDISCOUNT : 0.0;
                    totalPrice = calculateDiscountPrice(giftItem.getPrice(), MINPRICEDISCOUNT, PRICEDISCOUNT, model);
                    Orders order = new Orders(giftItem.getGiftID(), giftItem.getGiftName(), quantity, discount, giftItem.getPrice(), totalPrice, totalPrice, giftItem.getColors(), giftItem.getCategory());
                    orderList.add(order);
                    break;
                }
            }
        }
        model.addAttribute("orderedGifts", orderList);
        model.addAttribute("totalPrice", totalPrice);
        return "orders";

    }

    private double calculateDiscountPrice(double amount, double discountPrice, double discount, ModelMap model) {
        if (amount >= discountPrice) {
            model.addAttribute("discountApplied", true);
            return amount * discount;
        }
        return amount;
    }
    
    private GiftsFacadeLocal lookupGiftsFacadeLocal() {
        try {
            Context c = new InitialContext();
            return (GiftsFacadeLocal) c.lookup("java:global/Assignment3_Database/GiftsFacade!com.sessionbeans.GiftsFacadeLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
}

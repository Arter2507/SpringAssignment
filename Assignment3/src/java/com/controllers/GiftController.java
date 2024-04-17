package com.controllers;

import com.models.Gifts;
import com.models.Orders;
import com.models.Users;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class GiftController {

    private static List<Gifts> giftItems = new ArrayList<>();

    {
        giftItems.add(new Gifts(1, "Stuffed Animal", 7000.00, "Red", "Toy"));
        giftItems.add(new Gifts(2, "Leather Wallet", 3500.00, "Blue", "Wallet"));
        giftItems.add(new Gifts(3, "Metal Keychain", 1000.00, "Yellow", "Key chain"));
        giftItems.add(new Gifts(4, "Board Game", 4500.00, "White", "Toy"));
        giftItems.add(new Gifts(5, "Scarameow Keychain", 1500.00, "Blue", "Key chain"));
    }

    public Gifts getGiftById(long id) {
        for (Gifts gift : giftItems) {
            if (gift.getGiftID() == id) {
                return gift;
            }
        }
        return null;
    }

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
    public String displayGiftDetails(@PathVariable("giftID") long giftID, ModelMap model) {
        model.addAttribute("gift", getGiftById(giftID));
        return "giftDetails";
    }

    @RequestMapping(value = "orders", method = RequestMethod.POST)
    public String orderGifts(@RequestParam(required = false) List<Long> giftIds, ModelMap model) {
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

}

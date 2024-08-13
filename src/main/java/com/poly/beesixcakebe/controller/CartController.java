package com.poly.beesixcakebe.controller;

import com.poly.beesixcakebe.model.Cart;
import com.poly.beesixcakebe.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping
    public List<Cart> getAllCart() {
        return cartService.getAllCart();
    }

    @GetMapping("/{idcart}")
    public Cart getCartById(@PathVariable Integer idcart) {
        return cartService.getCartById(idcart);
    }

    @PostMapping
    public Cart createCart(@RequestBody Cart cart) {
        return cartService.createCart(cart);
    }

    @PutMapping("/{idcart}")
    public Cart updateCart(@PathVariable Integer idcart, @RequestBody Cart cartDetails) {
        return cartService.updateCart(idcart, cartDetails);
    }

    @DeleteMapping("/{idcart}")
    public void deleteCart(@PathVariable Integer idcart) {
        cartService.deleteCart(idcart);
    }

    @GetMapping("/pricetosize/{idpricetosize}")
    public List<Cart> findByPricetosize_Idpricetosize(@PathVariable Integer idpricetosize) {
        return cartService.findByPricetosize_Idpricetosize(idpricetosize);
    }
    @GetMapping("/account/{idaccount}")
    public List<Cart> findByAccount_Idaccount(@PathVariable String idaccount) {
        return cartService.findByAccount_Idaccount(idaccount);
    }
}

package com.poly.beesixcakebe.service;

import com.poly.beesixcakebe.model.Cart;
import com.poly.beesixcakebe.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public List<Cart> getAllCart() {
        return cartRepository.findAll();
    }

    public Cart getCartById(Integer idcart) {
        return cartRepository.findById(idcart).orElse(null);
    }

    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public Cart updateCart(Integer idcart, Cart cartDetails) {
        Cart cart = cartRepository.findById(idcart).orElse(null);
        if (cart != null) {
            cart.setQuantity(cartDetails.getQuantity());
            return cartRepository.save(cart);
        }
        return null;
    }

    public void deleteCart(Integer idcart) {
        cartRepository.deleteById(idcart);
    }

    public List<Cart> findByPricetosize_Idpricetosize(Integer idpricetosize) {
        return cartRepository.findByPricetosize_Idpricetosize(idpricetosize);
    }
    public List<Cart> findByAccount_Idaccount(String idaccount) {
        return cartRepository.findByAccount_Idaccount(idaccount);
    }
}

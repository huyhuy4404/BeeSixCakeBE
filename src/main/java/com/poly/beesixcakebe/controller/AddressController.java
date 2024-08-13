package com.poly.beesixcakebe.controller;

import com.poly.beesixcakebe.model.Address;
import com.poly.beesixcakebe.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<Address> getAllAddress() {
        return addressService.getAllAddress();
    }

    @GetMapping("/{idaddress}")
    public Address getAddressById(@PathVariable Integer idaddress) {
        return addressService.getAddressById(idaddress);
    }

    @PostMapping
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }

    @PutMapping("/{idaddress}")
    public Address updateAddress(@PathVariable Integer idaddress, @RequestBody Address addressDetails) {
        return addressService.updateAddress(idaddress, addressDetails);
    }

    @DeleteMapping("/{idaddress}")
    public void deleteAddress(@PathVariable Integer idaddress) {
        addressService.deleteAddress(idaddress);
    }

    @GetMapping("/account/{idaccount}")
    public List<Address> findByAccount_Idaccount(@PathVariable String idaccount) {
        return addressService.findByAccount_Idaccount(idaccount);
    }
}

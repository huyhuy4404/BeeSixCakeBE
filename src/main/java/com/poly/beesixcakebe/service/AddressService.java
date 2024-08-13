package com.poly.beesixcakebe.service;

import com.poly.beesixcakebe.model.Address;
import com.poly.beesixcakebe.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    public Address getAddressById(Integer idaddress) {
        return addressRepository.findById(idaddress).orElse(null);
    }

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    public Address updateAddress(Integer idaddress, Address addressDetails) {
        Address address = addressRepository.findById(idaddress).orElse(null);
        if (address != null) {
            address.setHousenumber(addressDetails.getHousenumber());
            address.setCity(addressDetails.getCity());
            address.setWard(addressDetails.getWard());
            address.setStreet(addressDetails.getStreet());
            address.setDistrict(addressDetails.getDistrict());
            address.setPhonenumber(addressDetails.getPhonenumber());
            address.setFullname(addressDetails.getFullname());
            return addressRepository.save(address);
        }
        return null;
    }

    public void deleteAddress(Integer idaddress) {
        addressRepository.deleteById(idaddress);
    }

    public List<Address> findByAccount_Idaccount(String idaccount) {
        return addressRepository.findByAccount_Idaccount(idaccount);
    }
}

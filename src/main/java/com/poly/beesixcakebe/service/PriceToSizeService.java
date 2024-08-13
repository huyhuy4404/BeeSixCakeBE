package com.poly.beesixcakebe.service;

import com.poly.beesixcakebe.model.PriceToSize;
import com.poly.beesixcakebe.repository.PriceToSizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceToSizeService {
    @Autowired
    private PriceToSizeRepository priceToSizeRepository;

    public List<PriceToSize> getAllPriceToSize() {
        return priceToSizeRepository.findAll();
    }

    public PriceToSize getPriceToSizeById(Integer idpricetosize) {
        return priceToSizeRepository.findById(idpricetosize).orElse(null);
    }

    public PriceToSize createPriceToSize(PriceToSize priceToSize) {
        return priceToSizeRepository.save(priceToSize);
    }

    public PriceToSize updatePriceToSize(Integer idpricetosize, PriceToSize priceToSizeDetails) {
        PriceToSize priceToSize = priceToSizeRepository.findById(idpricetosize).orElse(null);
        if (priceToSize != null) {
            priceToSize.setPrice(priceToSizeDetails.getPrice());
            priceToSize.setQuantity(priceToSizeDetails.getQuantity());
            priceToSize.setSize(priceToSizeDetails.getSize());
            return priceToSizeRepository.save(priceToSize);
        }
        return null;
    }

    public void deletePriceToSize(Integer idpricetosize) {
        priceToSizeRepository.deleteById(idpricetosize);
    }

    public List<PriceToSize> findBySize_Idsize(Integer idsize) {
        return priceToSizeRepository.findBySize_Idsize(idsize);
    }
}



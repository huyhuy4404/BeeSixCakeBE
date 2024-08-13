package com.poly.beesixcakebe.controller;

import com.poly.beesixcakebe.model.PriceToSize;
import com.poly.beesixcakebe.service.PriceToSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pricetosize")
public class PriceToSizeController {
    @Autowired
    private PriceToSizeService priceToSizeService;

    @GetMapping
    public List<PriceToSize> getAllPriceToSize() {
        return priceToSizeService.getAllPriceToSize();
    }

    @GetMapping("/{idpricetosize}")
    public PriceToSize getPriceToSizeById(@PathVariable Integer idpricetosize) {
        return priceToSizeService.getPriceToSizeById(idpricetosize);
    }

    @PostMapping
    public PriceToSize createPriceToSize(@RequestBody PriceToSize priceToSize) {
        return priceToSizeService.createPriceToSize(priceToSize);
    }

    @PutMapping("/{idpricetosize}")
    public PriceToSize updatePriceToSize(@PathVariable Integer idpricetosize, @RequestBody PriceToSize priceToSizeDetails) {
        return priceToSizeService.updatePriceToSize(idpricetosize, priceToSizeDetails);
    }

    @DeleteMapping("/{idpricetosize}")
    public void deletePriceToSize(@PathVariable Integer idpricetosize) {
        priceToSizeService.deletePriceToSize(idpricetosize);
    }

    @GetMapping("/size/{idsize}")
    public List<PriceToSize> findBySize_Idsize(@PathVariable Integer idsize) {
        return priceToSizeService.findBySize_Idsize(idsize);
    }
}


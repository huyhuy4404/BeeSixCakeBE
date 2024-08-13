package com.poly.beesixcakebe.controller;

import com.poly.beesixcakebe.model.Size;
import com.poly.beesixcakebe.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/size")
public class SizeController {
    @Autowired
    private SizeService sizeService;

    @GetMapping
    public List<Size> getAllSize() {
        return sizeService.getAllSize();
    }

    @GetMapping("/{idsize}")
    public Size getSizeById(@PathVariable Integer idsize) {
        return sizeService.getSizeById(idsize);
    }

    @PostMapping
    public Size createSize(@RequestBody Size size) {
        return sizeService.createSize(size);
    }

    @PutMapping("/{idsize}")
    public Size updateSize(@PathVariable Integer idsize, @RequestBody Size sizeDetails) {
        return sizeService.updateSize(idsize, sizeDetails);
    }

    @DeleteMapping("/{idsize}")
    public void deleteSize(@PathVariable Integer idsize) {
        sizeService.deleteSize(idsize);
    }

    @GetMapping("/product/{idproduct}")
    public List<Size> getSizeByProductId(@PathVariable Integer idproduct) {
        return sizeService.getSizeByProductId(idproduct);
    }
}

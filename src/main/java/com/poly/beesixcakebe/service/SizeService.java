package com.poly.beesixcakebe.service;

import com.poly.beesixcakebe.model.Size;
import com.poly.beesixcakebe.repository.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeService {
    @Autowired
    private SizeRepository sizeRepository;

    public List<Size> getAllSize() {
        return sizeRepository.findAll();
    }

    public Size getSizeById(Integer idsize) {
        return sizeRepository.findById(idsize).orElse(null);
    }

    public Size createSize(Size size) {
        return sizeRepository.save(size);
    }

    public Size updateSize(Integer idsize, Size sizeDetails) {
        Size size = sizeRepository.findById(idsize).orElse(null);
        if (size != null) {
            size.setSizename(sizeDetails.getSizename());
            return sizeRepository.save(size);
        }
        return null;
    }

    public void deleteSize(Integer idsize) {
        sizeRepository.deleteById(idsize);
    }

    public List<Size> getSizeByProductId(Integer idproduct) {
        return sizeRepository.findByProduct_Idproduct(idproduct);
    }
}

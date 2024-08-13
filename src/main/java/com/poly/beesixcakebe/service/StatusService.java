package com.poly.beesixcakebe.service;

import com.poly.beesixcakebe.model.Status;
import com.poly.beesixcakebe.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {
    @Autowired
    private StatusRepository statusRepository;

    public List<Status> getAllStatus() {
        return statusRepository.findAll();
    }

    public Status getStatusById(Integer idstatus) {
        return statusRepository.findById(idstatus).orElse(null);
    }

    public Status createStatus(Status status) {
        return statusRepository.save(status);
    }

    public Status updateStatus(Integer idstatus, Status statusDetails) {
        Status status = statusRepository.findById(idstatus).orElse(null);
        if (status != null) {
            status.setIdstatus(statusDetails.getIdstatus());
            status.setStatusname(statusDetails.getStatusname());
            return statusRepository.save(status);
        }
        return null;
    }

    public void deleteStatus(Integer idstatus) {
        statusRepository.deleteById(idstatus);
    }
}

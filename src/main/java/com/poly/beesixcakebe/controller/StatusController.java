package com.poly.beesixcakebe.controller;

import com.poly.beesixcakebe.model.Status;
import com.poly.beesixcakebe.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/status")
public class StatusController {
    @Autowired
    private StatusService statusService;

    @GetMapping
    public List<Status> getAllStatus() {
        return statusService.getAllStatus();
    }

    @GetMapping("/{idstatus}")
    public Status getStatusById(@PathVariable Integer idstatus) {
        return statusService.getStatusById(idstatus);
    }

    @PostMapping
    public Status createStatus(@RequestBody Status status) {
        return statusService.createStatus(status);
    }

    @PutMapping("/{idstatus}")
    public Status updateStatus(@PathVariable Integer idstatus, @RequestBody Status statusDetails) {
        return statusService.updateStatus(idstatus, statusDetails);
    }

    @DeleteMapping("/{idstatus}")
    public void deleteStatus(@PathVariable Integer idstatus) {
        statusService.deleteStatus(idstatus);
    }
}


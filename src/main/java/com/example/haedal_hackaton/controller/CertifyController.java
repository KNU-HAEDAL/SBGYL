package com.example.haedal_hackaton.controller;

import com.example.haedal_hackaton.dto.CertifySaveRequestDto;
import com.example.haedal_hackaton.service.CertifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CertifyController {

    private CertifyService certifyService;

    @Autowired
    public CertifyController(CertifyService certifyService) {
        this.certifyService = certifyService;
    }

    @PostMapping("/api/mission")
    public Long save(@RequestBody CertifySaveRequestDto certifySaveRequestDto){
        return certifyService.save(certifySaveRequestDto);
    }
}

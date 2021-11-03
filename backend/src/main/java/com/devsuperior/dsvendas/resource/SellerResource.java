package com.devsuperior.dsvendas.resource;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sellers")
public class SellerResource {

    @Autowired
    private SellerService sellerService;

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll() {
        return ResponseEntity.ok(sellerService.findAll());
    }
}

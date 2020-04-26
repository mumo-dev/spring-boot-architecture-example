package com.mumo.myshop.controller;

import com.mumo.myshop.dto.SellerDto;
import com.mumo.myshop.services.SellerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor

@RestController
@RequestMapping("/api/v1/seller")
public class SellerController {

    private final SellerService sellerService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public SellerDto createSeller(@RequestBody SellerDto sellerDto) {
        return sellerService.create(sellerDto);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<SellerDto> getAllSellers() {
        return  sellerService.getAll();
    }
}

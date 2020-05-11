package com.mumo.myshop.services;


import com.mumo.myshop.dto.SellerDto;
import com.mumo.myshop.mappers.SellerMapper;
import com.mumo.myshop.models.Seller;
import com.mumo.myshop.repository.SellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@AllArgsConstructor
@Service
public class SellerService {

    private final SellerRepository sellerRepository;
    private final SellerMapper sellerMapper;


    public SellerDto create(SellerDto sellerDto) {

        Seller seller = sellerMapper.convertToEntity(sellerDto);
        seller = sellerRepository.save(seller);
        return sellerMapper.convertToDto(seller);
    }

    public List<SellerDto> getAll() {

        return sellerRepository.findAll()
                .stream()
                .map(sellerMapper::convertToDto)
                .collect(Collectors.toList());
    }

}
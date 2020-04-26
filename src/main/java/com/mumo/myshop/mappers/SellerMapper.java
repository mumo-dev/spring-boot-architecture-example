package com.mumo.myshop.mappers;

import com.mumo.myshop.dto.SellerDto;
import com.mumo.myshop.dto.UserDto;
import com.mumo.myshop.models.Seller;
import com.mumo.myshop.models.User;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class SellerMapper {


    private final ModelMapper modelMapper;

    public Seller convertToEntity(SellerDto sellerDto) {

        Seller seller =  modelMapper.map(sellerDto, Seller.class);

        return  seller;
    }


    public   SellerDto convertToDto(Seller seller) {

        SellerDto sellerDto =  modelMapper.map(seller, SellerDto.class);
        return  sellerDto;
    }
}

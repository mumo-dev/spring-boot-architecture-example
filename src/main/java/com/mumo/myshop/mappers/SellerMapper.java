package com.mumo.myshop.mappers;

import com.mumo.myshop.dto.SellerDto;
import com.mumo.myshop.models.Seller;
import com.mumo.myshop.models.User;

import org.springframework.stereotype.Component;

@Component
public class SellerMapper {


    public Seller convertToEntity(SellerDto sellerDto) {

        Seller seller =  new Seller();
        seller.setId(sellerDto.getId());
        seller.setApproved(sellerDto.getApproved());
        seller.setCompanyName(sellerDto.getCompanyName());
        
        User user = new User();
        user.setEmail(sellerDto.getEmail());
        user.setFirstName(sellerDto.getFirstName());
        user.setLastName(sellerDto.getLastName());
        seller.setUser(user);

        return  seller;
    }


    public   SellerDto convertToDto(Seller seller) {

        SellerDto sellerDto =  new SellerDto()
        .setId(seller.getId())
        .setApproved(seller.getApproved())
        .setCompanyName(seller.getCompanyName())
        .setEmail(seller.getUser().getEmail())
        .setFirstName(seller.getUser().getFirstName())
        .setLastName(seller.getUser().getLastName());
        return  sellerDto;
    }
}

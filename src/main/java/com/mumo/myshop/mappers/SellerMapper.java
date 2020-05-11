package com.mumo.myshop.mappers;

import com.mumo.myshop.dto.SellerDto;
import com.mumo.myshop.models.Seller;
import com.mumo.myshop.models.User;

import org.springframework.stereotype.Component;

@Component
public class SellerMapper {


    public Seller convertToEntity(SellerDto sellerDto) {

        Seller seller =  new Seller();
        seller.setId(sellerDto.id());
        seller.setApproved(sellerDto.approved());
        seller.setCompanyName(sellerDto.companyName());
        
        User user = new User();
        user.setEmail(sellerDto.email());
        user.setFirstName(sellerDto.firstName());
        user.setLastName(sellerDto.lastName());
        seller.setUser(user);

        return  seller;
    }


    public   SellerDto convertToDto(Seller seller) {

        SellerDto sellerDto =  new SellerDto()
        .id(seller.getId())
        .approved(seller.getApproved())
        .companyName(seller.getCompanyName())
        .email(seller.getUser().getEmail())
        .firstName(seller.getUser().getFirstName())
        .lastName(seller.getUser().getLastName());
        return  sellerDto;
    }
}

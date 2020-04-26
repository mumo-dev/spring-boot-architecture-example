package com.mumo.myshop.mappers;

public interface AbstractMapper<E, D>{

    E convertToEntity( D d);

    D convertToDto( E e);
}

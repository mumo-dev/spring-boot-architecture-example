package com.mumo.myshop.services;

import java.util.List;

public interface AbstractService<T> {

    List<T> getAll();
}

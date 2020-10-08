package com.mobike.demo.models.services;

import com.mobike.demo.models.entity.Bike;

import java.util.List;

public interface IBikeService {

  public List<Bike> findAll();

  public void save(Bike bike);

  public Bike findOne(Long id);

  public void delete(Long id);
}

package com.mobike.demo.models.services;

import com.mobike.demo.models.dao.IBikeDao;
import com.mobike.demo.models.entity.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BikeServiceImpl implements IBikeService {

  @Autowired
  private IBikeDao iBikeDao;

  @Override
  @Transactional(readOnly = true)
  public List<Bike> findAll() {
    return (List<Bike>) iBikeDao.findAll();
  }

  @Override
  @Transactional
  public void save(Bike bike) {
    iBikeDao.save(bike);
  }

  @Override
  @Transactional(readOnly = true)
  public Bike findOne(Long id) {
    return iBikeDao.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public void delete(Long id) {
    iBikeDao.deleteById(id);
  }
}

package com.mobike.demo.models.dao;

import com.mobike.demo.models.entity.Bike;
import org.springframework.data.repository.CrudRepository;

public interface IBikeDao extends CrudRepository<Bike, Long> {

}

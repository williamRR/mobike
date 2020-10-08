package com.mobike.demo.models.dao;

import com.mobike.demo.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUserDao extends CrudRepository<Usuario, Long> {
}

package com.mobike.demo.models.services;

import com.mobike.demo.models.dao.IUserDao;
import com.mobike.demo.models.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

  @Autowired
  private IUserDao iUserDao;

  @Override
  public List<Usuario> findAll() {
    return (List<Usuario>) iUserDao.findAll();
  }

  @Override
  public void save(Usuario usuario) {
    iUserDao.save(usuario);
  }

  @Override
  public Usuario findOne(Long id) {
    return iUserDao.findById(id).orElse(null);
  }

  @Override
  public void delete(Long id) {
    iUserDao.deleteById(id);
  }
}

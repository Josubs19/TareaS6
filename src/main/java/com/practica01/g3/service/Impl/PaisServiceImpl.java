package com.practica01.g3.service.Impl;

import com.practica01.g3.dao.PaisDao;
import com.practica01.g3.domain.Pais;
import com.practica01.g3.service.PaisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PaisServiceImpl implements PaisService {

    @Autowired
    private PaisDao paisDao;

    @Override
    @Transactional(readOnly = true)
    public List<Pais> getPais() {
        return paisDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Pais getPais(Pais pais) {
        return paisDao.findById(pais.getIdPais()).orElse(null);
    }

    @Override   
    @Transactional
    public void save(Pais pais) {
        paisDao.save(pais);
    }

    @Override
    public void delete(Pais pais) {
        paisDao.delete(pais);

    }

}

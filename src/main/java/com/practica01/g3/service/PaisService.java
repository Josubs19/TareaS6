package com.practica01.g3.service;

import com.practica01.g3.domain.Pais;
import java.util.List;

public interface PaisService {
    public List<Pais> getPais();
    
    public Pais getPais(Pais pais);
    
    public void save(Pais pais);
    
    public void delete(Pais pais);

    
}

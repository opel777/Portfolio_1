package com.GustavoVillegas.Portfolio_1.service;

import com.GustavoVillegas.Portfolio_1.model.Experience;
import java.util.List;

public interface IExperienceService {
    
    public List<Experience> verExperiencias ();
    
    public Experience crearExperiencia (Experience exp);
    
    public void borrarExperiencia ( Long id);
    
   
    
    
}

package com.GustavoVillegas.Portfolio_1.service;

import com.GustavoVillegas.Portfolio_1.model.Education;
import java.util.List;



public interface IEducationService {
    
     public List<Education> verEducaciones ();
    
    public Education crearEducacion (Education educ);
    
    public void borrarEducacion ( Long id);
    
   
    
}

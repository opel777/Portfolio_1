package com.GustavoVillegas.Portfolio_1.service;

import com.GustavoVillegas.Portfolio_1.model.Education;
import com.GustavoVillegas.Portfolio_1.model.Experience;
import com.GustavoVillegas.Portfolio_1.model.Persona;
import com.GustavoVillegas.Portfolio_1.model.Proyecto;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> verPersonas ();
    
    public void crearPersona ( Persona per);
    
    public void borrarPersona ( Long id);
    
    public Persona verPersona ( Long id);
    
    public void agregarExperiencia ( Experience exp, Persona per);
    
    public void agregarEducacion ( Education educ, Persona per);
    
    public void agregarProyecto ( Proyecto proy, Persona per);
    
}

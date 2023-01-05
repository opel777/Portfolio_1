package com.GustavoVillegas.Portfolio_1.service;

import com.GustavoVillegas.Portfolio_1.model.Education;
import com.GustavoVillegas.Portfolio_1.model.Experience;
import com.GustavoVillegas.Portfolio_1.model.Persona;
import com.GustavoVillegas.Portfolio_1.model.Proyecto;
import com.GustavoVillegas.Portfolio_1.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    public PersonaRepository persoRepo;
    
    @Autowired 
     public ExperienceService expServ;
    
    @Autowired
    public EducationService educServ;
    
    @Autowired
    public ProyectoService proyServ;
    
    
    @Override
    public List<Persona> verPersonas() {
       return persoRepo.findAll();
    }

    @Override
    
    public void crearPersona(Persona per) {
         persoRepo.save(per);
    }
    

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona verPersona(Long id) {
       return persoRepo.findById(id).orElse(null);
    }
    
    @Override
    public void agregarExperiencia(Experience exp, Persona per){
        Experience exp_id = expServ.crearExperiencia(exp);
        per.addExperience(exp_id);
        persoRepo.save(per);
    }
    
    @Override
    public void agregarEducacion(Education educ, Persona per){
        Education educ_id = educServ.crearEducacion(educ);
        per.addEducation(educ_id);
        persoRepo.save(per);
    }
    
    @Override
    public void agregarProyecto(Proyecto proy, Persona per){
        Proyecto proy_id = proyServ.crearProyecto(proy);
        per.addProyecto(proy_id);
        persoRepo.save(per);
    }
}

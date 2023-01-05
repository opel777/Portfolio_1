package com.GustavoVillegas.Portfolio_1.service;

import com.GustavoVillegas.Portfolio_1.model.Experience;
import com.GustavoVillegas.Portfolio_1.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService{
    
    @Autowired
    public ExperienceRepository expRepo;

    @Override
    public List<Experience> verExperiencias() {
        return expRepo.findAll();
    }

    @Override
    public Experience crearExperiencia(Experience exp) {
        return expRepo.save(exp);
    }
   
    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    
    
   
}

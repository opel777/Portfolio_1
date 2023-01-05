package com.GustavoVillegas.Portfolio_1.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     

    private Long id;
    private String name;
    private String lastName;
    private String image;
    private String position;
    private String img;
    private String about;
    
                                                   
    @OneToMany
    List<Experience> experience;
    
    @OneToMany
    List<Education> education;
    
    @OneToMany
    List<Proyecto> proyecto;
    
   
    
    public Persona(){
    }
    
    public Persona (Long id, String name, String lastName, String image, String position, String img, String about){
        
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.image = image;
        this.position = position;
        this.img = img;
        this.about = about;
        this.experience = new ArrayList <>();
        this.education = new ArrayList <>();
        this.proyecto = new ArrayList <>();
                
    }
    public void addExperience(Experience exp){
        this.experience.add(exp);
    }
    public void addEducation(Education educ){
        this.education.add(educ);
    }  
    public void addProyecto(Proyecto proy){
        this.proyecto.add(proy);
    } 
}

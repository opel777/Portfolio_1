  
package com.GustavoVillegas.Portfolio_1.controller;

import com.GustavoVillegas.Portfolio_1.model.Education;
import com.GustavoVillegas.Portfolio_1.model.Experience;
import com.GustavoVillegas.Portfolio_1.model.Persona;
import com.GustavoVillegas.Portfolio_1.model.Proyecto;
import com.GustavoVillegas.Portfolio_1.service.IEducationService;
import com.GustavoVillegas.Portfolio_1.service.IExperienceService;
import com.GustavoVillegas.Portfolio_1.service.IPersonaService;
import com.GustavoVillegas.Portfolio_1.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    public IPersonaService persoServ;
    
    @Autowired
    public IExperienceService expServ;
    
    @Autowired
    public IEducationService educServ;
    
    @Autowired
    public IProyectoService proyServ;

    
    @PostMapping ("/new/persona")
   public void agregarPersona (@RequestBody Persona pers){
    persoServ.crearPersona(pers);
   }
   
   
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas (){
    return persoServ.verPersonas();
    }
    
       @GetMapping ("/ver/persona/{id}")
       @ResponseBody
       public Persona verPersona(@PathVariable long id){
       return persoServ.verPersona(id);    
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona(@PathVariable long id) {
        persoServ.borrarPersona(id);
    }
    
     @PostMapping("/new/experiencia/{id}")
    public void crearExperiencia(@RequestBody Experience exp,@PathVariable Persona id){
        persoServ.agregarExperiencia(exp, id);
    
    }
    
     @PostMapping("/new/educacion/{id}")
    public void crearEducacion(@RequestBody Education educ,@PathVariable Persona id){
        persoServ.agregarEducacion(educ, id);
    
    }
     @PostMapping("/new/proyecto/{id}")
    public void crearProyecto(@RequestBody Proyecto proy,@PathVariable Persona id){
        persoServ.agregarProyecto(proy, id);
    
    }
    
    
    
    /* -------- controller experiencia-------*/
       
      
      @GetMapping ("/ver/experiencias")
      @ResponseBody
      public List<Experience> verExperiencias (){
          return expServ.verExperiencias();
      }
      
      @DeleteMapping ("/delete/experiencia/{id}")
    public void borrarExperiencia(@PathVariable long id) {
        expServ.borrarExperiencia(id);
    }
           
    /*----------------controller Education -----------*/
    
     @GetMapping ("/ver/educaciones")
      @ResponseBody
      public List<Education> verEducaciones (){
          return educServ.verEducaciones();
      }
      
      @DeleteMapping ("/delete/educacion/{id}")
    public void borrarEducacion(@PathVariable long id) {
        educServ.borrarEducacion(id);
    }
    
    /*-------------------controller Proyecto------------*/
    
     @GetMapping ("/ver/proyectos")
      @ResponseBody
      public List<Proyecto> verProyectos (){
          return proyServ.verProyectos();
      }
      
      @DeleteMapping ("/delete/proyecto/{id}")
    public void borrarProyecto(@PathVariable long id) {
        proyServ.borrarProyecto(id);
    }
    
 }



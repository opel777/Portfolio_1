
package com.GustavoVillegas.Portfolio_1.service;

import com.GustavoVillegas.Portfolio_1.model.Proyecto;
import java.util.List;

public interface IProyectoService {
    
    public List<Proyecto> verProyectos ();
    
    public Proyecto crearProyecto (Proyecto proy);
    
    public void borrarProyecto ( Long id);
}

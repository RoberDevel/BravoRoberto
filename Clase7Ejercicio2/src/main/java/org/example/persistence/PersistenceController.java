package org.example.persistence;

import org.example.logic.Platillo;

import java.util.List;

public class PersistenceController {

    PlatilloJpaController platilloJpaController = new PlatilloJpaController();


    public void crearPlatillo(Platillo platillo) {
        platilloJpaController.create(platillo);
    }

    public void borrarPlatillo(int id) {
        platilloJpaController.delete(id);
    }

    public void editarPlatillo(Platillo platillo) {
        platilloJpaController.update(platillo);
    }

    public List<Platillo> listarPlatillos() {
        return platilloJpaController.findPlatilloEntities();
    }

}

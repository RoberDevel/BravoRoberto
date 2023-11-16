package org.example;

public class ExploradorDirectorios {

    public void explorarDirectorio(Directorio directorio) {
        System.out.println(directorio.getNombre());


        if (!directorio.getArchivos().isEmpty()) {
            System.out.println(directorio.getArchivos());
        }


        for (Directorio subDir : directorio.getSubdirectorios()
        ) {
            explorarDirectorio(subDir);
        }
    }


}

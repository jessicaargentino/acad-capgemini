package modulo02.aula24.P2.controller;

import java.util.ArrayList;

import modulo02.aula24.P2.model.Artist;

public class ArtistController {
     /** ArrayList de Artist para armazenamento de objetos deste tipo */
     ArrayList<Artist> artist = new ArrayList<Artist>();

     /**
      * Método que salva um objeto do tipo Artist dentro do ArrayList de Artist
      * 
      * @param a objeto do tipo Artist
      */
     public void save(Artist a) {
         artist.add(a);
     }
 
     /** Método que retorna todos os objetos presentes no ArrayList */
     public ArrayList<Artist> read() {
         return artist;
     }
}

package dto;

import java.io.Serializable;


public record LoginOdgovorDTO (int id, String ime, String prezime, String username) implements Serializable{
    
}

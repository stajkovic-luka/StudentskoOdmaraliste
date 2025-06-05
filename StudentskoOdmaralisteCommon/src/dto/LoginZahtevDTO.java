package dto;

import java.io.Serializable;


public record LoginZahtevDTO (String username, String password) implements Serializable{
    
}

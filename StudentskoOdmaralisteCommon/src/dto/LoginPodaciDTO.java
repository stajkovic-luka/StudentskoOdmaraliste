package dto;

import java.io.Serializable;


public record LoginPodaciDTO (String username, String password) implements Serializable{
    
}

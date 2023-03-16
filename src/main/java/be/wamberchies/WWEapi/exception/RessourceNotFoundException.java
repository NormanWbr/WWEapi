package be.wamberchies.WWEapi.exception;

public class RessourceNotFoundException extends RuntimeException{

    public RessourceNotFoundException(){
        super("The requested resource was not found");
    }

    public RessourceNotFoundException(Throwable cause){
        super("The requested resource was not found", cause);
    }

}

package agenciadeviagens;

public class StringVaziaException extends RuntimeException{
    @Override
    public String getMessage(){
        return "String não pode ser vazia!";
    }    
}

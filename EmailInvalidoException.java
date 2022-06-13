package agenciadeviagens;

public class EmailInvalidoException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Formato de email inválido!";
    }
}

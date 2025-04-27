
public class ParametrosInvalidosException extends Exception {
    
    private String mensagemErro;

    public ParametrosInvalidosException(String mensagemErro) {
        this.mensagemErro = mensagemErro;
    }

    public String getMensagemErro() {
        return mensagemErro;
    }
}

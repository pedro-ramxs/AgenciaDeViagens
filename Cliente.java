package agenciadeviagens;

public class Cliente extends Pessoa implements IPessoa{
    private String email;
    private String telefone;
    private String cpf;

    public Cliente(String nome, int idade, String email, String telefone, String cpf) {
        super(nome, idade);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setCpf(cpf);
    }
    
    @Override
    public void exibir() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("CPF: " + this.getCpf());
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.equals("")){
            throw new StringVaziaException();
        }
        else if(!email.contains("@")){
            throw new EmailInvalidoException();
        }
        else{
            this.email = email;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if(telefone.equals("")){
            throw new StringVaziaException();
        }
        else if((telefone.length() < 11) || (telefone.length() > 12)){
            throw new IllegalArgumentException("Telefone inválido!");
        }
        else{
            this.telefone = telefone;  
        }
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.equals("")) {
            throw new StringVaziaException();
        }
        if (cpf.length() != 11) {
            throw new IllegalArgumentException("CPF incompleto!");
        } else {
            this.cpf = cpf;
        }
    }   
}
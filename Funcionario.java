package agenciadeviagens;

public class Funcionario extends Pessoa implements IPessoa {

    private String idiomas;
    private String email;
    private String cpf;

    public Funcionario(String nome, int idade, String email, String cpf, String idiomas) {
        super(nome, idade);
        this.setEmail(email);
        this.setCpf(cpf);
        this.setIdiomas(idiomas);
    }

    @Override
    public void exibir() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Email: " + this.getEmail());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Idiomas: " + this.getIdiomas());
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        if (idiomas.equals("")) {
            throw new StringVaziaException();
        } else {
            this.idiomas = idiomas;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.equals("")) {
            throw new StringVaziaException();
        } else if (!email.contains("@")) {
            throw new EmailInvalidoException();
        } else {
            this.email = email;
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

package agenciadeviagens;

public abstract class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
        this.setNome(nome);
        this.setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.equals("")){
            throw new StringVaziaException();
        }
        else{
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            throw new IllegalArgumentException("A idade não deve ser negativa!");
        }
        else{
            this.idade = idade;
        }
    }
}

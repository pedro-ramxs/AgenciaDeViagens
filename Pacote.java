package agenciadeviagens;

public class Pacote {
    private double preco;
    private String descricao;
    private int qtdPessoas;
    private int qtdDias;
    private boolean temPasseios;
    private int codigo;
    
    private static int numPacotes = 0;

    public Pacote(double preco, String descricao, int qtdPessoas, int qtdDias, boolean temPasseios) {
        this.setPreco(preco);
        this.setDescricao(descricao);
        this.setQtdPessoas(qtdPessoas);
        this.setQtdDias(qtdDias);
        this.setTemPasseios(temPasseios);
        numPacotes++;
        this.setCodigo(numPacotes);
    }
    
    public void exibir(){
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Preço:"+ this.getPreco());
        System.out.println("Descrição:"+ this.getDescricao());
        System.out.println("Quantidade de Pessoas:"+ this.getQtdPessoas());
        System.out.println("Quantidade de Dias:"+ this.getQtdDias());
        System.out.println("Passeios inclusos?"+ this.getTemPasseios());
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco < 0){
            throw new IllegalArgumentException("Preço não deve ser negativo!");
        }
        else {
            this.preco = preco;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao.equals("")){
            throw new StringVaziaException();
        }
        else{
            this.descricao = descricao;
        }
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        if(qtdPessoas <= 0){
            throw new IllegalArgumentException("Quantidade de pessoas deve ser maior que 0!");
        }
        else{
            this.qtdPessoas = qtdPessoas;
        }
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        if(qtdDias <= 1){
            throw new IllegalArgumentException("Quantidade de Dias deve ser maior que 1!");
        }
        else{
            this.qtdDias = qtdDias;
        }
    }

    public boolean getTemPasseios() {
        return temPasseios;
    }

    public void setTemPasseios(boolean temPasseios) {
        this.temPasseios = temPasseios;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}

package agenciadeviagens;

public class PacoteInternacional extends Pacote {

    private boolean precisaDeTradutor;
    private boolean precisaDeVisto;
    private boolean testCovid;

    public PacoteInternacional(double preco, String descricao,int qtdPessoas, int qtdDias, boolean temPasseios, boolean precisaDeTradutor, boolean precisaDeVisto, boolean testCovid) {
        super(preco, descricao, qtdPessoas, qtdDias, temPasseios);
        this.precisaDeTradutor = precisaDeTradutor;
        this.precisaDeVisto = precisaDeVisto;
        this.testCovid = testCovid;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Precisa de tradutor?"+ this.getPrecisaDeTradutor());
        System.out.println("Precisa de visto?"+ this.getPrecisaDeVisto() );
        System.out.println("Precisa de teste de Covid-19?"+ this.getTestCovid());
    }
    
    

    public boolean getPrecisaDeTradutor() {
        return precisaDeTradutor;
    }

    public void setPrecisaDeTradutor(boolean precisaDeTradutor) {
        this.precisaDeTradutor = precisaDeTradutor;
    }

    public boolean getPrecisaDeVisto() {
        return precisaDeVisto;
    }

    public void setPrecisaDeVisto(boolean precisaDeVisto) {
        this.precisaDeVisto = precisaDeVisto;
    }

    public boolean getTestCovid() {
        return testCovid;
    }

    public void setTestCovid(boolean testCovid) {
        this.testCovid = testCovid;
    }

}

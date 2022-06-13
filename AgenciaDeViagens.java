package agenciadeviagens;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaDeViagens {

    static ArrayList<Cliente> listaClientes = new ArrayList();
    static ArrayList<Funcionario> listaFuncionarios = new ArrayList();
    static ArrayList<Pacote> listaPacotes = new ArrayList();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int etapaAtual = 0;

        do {
            switch (etapaAtual) {
                case 0:
                    break;
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarFuncionario();
                    break;
                case 3:
                    cadastrarPacote();
                    break;
                case 4:
                    buscarClientes();
                    break;
                case 5:
                    buscarFuncionarios();
                    break;
                case 6:
                    buscarPacotes();
                    break;
                case 7:
                    excluirCliente();
                    break;
                case 8:
                    excluirFuncionario();
                    break;
                case 9:
                    excluirPacote();
                    break;
                case 10:
                    informacoesClientes();
                    break;
                case 11:
                    informacoesPacotes();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
            mostraMenu();
            System.out.print("Selecione a opção desejada: ");
            etapaAtual = s.nextInt();
        } while (etapaAtual != 0);
    }

    public static void mostraMenu() {
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("                * MENU * ");
        System.out.println("----------------------------------------");
        System.out.println("| 1 | Cadastrar Cliente");
        System.out.println("| 2 | Cadastrar Funcionário");
        System.out.println("| 3 | Cadastar Pacote");
        System.out.println("");
        System.out.println("| 4 | Buscar Clientes");
        System.out.println("| 5 | Buscar Funcionários");
        System.out.println("| 6 | Buscar Pacotes");
        System.out.println("");
        System.out.println("| 7 | Excluir Cadastro de Cliente");
        System.out.println("| 8 | Excluir Cadastro de Funcionario");
        System.out.println("| 9 | Excluir Cadastro de Pacote");
        System.out.println("");
        System.out.println("| 10| Informações dos Clientes");
        System.out.println("| 11| Informações dos Pacotes");
        System.out.println("");
        System.out.println("| 0 | ENCERRAR");
        System.out.println("----------------------------------------");
        System.out.println("");
    }

    public static void cadastrarCliente() {
        s.nextLine();
        System.out.println("");
        System.out.print("Digite o nome: ");
        String nome = s.nextLine();
        System.out.print("Digite a idade: ");
        int idade = s.nextInt();
        s.nextLine();
        System.out.print("Digite o email:");
        String email = s.nextLine();
        System.out.print("Digite o Telefone: ");
        String telefone = s.nextLine();
        System.out.print("Digite o CPF: ");
        String cpf = s.nextLine();
        try {
            Cliente c = new Cliente(nome, idade, email, telefone, cpf);
            listaClientes.add(c);
            System.out.println("Cliente cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Cadastro não realizado, tente novamente.");
        }

    }

    public static void cadastrarFuncionario() {
        s.nextLine();
        System.out.println("");
        System.out.print("Digite o nome: ");
        String nome = s.nextLine();
        System.out.print("Digite a idade: ");
        int idade = s.nextInt();
        s.nextLine();
        System.out.print("Digite o email:");
        String email = s.nextLine();
        System.out.print("Digite o CPF: ");
        String cpf = s.nextLine();
        System.out.print("Digite os idiomas falados: ");
        String idiomas = s.nextLine();
        try {
            Funcionario f = new Funcionario(nome, idade, email, cpf, idiomas);
            listaFuncionarios.add(f);
            System.out.println("Cadastro realizado com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Cadastro não realizado, tente novamente!");

        }

    }

    public static void cadastrarPacote() {
        System.out.println("");
        System.out.print("Digite o preço: ");
        double preco = s.nextDouble();
        s.nextLine();
        System.out.print("Digite a descrição: ");
        String descricao = s.nextLine();
        System.out.print("Digite a quantidade de pessoas: ");
        int qtdPessoas = s.nextInt();
        System.out.print("Digite a quantidade de dias: ");
        int qtdDias = s.nextInt();
        System.out.print("Digite se tem passeios inclusos: ");
        boolean temPasseios = s.nextBoolean();
        System.out.print("É uma viagem internacional?");
        boolean ehInternacional = s.nextBoolean();
        Pacote p;
        if (ehInternacional) {
            System.out.print("Digite se precisa de tradutor: ");
            boolean precisaTradutor = s.nextBoolean();
            System.out.print("Digite se precisa de visto: ");
            boolean precisaVisto = s.nextBoolean();
            System.out.print("Digite se precisa de teste de Covid-19: ");
            boolean precisaTeste = s.nextBoolean();

            try {
                p = new PacoteInternacional(preco, descricao, qtdPessoas, qtdDias, temPasseios, precisaTradutor, precisaVisto, precisaTeste);
                listaPacotes.add(p);
                System.out.println("Pacote cadastrado com sucesso!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Cadastro não realizado, tente novamente!");
            }
        } else {
            try {
                p = new Pacote(preco, descricao, qtdPessoas, qtdDias, temPasseios);
                listaPacotes.add(p);
                System.out.println("Pacote cadastrado com sucesso!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Cadastro não realizado, tente novamente!");
            }
        }
    }

    public static void buscarClientes() {
        s.nextLine();
        System.out.println("");
        System.out.print("Digite o nome do cliente a ser buscado: ");
        String nome = s.nextLine();
        for (Cliente c : listaClientes) {
            if (c.getNome().startsWith(nome)) {
                c.exibir();
            }
        }
    }

    public static void buscarFuncionarios() {
        s.nextLine();
        System.out.println("");
        System.out.print("Digite o nome do funcionário a ser buscado: ");
        String nome = s.nextLine();
        for (Funcionario f : listaFuncionarios) {
            if (f.getNome().startsWith(nome)) {
                f.exibir();
            }
        }
    }

    public static void buscarPacotes() {
        s.nextLine();
        System.out.println("");
        System.out.println("| 1 | para buscar pela descrição");
        System.out.println("| 2 | para buscar pelo código");
        System.out.println("| 3 | para buscar pelo preço");
        int opcao = s.nextInt();
        switch (opcao) {
            case 1:
                System.out.print("Digite a descrição do pacote a ser buscado: ");
                s.nextLine();
                String descricao = s.nextLine();
                for (Pacote p : listaPacotes) {
                    if (p.getDescricao().startsWith(descricao)) {
                        p.exibir();
                    }
                }
                break;
            case 2:
                System.out.print("Digita o código do pacote a ser buscado: ");
                int codigo = s.nextInt();
                for (Pacote p : listaPacotes) {
                    if (p.getCodigo() == codigo) {
                        p.exibir();
                    }
                }
                break;
            case 3:
                System.out.print("Digite o preço do pacote a ser buscado");
                double preco = s.nextDouble();
                for (Pacote p : listaPacotes) {
                    if (p.getPreco() == preco) {
                        p.exibir();
                    }
                }
                break;
            default:
                System.out.println("Opção inválida, tente novamente!");
                break;
        }
    }

    public static void excluirCliente() {
        s.nextLine();
        System.out.println("");
        System.out.print("Digite o CPF do cliente a ser excluído: ");
        String cpf = s.nextLine();
        boolean excluiu = false;
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente c = listaClientes.get(i);
            if (c.getCpf().equals(cpf)) {
                listaClientes.remove(c);
                excluiu = true;
            }
        }
        if (excluiu) {
            System.out.println("Cliente excluído com sucesso");
        } else {
            System.out.println("Erro na exclusão, tente novamente.");
        }
    }

    public static void excluirFuncionario() {
        s.nextLine();
        System.out.println("");
        System.out.print("Digite o CPF do funcionario a ser excluído: ");
        String cpf = s.nextLine();
        boolean excluiu = false;
        for (int i = 0; i < listaFuncionarios.size(); i++) {
            Funcionario f = listaFuncionarios.get(i);
            if (f.getCpf().equals(cpf)) {
                listaFuncionarios.remove(f);
                excluiu = true;
            }
        }
        if (excluiu) {
            System.out.println("Funcionario excluído com sucesso");
        } else {
            System.out.println("Erro na exclusão, tente novamente.");
        }
    }

    public static void excluirPacote() {
        s.nextLine();
        System.out.println("");
        System.out.print("Digite o codigo do pacote a ser excluído: ");
        int codigo = s.nextInt();
        boolean excluiu = false;
        for (int i = 0; i < listaPacotes.size(); i++) {
            Pacote p = listaPacotes.get(i);
            if (p.getCodigo() == codigo) {
                listaPacotes.remove(p);
                excluiu = true;
            }
        }
        if (excluiu) {
            System.out.println("Pacote excluído com sucesso");
        } else {
            System.out.println("Erro na exclusão, tente novamente.");
        }
    }

    public static void informacoesClientes() {
        if (listaClientes.size() > 0) {
            Cliente cliMaisVelho = listaClientes.get(0);
            Cliente cliMaisNovo = listaClientes.get(0);
            int numIdosos = 0;
            int numMenores = 0;
            double idadeMedia = 0;

            int idadeMaior = cliMaisVelho.getIdade();
            int idadeMenor = cliMaisNovo.getIdade();

            for (Cliente c : listaClientes) {
                idadeMedia += c.getIdade();

                if (c.getIdade() > 60) {
                    numIdosos++;
                } else if (c.getIdade() < 18) {
                    numMenores++;
                }

                if (c.getIdade() > idadeMaior) {
                    idadeMaior = c.getIdade();
                    cliMaisVelho = c;
                }

                if (c.getIdade() < idadeMenor) {
                    idadeMenor = c.getIdade();
                    cliMaisNovo = c;
                }
            }
            System.out.println("Cliente mais velho: ");
            cliMaisVelho.exibir();
            System.out.println("----------------------------------------");
            System.out.println("Cliente mais novo: ");
            cliMaisNovo.exibir();
            System.out.println("----------------------------------------");
            System.out.println("Quantidade de clientes maiores de 60 anos: " + numIdosos);
            System.out.println("Quantidade de clientes menores de 18 anos: " + numMenores);
            System.out.println("Média das idades: " + (idadeMedia / listaClientes.size()));
        } else {
            System.out.println("\nNão há clientes cadastrados!");
        }
    }

    public static void informacoesPacotes() {
        if (listaPacotes.size() > 0) {
            Pacote pctMaisCaro = listaPacotes.get(0);
            Pacote pctMaisBarato = listaPacotes.get(0);
            double mediaPreco = 0;
            int numPctAcimaMedia = 0;

            double maiorPreco = pctMaisCaro.getPreco();
            double menorPreco = pctMaisBarato.getPreco();

            for (Pacote p : listaPacotes) {
                mediaPreco += p.getPreco();

                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    pctMaisCaro = p;
                } else if (p.getPreco() < menorPreco) {
                    menorPreco = p.getPreco();
                    pctMaisBarato = p;
                }
            }
            mediaPreco = mediaPreco / listaPacotes.size();

            for (Pacote p : listaPacotes) {
                if (p.getPreco() > mediaPreco) {
                    numPctAcimaMedia++;
                }
            }

            System.out.println("");
            System.out.println("Pacote mais caro: ");
            System.out.println("");
            pctMaisCaro.exibir();
            System.out.println("----------------------------------------");
            System.out.println("Pacote mais barato: ");
            System.out.println("");
            pctMaisBarato.exibir();
            System.out.println("----------------------------------------");
            System.out.println("Média do preço: " + mediaPreco);
            System.out.println("Número de pacotes acima da média: " + numPctAcimaMedia);
        } else {
            System.out.println("\nNão há pacotes cadastrados!");
        }
    }
}

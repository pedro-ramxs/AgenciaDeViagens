# AgenciaDeViagens

Projeto criado na disciplina **"Linguagem de Programação Multiplataforma"** para aplicar os conhecimentos de `Programação Orientada a Objetos em Java`.

O projeto deve representar parte de um sistema de vendas de produtos ou de serviços, e deve implementar os seguintes requisitos:

* Crie um cadastro de clientes para seu sistema. Nesse cadastro deve ter:
    * Uma classe “[Pessoa](Pessoa.java)”, abstrata.
    * Uma interface “[IPessoa](IPessoa.java)”, com pelo menos um método chamado “exibir”, que deve exibir todos os dados de um cliente.
    * Uma classe “[Cliente](Cliente.java)”, que herda de “Pessoa” e implementa a interface, com pelo menos cinco atributos, entre eles um atributo “nome” e outro “idade”. Os demais ficam à sua escolha, de acordo com o tema definido pela dupla.
    * O cadastro deve ser feito em memória (ArrayList) e permitir a inclusão e exclusão de clientes. Utilize tratamento de exceção para validar os campos (por exemplo, ao tentar cadastrar um cliente com idade negativa). Se necessário, crie exceções específicas.   

* Crie um cadastro de funcionários para seu sistema. Nesse cadastro deve ter:
    * Uma classe “[Funcionário](Funcionario.java)”, que herda de “Pessoa” e implementa a interface, com pelo menos cinco atributos, entre eles um atributo “nome” e outro “idade”. Os demais ficam à sua escolha, de acordo com o tema definido pela dupla. O método “exibir” deve exibir todos os dados de um funcionário.
    * O cadastro deve ser feito em memória (ArrayList) e permitir a inclusão e exclusão de funcionários. Utilize tratamento de exceção para validar os campos (por exemplo, ao tentar cadastrar um funcionário com idade negativa). Se necessário, crie exceções específicas.

* Crie um cadastro de produtos para seu sistema. Nesse cadastro deve ter:
    * Uma classe “[Produto](Pacote.java)”, que deve ter pelo menos cinco atributos, entre eles um atributo “descrição” e outro “preço”. Fique à vontade para criar superclasses ou interfaces, se achar necessário.
    * O cadastro deve ser feito em memória (ArrayList) e permitir a inclusão e exclusão de produtos. Utilize tratamento de exceção para validar os campos (por exemplo, ao tentar cadastrar um produto com preço negativo). Se necessário, crie exceções específicas.

* Implemente um sistema de busca de clientes. O sistema deve realizar a busca por parte do nome (por exemplo, se o usuário digitar “jos” o sistema deve trazer todos os clientes cadastrados cujos nomes começam com “jos” - José, Josiane, etc.). Implemente o mesmo sistema de busca para Funcionário.

* Implemente um sistema de busca de produtos/serviços. O sistema deve realizar a busca por parte da descrição (assim como o nome do cliente ou funcionário). O sistema também deve realizar busca por pelo menos mais dois atributos de Produto/Serviço (por exemplo, busca por código e busca por preço. Não é necessário combiná-los entre si).

* O programa deve ter métodos que informem: (i) o cliente de maior idade do sistema; (ii) o mais jovem; (iii) a quantidade de clientes maiores de 60 anos; (iv) a quantidade de clientes menores de 18 anos; (v) a idade média dos clientes.

* O programa deve ter métodos que informem: (i) o produto ou serviço mais caro do sistema; (ii) o mais barato; (iii) a média de preço; (iv) a quantidade de produtos/serviços com preço acima da média.

* Para melhor usabilidade do programa, implemente um menu com as opções e permita que o usuário informe os dados a serem cadastrados ou procurados.
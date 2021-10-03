# MetodologiaAvancadadeProgramacaoProva1
Repositório para armazenamento da primeira prova da disciplina de Metodologia Avançada de Programação - Sistemas para Internet - UNIESP

**1 – Princípio da Responsabilidade Única **


	Uma classe, método ou função devem ter uma única tarefa ou responsabilidade a ser executada dentro do software, desta forma evita-se sobrecargas dentro da própria classe durante a sua construção, mantendo a coesão do sistema durante o desenvolvimento, como também evitando o alto acoplamento, o que deixa o sistema mais robusto e preparado a futuras manutenções. 
	No código, foi aplicado a Responsabilidade Única mais abertamente na classe Cerveja (model.Cerveja) a qual tem a única responsabilidade de criar o objeto cerveja para o sistema, como também na classe Cerveja_Factory (service.Cerveja_Factory), a qual importa a classe Cerveja e cria a fábrica de objetos dependendo da String que recebe no método criarCerveja. 
	Outro exemplo de aplicação foi na criação da interface GerarCerveja (service.Cerveja_Factory) e Cerveja_FactoryInterface (service.Cerveja_FactoryInterface), como também foi procurado utilizar em todos os métodos do sistema, atribuindo apenas uma única atividade para cada um. 


**2 – Princípio Aberto – Fechado**



	Objetos ou entidades devem estar disponíveis para extensão, mas nunca podem ser modificados, preservando suas características “base” e principalmente não alterando o código fonte original. 
	Os novos comportamentos devem ser introduzidos por meio de uma Interface, que deve ser bem construída durante a abstração da problemática proposta para a construção do sistema.  Depois da devida construção da interface, com o método que irá atuar em todas as classes que possam a vir implementar a Interface.
	Esse princípio foi utilizado em todos os tipos de cerveja propostos pelo desafio, pois são extensões do objeto Cerveja (model.Cerveja), porém com certa especialização (Malte, Lagger, Sem Álcool, ...) e desta forma, não se modifica o código base (Cerveja), pode-se colocar funções ou métodos especiais dependendo da necessidade para cada tipo de produto, o que deixa mais fácil a manutenção e possível alteração com o tempo.  

**3 – Princípio da Substituição de Liskov **



	Uma classe derivada que receber ou adquirir as características de outra classe por extensão, pode substituir sem nenhum problema a “classe doadora” nos sistemas, sem perca de performance ou outros prejuízos. 
	No sistema, esse princípio pode ser observado na classe Teste (view.teste), em que depois da captação dos dados necessários para a construção do objeto Cerveja, foi implementado o objeto TiposdeCerveja (service.TiposdeCerveja), que herda as mesmas características de Cerveja, logo pode-se implementar Cerveja ou Tipos de Cerveja que não ocorrerá nenhum impedimento para o sistema. 

**4- Princípio da Segregação da Interface**



	As interfaces devem ser o mais específica possível, para que os métodos possam ser todos utilizados por quem for implementar a interface, nesse caso é necessária uma boa abstração para entender a situação e deixar a interface mais especializada.
	Esse princípio foi aplicado nas duas interfaces do sistema Cerveja_FactoryInterface (service.Cerveja_FactoryInterface) e GerarCerveja (service.GerarCerveja), pois durante o entendimento da problemática foi necessário a construção das duas interfaces com os objetivos de implementar a Cerveja e Factory, e ambas foram desenvolvidas o mais específico possível e com os seus métodos devidamente utilizados. 

**5 – Princípio da Inversão de Dependências**


	Acredito que este deva ser o princípio mais complexo de conseguir entender, mas em um bom resumo, o princípio afirma que módulos de alto nível não podem depender de módulos de baixo nível, como também o sistema deve depender de abstrações e não o contrário. 
	De forma meio prática, esse princípio coloca em choque facilmente os outros princípios do SOLID, então o primeiro passo para o sucesso com o 5º princípio é: tenha uma boa abstração para entender o todo, especialize a interface e principalmente evite grandes acoplamentos para o devido desenvolvimento e funcionamento do código.
	Foi utilizado no Cervejas (service.Cervejas), nessa classe é onde ocorre a implementação da interface GerarCerveja (service.GerarCerveja),  onde na classe tem o método que chama a interface da Factory para implementar uma nova fábrica, sendo portanto um módulo de baixo nível, e permite a execução do método criaCerveja, este módulo de alto nível e ambos dependendo das interfaces do sistema para devida funcionalidade.



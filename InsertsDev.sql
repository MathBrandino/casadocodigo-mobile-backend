-- LIVRO 1
insert into livro (titulo, descricao, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl) 
values(	'Jogos Android: Crie um game do zero usando classes nativas',
		'195, 300, 800 milhões de dólares!!! Essas são as cifras por trás dos jogos Angry Birds, Candy Crush e Clash of Clans. Quer pensar em cifras menores? Que tal 120 mil reais por dia? Foi o que Flappy Bird chegou a faturar. Pois é, já pensou em trabalhar com algo criativo, divertido e recompensador? Desenvolver jogos pode ser assim.   Neste livro, Felipe Torres mostra como criar um jogo do zero sem usar frameworks e discute as vantagens e desvantagens dessa abordagem usada pelo criador de Flappy Bird. Usando a linguagem Java, você vai desenvolver um jogo para Android e entender de fato como funciona a criação de jogos através da óptica do desenvolvedor e terá mais confiança e informação para decidir os caminhos do que esperamos. Seja o novo jogo viral do mercado!',
		'2015-07-04',
		96,
		59.9,
		39.9,
		79.9,
		'978-85-5519-013-1',
		'http://cdn.shopify.com/s/files/1/0155/7645/products/games-android-miniature.png');

insert into autor (nome, informacoes, imagemUrl)
values ('Felipe Torres',
		'Felipe Torres é Bacharel em Ciência da Computação pelo IME-USP e atua como instrutor e desenvolvedor Android há mais de 5 anos na Caelum. Apaixonado por programação de jogos, criou sua versão de Carmen Sandiego, que teve mais de 100.000 downloads no Google Play Store. Além disso, participa ativamente de diversas comunidades como o GUJ, onde foca no ensino e solução de dúvidas e o Android Open Source Project, com contribuições no código-fonte do sistema Android.',
		'http://cdn.shopify.com/s/files/1/0155/7645/files/felipe-torres_medium.png');
		
insert into livroAutor(idLivro, idAutor) values('1','1');

-- LIVRO 2
insert into livro (titulo, descricao, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl) 
values(	'Spring MVC: Domine o principal framework web Java',
		'O Spring é o principal concorrente da especificação JavaEE. Com uma plataforma muito estável e com integração fina entre todas as suas extensões, fornece um ambiente muito propício para que o programador foque nas regras de negócio e esqueça dos problemas de infraestrutura. Durante o livro, será construída uma aplicação baseada na loja da Casa do Código e você terá a chance de utilizar diversas das funcionalidades e integrações providas pelo framework. Usaremos o Spring MVC como alicerce da nossa aplicação web e para implementar todas as funcionalidades, utilizaremos diversas integrações, como: Spring JPA, para facilitar o acesso ao banco de dados, Spring Security, para segurança da aplicação, diferenciação de ambientes com a parte de Profiles, respostas assíncronas para melhorarmos a escalabilidade, e ainda detalhes, como cache e suporte às requisições, seguindo o estilo REST. Tudo isso sem uma linha de XML, todas configurações serão feitas baseadas em anotações e código Java.',
		'2015-06-04',
		96,
		59.9,
		39.9,
		79.9,
		'978-85-5519-013-1',
		'http://cdn.shopify.com/s/files/1/0155/7645/products/spring-mvc-miniature.png?');

insert into autor (nome, informacoes, imagemUrl)
values ('Alberto Souza',
		'Alberto Souza é Bacharel em Ciência da Computação pela Universidade Salvador e desenvolvedor desde 2005, tendo participado de muitos projetos web e experimentado diversas linguagens. Participa de projetos open source como o Stella e VRaptor. Possui a certificação SCJP e trabalha como desenvolvedor e instrutor pela Caelum. Seu Twitter é @alberto_souza e você também pode encontrá-lo no Github, no endereço http://www.github.com/asouza',
		'http://cdn.shopify.com/s/files/1/0155/7645/files/alberto-souza_medium.png');

insert into livroAutor(idLivro, idAutor) values('2','2');

-- LIVRO 3
insert into livro (titulo, descricao, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl)
values('Testes automatizados de software: Um guia prático',
      'Quantas vezes você não colocou um ''else'' a mais ou trocou um maior por maior-igual? Problemas como esses acontecem todos os dias em nossos códigos. E aposto que você sabe como evitá-los: testando seu software. A grande pergunta é: por que evitamos (ou pior, odiamos) testar?  Testar custa caro, é demorado e é chato. Mas tudo isso só é verdade, pois ainda delegamos essas tarefas para um ser humano. Este livro mostra de maneira prática como escrever um programa que fará esse teste por você!  Mergulhe de cabeça nessa ideia, aprenda a escrever testes automatizados, e passe a dormir bem, tranquilo, pois seu software agora funciona.',
      '2015-06-01',
      96,
      59.9,
      39.9,
      79.9,
      '978-85-5519-013-1',
      'http://cdn.shopify.com/s/files/1/0155/7645/products/testes-de-software-miniature.png');

insert into autor (nome, informacoes, imagemUrl)      
values('Maurício Aniche',
      'Maurício é instrutor e desenvolvedor da Caelum, possui mais de 9 anos de experiência de desenvolvimento de softwares, tendo participado de projetos para grandes empresas nacionais e internacionais. Mauricio é também mestre em Ciência da Computação pela Universidade de São Paulo (USP), onde pesquisa sobre TDD e sua influência no design de sistemas orientados a objetos. Atualmente, é aluno de doutorado pelo mesmo instituto. Palestrante em eventos nacionais e internacionais, com destaque para sua apresentação no 1o Workshop Internacional sobre Test-Driven Development, localizado em Paris, no ano de 2010, Agile Brazil 2010, 2011 e 2012, e QCON SP 2010 e 2012. Mauricio gosta de discutir sobre TDD, melhores práticas e princípios de orientação a objetos, métodos ágeis de desenvolvimento de software e linguagens de programação. Está no Twitter como @mauricioaniche .',
      'http://cdn.shopify.com/s/files/1/0155/7645/files/mauricio-aniche_small.png');
      
insert into livroAutor(idLivro, idAutor) values('3','3');

-- LIVRO 4     
insert into livro (titulo, descricao, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl)       
values('PL/SQL: Domine a linguagem do banco de dados Oracle',
      'Durante o dia, milhões de dados trafegam por servidores ao redor do mundo. São informações de todo tipo e muitas delas precisam ser preservadas. Qual a forma de fazer isso? Persistindo os dados.  Neste livro, Eduardo Gonçalves mostra o poder da linguagem PL/SQL e como você pode conseguir um alto grau de produtividade e performance para as suas aplicações. Os leitores iniciantes terão contato com conceitos sobre a estrutura da linguagem PL/SQL e suas características, e criarão programas, dos mais simples até os mais complexos, para atender às mais diversas necessidades. Para os já experientes, ajudará como fonte de referência e para atualizar conceitos e técnicas da linguagem.',
      '2015-06-01',
      96,
      59.9,
      39.9,
      79.9,
      '978-85-5519-013-1',
      'http://cdn.shopify.com/s/files/1/0155/7645/products/plsql-featured_medium.png');
      
insert into autor (nome, informacoes, imagemUrl)
values('Eduardo Gonçalves',
      'Eduardo Gonçalves é formado em Tecnologia da Informação e possui mais de 14 anos de experiência em análise e desenvolvimentos de sistema em Oracle SQL e PL/SQL. Também tem experiência em análise de performance e monitoramento de aplicações (Tuning). Já trabalhou para grandes empresas como Lojas Renner, Mundial S.A, Tigre S.A, Pernambucanas, Tractebel Energia, Portobello Cerâmica, Bematech, Positivo, entre outras. É instrutor de cursos oficiais da Oracle nas linguagens SQL e PL/SQL, e também atua no desenvolvimento de aplicações mobile para a plataforma iOS. Atualmente, é líder operacional de projetos e atua ativamente na frente de desenvolvimento mobile na empresa Supero TI.',
      'http://cdn.shopify.com/s/files/1/0155/7645/files/eduardo-goncalves_small.png');

insert into livroAutor(idLivro, idAutor) values('4','4');
      
-- LIVRO 5      
insert into livro (titulo, descricao, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl)       
values('Controlando versões com Git e GitHub',
      'Desenvolver software não é fácil. Há sempre demandas de novas funcionalidades a serem desenvolvidas e de alterações nas funcionalidades já existentes. Por isso, uma das preocupações nos projetos é manter um histórico de evolução do código fonte, facilitando o trabalho de desfazer algumas dessas alterações, caso seja necessário. Além disso, como geralmente trabalhamos em equipe, outra preocupação é sobre a integração do trabalho entre os membros da equipe. Diversos problemas relacionados com essas preocupações podem acontecer durante o desenvolvimento de um software, e, para evitá-los, é essencial a utilização de uma ferramenta de controle de versão.  O Git é uma dessas ferramentas de controle de versão. Foi criado em 2005 por Linus Torvalds, o criador do Linux, e hoje é uma das ferramentas de controle de versão mais utilizadas nos projetos de desenvolvimento de software, por ser mais rápido e eficiente do que as outras ferramentas tradicionais, como CVS e SVN.  Já o GitHub é um serviço web que nos permite hospedar repositórios de projetos que utilizam o Git, facilitando, assim, o trabalho em equipe e a colaboração com projetos open source. ',
      '2014-08-01',
      199,
      59.9,
      39.9,
      79.9,
      '978-85-5519-013-1',
      'http://cdn.shopify.com/s/files/1/0155/7645/products/git-github-miniature.png');

insert into autor (nome, informacoes, imagemUrl)
values('Alexandre Aquiles',
      'Alexandre Aquiles formou-se em Engenharia da Computação pela Unicamp e pós-graduou-se em Engenharia de Software Ágil pela UNA/BH. Desenvolve software profissionalmente desde 2005, tendo trabalhado nas áreas de logística, governo, mineração e seguros. Acredita que softwares devem ser desenvolvidos de forma iterativa e incremental, entregando continuamente software de valor e com qualidade.',
      'http://cdn.shopify.com/s/files/1/0155/7645/files/alexandre-aquiles_small.png');
      
insert into autor (nome, informacoes, imagemUrl)
values('Rodrigo Ferreira',
      'Rodrigo Ferreira é bacharel em Sistemas de Informação pela Universidade Católica de Brasília e trabalha com desenvolvimento de software há mais de 5 anos. Sempre focado em boas práticas de programação, qualidade e produtividade. Atualmente, é instrutor na Caelum, onde ministra treinamentos de Java, Front-end e Agile.',
      'http://cdn.shopify.com/s/files/1/0155/7645/files/rodrigo-ferreira_small.png');
  
insert into livroAutor(idLivro, idAutor) values('5','5');
insert into livroAutor(idLivro, idAutor) values('5','6');

-- LIVRO 6
insert into livro (titulo, descricao, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl) 
values('Scrum 360: Um guia completo e prático de agilidade',
     'Trabalhar com agilidade não é fácil. Fazer com que um time inteiro trabalhe de forma ágil, entregando resultados, produzindo de forma plena e sem impedimentos é muito mais difícil. Justamente para isso temos o Scrum, uma metodologia para gerenciamento de projetos que o torna produtivo.  Nesse livro, Jorge Audy vai ensinar de forma objetiva e prática a metodologia, mostrando como ela se cruza com outras práticas, como XP, PMBOK, Lean. Além de também formar no leitor a base dos princípios ágeis, pré-requisito para qualquer gerente de projetos do mercado contemporâneo.',
     '2015-05-01',
     163,
     59.9,
     39.9,
     79.9,
     '978-85-5519-013-1',
     'http://cdn.shopify.com/s/files/1/0155/7645/products/scrum360-miniature.png?');
    
insert into autor (nome, informacoes, imagemUrl)
values('Jorge Audy',
     'Jorge Audy é escoteiro e agilista. Formou-se em 1986, foi concursado nos anos 80 e empresário nos 90. Também é Mestre em Administração na linha de pesquisa de Gestão da Informação e foi coordenador de desenvolvimento na ADP Brasil nos anos 2000 e no Grupo RBS até 2013, em equipes corporativas e de produtos digitais. Desde então, é consultor na DBServer. Praticante de métodos ágeis desde 2008, e Agile Coach desde 2011, e palestrante e participante ativo em eventos sobre métodos ágeis, equipes de alta performance e, mais especificamente, SCRUM. Confira mais sobre o autor em https://jorgekotickaudy.wordpress.com/about/.',
     'http://cdn.shopify.com/s/files/1/0155/7645/files/jorge-audy_medium.png');

insert into livroAutor(idLivro, idAutor) values('6','7');

-- LIVRO 7     
insert into livro (titulo, descricao, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl) 
values('Swift: Programe para iPhone e iPad',
     'Desenvolver aplicativos para iPhone e iPad nunca foi tão prazeroso. Com a nova linguagem da Apple (Swift) e com a recente versão do iOS, o desenvolvimento se torna descomplicado, pois há uma nova gama de recursos disponíveis que mantêm a clássica elegância da principal plataforma mobile do mundo.  Programadores do mundo inteiro estão aprendendo a programar para iOS com Swift. Nesse livro, Guilherme Silveira e Joviane Jardim vão ensinar como entrar nesse universo e criar sua aplicação, do início ao fim, aprendendo os recursos da nova linguagem e do novo iOS, usando várias boas práticas de programação de quebra.',
     '2014-12-01',
     261,
     59.9,
     39.9,
     79.9,
     '978-85-5519-013-1',
     'http://cdn.shopify.com/s/files/1/0155/7645/products/swift-ios-miniature.png');

insert into autor (nome, informacoes, imagemUrl)
values('Guilherme Silveira',
     'Guilherme Silveira é líder técnico na Caelum e no Alura, cofundador do GUJ.com.br e um dos criadores do VRaptor. Especializou-se na área de ensino de Desenvolvimento de Software e é um dos principais autores dos cursos online do Alura. Ele pode ser encontrado no twitter em @guilhermecaelum.',
     'http://cdn.shopify.com/s/files/1/0155/7645/files/guilherme-silveira_small.png?54691');

insert into autor (nome, informacoes, imagemUrl)
values('Joviane Jardim',
     'Joviane Jardim já trabalhou como desenvolvedora C e com banco de dados Oracle utilizando PL/SQL por 5,5 anos. Hoje é instrutora e desenvolvedora na Caelum dos cursos de iOS. Gosta também de C, Prolog, Java e Ruby.',
     'http://cdn.shopify.com/s/files/1/0155/7645/files/joviane-jardim_small.png?54691');

insert into livroAutor(idLivro, idAutor) values('7','8');
insert into livroAutor(idLivro, idAutor) values('7','9');
     
-- LIVRO 8
insert into livro (titulo, descricao, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl)      
values('CSS Eficiente: Técnicas e ferramentas que fazem a diferença nos seus estilos',
      'Quando aprendemos a trabalhar com CSS, frequentemente nos pegamos perdidos em detalhes fundamentais que não nos são explicados. Por vezes, alguns desses detalhes passam despercebidos até pelo desenvolvedor front-end mais experiente. Mas como ir além do conhecimento básico do CSS e preparar o caminho para explorar tópicos mais avançados?  Neste livro, Tárcio Zemel ensina como organizar seu estilo, entender especificidade, como usar diferentes seletores, trabalhar orientado a objetos com CSS e várias outras técnicas que farão diferença no dia a dia do trabalho com os estilos e abrirão novas possibilidades para você explorar ainda mais o CSS.',
      '2015-05-01',
      163,
      59.9,
      39.9,
      79.9,
      '978-85-5519-013-1',
      'http://cdn.shopify.com/s/files/1/0155/7645/products/css-eficiente-featured_medium.png');
      
insert into autor (nome, informacoes, imagemUrl)
values('Tárcio Zemel',
      'Tárcio Zemel trabalha com desenvolvimento web há 15 anos e atuar nessa área é uma das coisas que mais gosta de fazer. É sócio-fundador da empresa webfatorial, na qual trabalha em projetos web para grandes marcas do mundo todo.',
      'http://cdn.shopify.com/s/files/1/0155/7645/files/tarcio-zemel_small.png?54691');

insert into livroAutor(idLivro, idAutor) values('8','10');      
      
-- LIVRO 9     
insert into livro (titulo, descricao, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl)       
values('Google Android: crie aplicações para celulares e tablets',
      'Faça as melhores aplicações Android com as melhores práticas da área. Aprenda como publicar a aplicação e tê-la no ar em 1 dia, saiba como utilizar o máximo dos aparelhos e crie aplicações extremamente ricas para celulares e tablets!  Desenvolva para todas as versões do Android e conheça as novidades da versão 5.0 (Lollipop)! Durante o livro, você criará uma aplicação que envolverá funcionalidades das suas principais versões e aprenderá como utilizar a ActionBar, o Navigation Drawer e também os novos widgets do Android 5.0, como o botão de ação flutuante e os cartões, e também vai descobrir como engajar o usuário projetando um esquema efetivo de navegação entre as telas do seu aplicativo.',
      '2015-05-01',
      163,
      59.9,
      39.9,
      79.9,
      '978-85-5519-013-1',
      'http://cdn.shopify.com/s/files/1/0155/7645/products/android-featured_medium.png?v=1411489561');

insert into autor (nome, informacoes, imagemUrl)
values('João Bosco Monteiro',
      'João Bosco Monteiro é engenheiro de computação e possui especialização em Engenharia de Software. Começou a trabalhar com Java e web em 2002 e, desde então, tem participado e liderado projetos utilizando essa plataforma. Participou de grupos de pesquisa na área de Visão Computacional, tendo publicado diversos artigos científicos. Atuante nas comunidades de usuários e palestrante em eventos, é também um dos coordenadores do JUGMS. Entusiasta de novas tecnologias, agora se dedica ao desenvolvimento mobile e atualmente coordena a área de mobilidade da TecSinapse. Está no Twitter como @joaobmonteiro.',
      'http://cdn.shopify.com/s/files/1/0155/7645/files/joao-bosco-monteiro_small.png?54691');

insert into livroAutor(idLivro, idAutor) values('9','11');      
     
-- LIVRO 10
insert into livro (titulo, descricao, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl)       
values('Aplicações web real-time com Node.js',
      'Node.js é uma poderosa plataforma. Ele permite escrever aplicações JavaScript no server-side, tirando proveito da sintaxe e familiaridade da linguagem para escrever aplicações web escaláveis.  Como o Node.js usa um modelo orientado a eventos, focado em I/O não bloqueante, desenvolver nele pode ser diferente para quem está acostumado às aplicações web tradicionais. Neste livro, Caio Ribeiro Pereira quebra essa enorme barreira, mostrando claramente essa mudança de paradigma, além de focar em tópicos importantes, as APIs principais e frameworks como o Express e o Socket.IO.',
      '2015-05-01',
      163,
      59.9,
      39.9,
      79.9,
      '978-85-5519-013-1',
      'http://cdn.shopify.com/s/files/1/0155/7645/products/nodejs-featured_medium.png?v=1411486494');
      
insert into autor (nome, informacoes, imagemUrl)
values('Caio Ribeiro Pereira',
      'Caio Ribeiro Pereira trabalha como web developer na Concrete Solutions e sua experiência é baseado no domínio dessa sopa de letrinhas: Node.js, Javascript, Meteor, Ruby, Java, MongoDB, Redis, Riak, Filosofia Lean, Agile, XP e TDD.  É bacharel em Sistemas de Informação, blogueiro nos tempos livres e apaixonado por programação, web, tecnologia, filmes e seriados. Participante ativo das comunidades: NodeBr, DevInSantos e Guru-Baixada e iniciou-se, em 2011, como palestrante nos eventos DevInSantos e Exatec, abordando temas atuais sobre Node.js e Javascript. Criador do DevFreeCasts e DevFreeBooks, moderador da comunidade Meteor Brasil e editor do UDGWebDev Weekly.',
      'http://cdn.shopify.com/s/files/1/0155/7645/files/caio-ribeiro-pereira_small.png?54691');

insert into livroAutor(idLivro, idAutor) values('10','12');

-- LIVRO 11
insert into livro (titulo, descricao, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl)       
values('REST: Construa API''s inteligentes de maneira simples',
      'De alguma maneira, os sistemas modernos precisam se integrar com outros sistemas, seja para coletar dados, enviar informações, autenticação ou várias outras funcionalidades.  Neste livro, Alexandre Saudate ensina como implementar APIs REST, que são simples e fáceis de manter, indo desde o básico dos formatos de dados como XML e JSON, passando por uma implementação rústica de um serviço e evoluindo para uso da poderosa especificação Java, o JAX-RS. Você ainda vai aprender técnicas avançadas, como trabalhar com as Hypermedias, criando fluxos inteligentes nos seus serviços. Veja também como realizar autenticação através do OAuth e muito mais!',
      '2015-05-01',
      163,
      59.9,
      39.9,
      79.9,
      '978-85-5519-013-1',
      'http://cdn.shopify.com/s/files/1/0155/7645/products/rest-featured_medium.png?v=1411566684');
      
insert into autor (nome, informacoes, imagemUrl)
values('Alexandre Saudate',
      'Alexandre Saudate é graduado em Sistemas de Informação pela Universidade de São Paulo (USP). Trabalha com desenvolvimento desde 2005 e com SOA desde 2008. Desde então, tem trabalhado com pesquisa e desenvolvimento sobre esse tipo de arquitetura e também com projetos envolvendo tecnologias de ponta, para empresas como Porto Seguro, Serasa, Porto de Santos, iG e outras.  Foi instrutor Oracle e, mais recentemente, se tornou instrutor da SOA|Expert, uma escola especializada no assunto. Hoje, é especialista em projetos de integração SOA e/ou Cloud Computing.',
      'http://cdn.shopify.com/s/files/1/0155/7645/files/alexandre-saudate_small.png?54691');
      
insert into livroAutor(idLivro, idAutor) values('11','13');
      
-- LIVRO 12      
insert into livro (titulo, descricao, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl) 
values('MySQL: Comece com o principal banco de dados open source do mercado',
      'O MySQL é praticamente onipresente nos projetos de software atuais. Boa parte deles o utiliza como banco de dados para armazenar as informações da sua aplicação, por conta da sua facilidade de instalação e configuração.  Neste livro, Vinícius Carvalho introduz o leitor no mundo do banco de dados MySQL, ensinando os principais comandos DML e DDL, e ferramentas gráficas. Você vai aprender a trabalhar com procedures, manipular triggers, criar backups e vários outros recursos que fazem a diferença no dia a dia.',
      '2015-05-01',
      163,
      59.9,
      39.9,
      79.9,
      '978-85-5519-013-1',
      'http://cdn.shopify.com/s/files/1/0155/7645/products/bancomysql-featured_medium.png');
      
insert into autor (nome, informacoes, imagemUrl)
values('Vinícius Carvalho',
      'Vinícius Carvalho é entusiasta por computação, apaixonado por informação e por conhecimento, fanático por esporte desde de 2007. Trabalha e estuda diversas áreas de sistemas e tecnologia da informação, mantendo-se atualizado nos assuntos do mundo da tecnologia, computação e empreendedorismo.  Já trabalhou como Analista de Suporte, Desenvolvedor, Analista de Sistemas, Gerente de Projetos, professor de graduação e atualmente é Analista de Sistemas Sênior do maior grupo educacional do mundo, a Kroton, além de manter projetos próprios.',
	  'http://cdn.shopify.com/s/files/1/0155/7645/files/vinicius-carvalho_small.png');
        
insert into livroAutor(idLivro, idAutor) values('12','14');      

-- LIVRO 13      
insert into livro (titulo, descricao, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl)       
values('Caixa de Ferramentas DevOps: Um guia para construção, administração e arquitetura de sistemas modernos',
      'Sempre que precisamos montar um ambiente, seja para desenvolvimento ou para um servidor que vá executar em produção, gastamos bastante esforço na instalação das dependências necessárias e várias vezes nos pegamos perdendo tempo com detalhes pequenos de configuração pelos quais já passamos várias vezes.  Neste livro, Gleicon Moraes vai ensinar como evitar todos esses problemas com o uso de poderosas ferramentas para criação de ambientes portáveis, fazendo com que você tenha sistemas facilmente reproduzíveis e prontos para executar o que você quiser, sem chateações e problemas obscuros de configuração. ',
      '2015-05-01',
      163,
      59.9,
      39.9,
      79.9,
      '978-85-5519-013-1',
      'http://cdn.shopify.com/s/files/1/0155/7645/products/oy0mvtYotVNh0eUSt2CAC3Kf7j_qtMIxtd31jNUYP08_size_1024x768_size_mode_2_medium.jpeg?v=1438176025');

insert into autor (nome, informacoes, imagemUrl)
values('Gleicon Moraes ',
      'Gleicon Moraes é autor e colaborador de projetos opensource como RestMQ e Beano, entre outros. Formado em Ciência da Computação, e pós-graduado em Sistemas de Informação, especializou-se em sistemas distribuídos e operações em larga escala. Palestrou em conferências como OSCon, QCON, Rubyconf, NoSQLBR entre outras.   Pode ser encontrado no Twitter em @gleicon, no GitHub em https://github.com/gleicon e linkedin https://linkedin.com/in/gleicon. Slides e material de palestras podem ser encontrados em http://www.slideshare.net/gleicon e https://speakerdeck.com/gleicon/',
      'http://cdn.shopify.com/s/files/1/0155/7645/files/gleicon-moraes_small.png?54691');

insert into livroAutor(idLivro, idAutor) values('13','15');

-- LIVRO 14      
insert into livro (titulo, descricao, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl)       
values('Explorando APIs e bibliotecas Java: JDBC, IO, Threads, JavaFX e mais',
      'Uma vez que você aprende Orientação a Objetos e o básico do Java, é necessário se tornar fluente em suas APIs, que não são poucas. Um programador Java eficaz conhece o que há disponível e sabe quando pode usar cada uma das possibilidades que a linguagem lhe oferece. É isso que queremos para você.  Rodrigo Turini ensina como lidar com as diferentes APIs do Java com exemplos práticos e que são relevantes no seu dia a dia. Você vai aprender as diferentes APIs para fazer IO, trabalhar com threads da forma correta, se conectar com banco de dados via JDBC, integrar com ferramentas de build e muito mais.',
      '2015-05-01',
      163,
      59.9,
      39.9,
      79.9,
      '978-85-5519-013-1',
      'http://cdn.shopify.com/s/files/1/0155/7645/products/cover-apis-java_medium.jpeg?v=1423244220');

insert into autor (nome, informacoes, imagemUrl)
values('Rodrigo Turini',
      'Rodrigo Turini é Bacharel em Ciência da Computação, desenvolvedor, instrutor pela Caelum e autor de cursos do Alura. Desenvolve sistemas principalmente em Java e, atualmente, participa do expert group que mantém a JSR 371 (Model-View-Controller) e JSR 370 (JAX-RS 2.1), sendo a primeira uma nova especificação do JavaEE 8. Rodrigo tem participação ativa na comunidade, participando de diversas listas de discussões sobre linguagens e frameworks, e tendo palestrado em eventos no Brasil e exterior, como DevCamp 2013 e JavaOne 2014, em San Francisco. É um dos líderes de desenvolvimento do VRaptor e contribui para diversos outros projetos open source. Gosta de estudar continuamente as melhores práticas da orientação a objetos, programação funcional e Java 8.',
      'http://cdn.shopify.com/s/files/1/0155/7645/files/rodrigo-turini_small.png?54691');

insert into livroAutor(idLivro, idAutor) values('14','16');

-- LIVRO 15      
insert into livro (titulo, descricao, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl)       
values('Test-Driven Development: Teste e Design no Mundo Real com PHP',
      'Por que não testamos software? Porque é caro? Porque é demorado? Porque é chato? Testes automatizados são a solução para todos esses problemas. Aprenda a escrever um programa que testa seu programa de forma rápida, barata e produtiva, e aumente a qualidade do seu produto final.  Neste livro, você aprenderá sobre TDD, uma das práticas ágeis de desenvolvimento de software mais populares. TDD faz o desenvolvedor escrever o teste antes mesmo de implementar o código. Essa simples inversão na maneira de se trabalhar faz com o que o desenvolvedor escreva um código mais testado, com menos bugs, e, inclusive, com mais qualidade. Seja profissional, teste seu software!',
      '2015-05-01',
      163,
      59.9,
      39.9,
      79.9,
      '978-85-5519-013-1',
      'http://cdn.shopify.com/s/files/1/0155/7645/products/cover_ce399913-9822-4509-ab16-fad1cfad2df3_medium.jpeg?v=1421769309');

insert into autor (nome, informacoes, imagemUrl) 
values('Andre Cardoso',
      'Andre Cardoso é desenvolvedor PHP, bacharelando em Análise e Desenvolvimento de Sistemas, Técnico em Informática com foco em desenvolvimento de sistemas Web-based. Trabalha exclusivamente com PHP há cerca de 5 anos e durante este período esteve envolvido em projetos de todos os portes para grandes clientes como HSBC, Renault e Liquigás. Também desenvolveu sistemas para inúmeras startups nos estados do Paraná, Santa Catarina e São Paulo. Antes do PHP, aventurou-se com Java, um pouco de .Net e Delphi, mas foi no PHP que decidiu focar e especializar-se.  Atualmente, trabalha na empresa Redsuns Tecnologia em Curitiba que tem foco em soluções tecnológicas inteligentes e desenvolvimento de startups.  Ministrou palestras e workshops sobre TDD, PHP e tecnologias que o complementam  nos eventos SFD (Software Freedom Day), FTSL (Fórum de Tecnologia em Software Livre) e  FLISOL (Festival Latino Americano de Instalação de Software Livre). Tem uma enorme satisfação  como profissional em compartilhar conhecimento e faz isso participando de diversos grupos  de discussões e alguns projetos open source.',
      'http://cdn.shopify.com/s/files/1/0155/7645/files/andre-cardoso_medium.png?54691');

insert into livroAutor(idLivro, idAutor) values('15','17');
insert into livroAutor(idLivro, idAutor) values('15','3');

-- LIVRO 16
insert into livro (titulo, descricao, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl)       
values('Programando em Go: Crie aplicações com a linguagem do Google',
      'Go é uma linguagem moderna, criada com o objetivo principal de melhorar a produtividade no desenvolvimento em larga escala de servidores, baseado nas experiências de alguns times dentro do Google.  Hoje, mais de quatro anos após ter sido anunciada publicamente, cada vez mais empresas têm adotado a linguagem para escrever diversos tipos diferentes de aplicações, muito além dos servidores.  Go traz um misto interessante de recursos de alto e baixo nível que a torna atraente para diferentes públicos. Suas principais características incluem o controle inteligente de dependências, compilação rápida e eficiente, sintaxe simples, gerenciamento automático de memória incluindo um coletor de lixo, sistema de tipos forte e estático, funções de primeira classe e suporte nativo e de alto nível para concorrência.  Este livro apresenta ao leitor os recursos da linguagem Go e importantes partes de sua biblioteca padrão, sempre incluindo exemplos relevantes que demonstram o uso de cada recurso.',
      '2015-05-01',
      163,
      59.9,
      39.9,
      79.9,
      '978-85-5519-013-1',
      'http://cdn.shopify.com/s/files/1/0155/7645/products/google-go-featured_medium.png?v=1411566554');

insert into autor (nome, informacoes, imagemUrl)
values('Caio Filipini',
      'Caio Filipini é Bacharel em Sistemas de Informacão e trabalha com tecnologia desde 2003. Já participou de diversos projetos como desenvolvedor e consultor, a maioria envolvendo as linguagens Java, JavaScript e Ruby. Foi desenvolvedor na Caelum, e atualmente trabalha como desenvolvedor backend na SoundCloud em Berlim, na Alemanha.',
      'http://cdn.shopify.com/s/files/1/0155/7645/files/caio-filipini_small.png?54691');

insert into livroAutor(idLivro, idAutor) values('16','18');

-- LIVRO 17
insert into livro (titulo, descricao, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl)       
values('Componentes Reutilizáveis em Java com Reflexão e Anotações',
      'Muitos dos recursos providos pelos frameworks e componentes mais utilizados na indústria extrapolam os simples conceitos da Orientação a Objetos e fazem uso de reflexão e anotações. A utilização dessas poderosas ferramentas pode fazer uma grande diferença, com potencial de aumentar a produtividade do time e melhorar a estrutura do código.  Neste livro, o uso de reflexão e anotações é abordado por completo, indo desde o funcionamento da API até boas práticas em sua utilização. Além disso, o livro também fala sobre ferramentas de código aberto, manipulação de bytecode e as novidades sobre reflexão do Java 8. Suba de nível em suas habilidades de programação aprendendo essa técnica que vai lhe permitir escrever códigos extremamente flexíveis.',
      '2015-05-01',
      163,
      59.9,
      39.9,
      79.9,
      '978-85-5519-013-1',
      'http://cdn.shopify.com/s/files/1/0155/7645/products/reflexao-anotacoes-featured_medium.png?v=1416318033');

insert into autor (nome, informacoes, imagemUrl)      
values('Eduardo Guerra',
      'Eduardo Guerra é desenvolvedor de frameworks, editor-chefe da revista MundoJ e pesquisador do Instituto Nacional de Pesquisas Espaciais (INPE). Foi professor do Instituto Tecnológico de Aeronáutica (ITA), onde concluiu sua graduação, mestrado e doutorado. Suas pesquisas concentram-se nas áreas de design, arquitetura e teste de software. Possui diversas certificações da plataforma Java e experiência como arquiteto de software. Participa de projetos de frameworks open-source, como SwingBean, Esfinge e ClassMock. Ele acredita que um bom software faz-se mais com criatividade do que com código e vive em busca de melhores formas para seu desenvolvimento.',
      'http://cdn.shopify.com/s/files/1/0155/7645/files/eduardo-guerra_small.png?54691');
      
insert into livroAutor(idLivro, idAutor) values('17','19');

-- LIVRO 18
insert into livro (titulo, descricao, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl)       
values('Aplicações Java para a web com JSF e JPA',
      'Neste livro, você encontrará as especificações mais utilizadas do Java, explicadas com exemplos práticos e claros que mostram como usar cada tecnologia em separado e como utilizá-las em conjunto.  Conheças as melhores práticas da JPA 2.0, seus mapeamentos, caches e truques de performance, e tire o máximo do JSF 2.2 compreendendo seu ciclo de vida e as novidades que surgiram nas atuais versões das especificações.',
      '2015-05-01',
      163,
      59.9,
      39.9,
      79.9,
      '978-85-5519-013-1',
      'http://cdn.shopify.com/s/files/1/0155/7645/products/jsf-jpa-featured_medium.png?v=1411486340');

insert into autor (nome, informacoes, imagemUrl) 
values('Gilliard Santos Cordeiro',
      'Gilliard Santos Cordeiro é Analista de Sistemas pela UFMS e especialista em Engenharia de Software pela Uniderp. É também tomador de tereré, tirador de foto, pescador e karateca amador. Iniciou tomando tereré desde muito cedo, como todo sul-mato-grossense, mas na programação só teve o primeiro contato na faculdade, em 2002.  O início profissional foi em 2003, onde como estagiário programou em Lotus Script e um ano depois começou a desenvolver em Java. Algum tempo depois, junto com outros amigos fundou o JUGMS, que hoje organiza anualmente o Javaneiros, o maior evento de desenvolvedores de Mato Grosso do Sul. O gosto pela pesca e pelo karatê veio depois de ''velho'', aos 28 anos. Foi coordenador de novas tecnologias (P&D) no Tribunal de Justiça de MS, onde atualmente é diretor da área de desenvolvimento de sistemas. Ele mantém um blog em http://gilliard.eti.br.',
      'http://cdn.shopify.com/s/files/1/0155/7645/files/gilliard-cordeiro_small.png?54691');
      
insert into livroAutor(idLivro, idAutor) values('18','20');

-- LIVRO 19     
insert into livro (titulo, descricao, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl)       
values('Microsoft Kinect: Crie aplicações interativas',
      'Com o crescimento e popularização da tecnologia, é cada vez mais comum pessoas de diferentes idades utilizarem aplicativos. Com isso, surge a necessidade do uso de interfaces naturais em aplicações. Aprenda com este livro a criar aplicações incríveis aproveitando todos os recursos do sensor de movimentos Microsoft Kinect.  Crie aplicativos modernos que são acessíveis através de gestos, poses e comandos de voz. Aprenda a utilizar sistemas de coordenadas de três dimensões e matemática de forma simples e sem traumas. Se você já sabe C# já tem tudo que precisa para entrar neste mundo de interfaces naturais e sensores de movimento.',
      '2015-05-01',
      163,
      59.9,
      39.9,
      79.9,
      '978-85-5519-013-1',
      'http://cdn.shopify.com/s/files/1/0155/7645/products/kinect-featured_medium.png?v=1416319109');

insert into autor (nome, informacoes, imagemUrl)
values('Gabriel Schade Cardoso',
      'Gabriel Schade Cardoso trabalha como desenvolvedor de software em .NET desde 2008, tem experiência nas plataformas desktop, web e mobile utilizando principalmente metodologias ágeis, e iniciou-se, em 2012, como palestrante em eventos de tecnologia. Bacharel em Ciência da Computação, consumidor e criador de jogos no tempo livre, e apaixonado por tecnologia (principalmente sensores e mobile), filmes, livros e seriados. Pode ser encontrado em facebook.com/gabrielschade, twitter.com/gabrielschade e github.com/gabrielschade.',
      'http://cdn.shopify.com/s/files/1/0155/7645/files/gabriel-schade-cardoso_small.png?54691');

insert into livroAutor(idLivro, idAutor) values('19','21');

-- LIVRO 20      
insert into livro (titulo, descricao, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl)       
values('Edição e organização de fotos com Adobe Lightroom',
      'Uma imagem vale por mil palavras. Uma foto pode deixar alguém sem palavras. Contudo, como encontrar alguma foto específica no meio de outras milhares? E como editar, corrigir e mostrá-las a amigos ou clientes de maneira eficiente e profissional?  Uma sessão fotográfica pode facilmente conter milhares de arquivos, e o número cresce cada vez mais à medida que os anos passam. Seja você um fotógrafo profissional ou hobbista, ainda é preciso ter uma boa organização sobre seu trabalho, além de ferramentas que lhe ajudem a ser mais produtivo.  Para estas e outras coisas o Adobe Lightroom é a ferramenta perfeita. Com uma interface otimizada para fotógrafos de todos os níveis, pensada desde o início em produtividade e qualidade, este programa para Windows e Mac irá lhe surpreender.!',
      '2015-05-01',
      163,
      59.9,
      39.9,
      79.9,
      '978-85-5519-013-1',
      'http://cdn.shopify.com/s/files/1/0155/7645/products/adobe-lightroom-featured_medium.png?v=1416316972');

insert into autor (nome, informacoes, imagemUrl)
values('Rafael Steil',
      'Rafael Steil é fotógrafo hobbista há mais de 10 anos, tendo passado por diversas fases durante os anos, de filme a digital. Consegue passar horas editando uma única foto simplesmente pelo prazer do processo. Tem grande paixão por fotografia de paisagens e portraits. Acesse seu site.',
      'http://cdn.shopify.com/s/files/1/0155/7645/files/rafael-steil_small.png?54691');
      
insert into livroAutor(idLivro, idAutor) values('20','22');      
      
----------------------------------
------------- COMPRA -------------

--insert into usuario values('rafael.rollo@caelum.com.br');
--insert into compra(emailUsuario) values('rafael.rollo@caelum.com.br');
--insert into compra(emailUsuario) values('rafael.rollo@caelum.com.br');
--
--insert into item(idLivro, idCompra, formatoLivro) values(1, 1, 0);
--insert into item(idLivro, idCompra, formatoLivro) values(2, 1, 1);
--insert into item(idLivro, idCompra, formatoLivro) values(1, 2, 2);

-- ------------------------------------------------------------

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

		
insert into livroAutor values('1','1');


-- LIVRO 2
insert into livro (titulo, descricao, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl) 
values(	'Spring MVC: Domine o principal framework web Java',
		'O Spring é o principal concorrente da especificação JavaEE. Com uma plataforma muito estável e com integração fina entre todas as suas extensões, fornece um ambiente muito propício para que o programador foque nas regras de negócio e esqueça dos problemas de infraestrutura.   Durante o livro, será construída uma aplicação baseada na loja da Casa do Código e você terá a chance de utilizar diversas das funcionalidades e integrações providas pelo framework. Usaremos o Spring MVC como alicerce da nossa aplicação web e para implementar todas as funcionalidades, utilizaremos diversas integrações, como: Spring JPA, para facilitar o acesso ao banco de dados; Spring Security, para segurança da aplicação; diferenciação de ambientes com a parte de Profiles; respostas assíncronas para melhorarmos a escalabilidade; e ainda detalhes, como cache e suporte às requisições, seguindo o estilo REST.   Tudo isso sem uma linha de XML, todas configurações serão feitas baseadas em anotações e código Java.',
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

		
insert into livroAutor values('2','2');
insert into livroAutor values('2','1');


-- COMPRA

insert into usuario values('rafael.rollo@caelum.com.br');
insert into compra(emailUsuario) values('rafael.rollo@caelum.com.br');
insert into compra(emailUsuario) values('rafael.rollo@caelum.com.br');

insert into item(idLivro, idCompra, formatoLivro) values(1, 1, 0);
insert into item(idLivro, idCompra, formatoLivro) values(2, 1, 1);
insert into item(idLivro, idCompra, formatoLivro) values(1, 2, 2);

use casaDoCodigo;

insert into livro (nomeLivro, descricaoLivro, dataPublicacao, numeroPaginas, valorFisico, valorVirtual, valorVirtualComFisico, isbn, imagemUrl) 
values(	'Jogos Android: Crie um game do zero usando classes nativas',
		'195, 300, 800 milhões de dólares!!! Essas são as cifras por trás dos jogos Angry Birds, Candy Crush e Clash of Clans. Quer pensar em cifras menores? Que tal 120 mil reais por dia? Foi o que Flappy Bird chegou a faturar. Pois é, já pensou em trabalhar com algo criativo, divertido e recompensador? Desenvolver jogos pode ser assim.   Neste livro, Felipe Torres mostra como criar um jogo do zero sem usar frameworks e discute as vantagens e desvantagens dessa abordagem usada pelo criador de Flappy Bird. Usando a linguagem Java, você vai desenvolver um jogo para Android e entender de fato como funciona a criação de jogos através da óptica do desenvolvedor e terá mais confiança e informação para decidir os caminhos do que esperamos. Seja o novo jogo viral do mercado!',
		'2015-07-04',
		96,
		59.9,
		39.9,
		79.9,
		'978-85-5519-013-1',
		'http://cdn.shopify.com/s/files/1/0155/7645/products/games-android-miniature.png');

insert into autor (nomeAutor,detalhesAutor,imagemAutor)
values ('Felipe Torres',
		'Felipe Torres é Bacharel em Ciência da Computação pelo IME-USP e atua como instrutor e desenvolvedor Android há mais de 5 anos na Caelum. Apaixonado por programação de jogos, criou sua versão de Carmen Sandiego, que teve mais de 100.000 downloads no Google Play Store. Além disso, participa ativamente de diversas comunidades como o GUJ, onde foca no ensino e solução de dúvidas e o Android Open Source Project, com contribuições no código-fonte do sistema Android.',
		'http://cdn.shopify.com/s/files/1/0155/7645/files/felipe-torres_medium.png');

		
insert into livroautor values('1','1');

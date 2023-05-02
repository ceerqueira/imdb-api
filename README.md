

# R Movies

Projeto de backend com a linguagem Java, é um desafio do <a href="https://7daysofcode.io/matricula/java">Seven Days of Code</a> que visa gerar um site HTML com os dados que foram consumidos da API do <a href="https://imdb-api.com/">IMDB</a>.
| 🪧 Vitrine.Dev |     |
| -------------  | --- |
| ✨ Nome        | Filme
| 🏷️ Tecnologias | Java, HTML, CSS, BootStrap
| 🚀 URL         | https://sruinascimento.github.io/7days-of-code-java/
| 🤿 Desafio | https://7daysofcode.io/matricula/java



![](https://user-images.githubusercontent.com/50030996/235753192-a13cf698-7536-44d3-bb84-9ffe52d50dc5.png#vitrinedev)

![](https://user-images.githubusercontent.com/50030996/235753547-f777921f-6f46-45bb-b50b-a5f7047354d2.png)



## 🔨 Tecnologias

- ``Java - 17.0.2 2022-01-18 LTS``
- ``HTML5``
- ``CSS3``
- ``Bootstrap``
- ``Git``


## #7DaysOfCode Java


## 1º Dia
  - criar o código Java que executará uma requisição HTTP do tipo GET. Você pode usar o pacote java.net.http e as classes HttpRequest, HttpClient e HttpResponse, além da classe URI.
  - executar a requisição e pegar a resposta (o JSON).
  - imprimir o corpo da resposta no console.
  
  
## 2º Dia
  - parsear as respostas, extrair o json.
  - fazer uso de Expressões regulares para o parser.
  - utilizar List<String> para cada atributo.
  

## 3º Dia
  - utilizar conceitor de Orientação a Objetos.
  - modelar uma classe para filmes com os atributos title, url, rankingimdb e year. 
  
  
## 4º Dia
  - criar uma nova classe HTMLGenerator, que recebe no construtor um Writer (por exemplo, PrintWriter).
  - adicionar um método chamado ‘generate’, que irá receber uma List<Filme>.
  - aplicar estilização CSS, ou utilizar modelos do Bootstrap por exemplo.
  
  
 ## 5º Dia
   - criar uma classe chamada ImdbApiClient para encapsular a requisição para a API do IMDB .
   - criar uma classe para o parseamento JSON, pois o mesmo está avulso na classe Main.


## 6º Dia
   - criar uma interface chamada Content definir o comportamento comum de qualquer conteúdo. A interface terá quatro métodos com retornos do tipo string, os quais são: title(), urlImage(), rating() e year().
   - classe movie deverá implementar a interface Content.
   - criar um interface JsonParser, com o método parse(). 


## 7º Dia
   - implementar a interface Comparable<? extends Content> na classe (ou record) Movie (e também na classe Series, se você a tiver criado). Para começar, você pode implementar o método usando a nota (rating) como parâmetro de comparação.
  - o método sort() está sobrecarregado, então você pode passar um Comparator como segundo parâmetro para inverter a lista
  - implementar outras formas de comparação usando um Comparator.
  
  

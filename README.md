# Classes Abstratas
## Detalhes:
### 1. Não suporta Herança Múltipla
### 2. Pode conter métodos concretos ou abstratos: Isso quer dizer que todos os métodos de uma classe abstrata podem ser tanto concretos como, também, todos podem ser abstratos;
### 3. Pode conter atributos de todos os tipos
### 4. Contém construtor
### 5. Quando utilizar? Diferente da interface que pode estar envolvida com diversas classes sem qualquer relação entre si, uma classe abstrata continua sendo uma classe. E sabemos que quando uma classe X herda de uma classe Y é o mesmo que dizer que X é um Y. Ou seja, quando queremos criar várias classes que irão compartilhar um mesmo comportamento, uma classe abstrata é o componente ideal para ser a base para criação de todas elas, servindo como um molde para as futuras classes que irão derivar dela. Conclusão: classes abstratas definem a identidade de suas classes derivadas ditando o que e como uma classe deve se comportar, o que aumenta o acoplamento entre classes, porém faz total sentido em algumas situações.
### 6. Não pode criar objetos numa classe abstrata.

***************

## Por que criar uma Classe Abstrata:
### A razão é quando a classe mãe for abstrata. Por exemplo, uma classe abstrata chamada Pertences. Ou seja, isso pode ser qualquer coisa. É muito genérico. Mas como não pode se criar objetos concretos numa super-classe abstrata, as sub-classes instanciam seus objetos e herdam da classe mãe abstrata ao colocarmos "abstract" em seus métodos.

# Classes Wrappers (Embrulhador)
## Levando em conta este backgound para entendermos sobre essas classes chamadas wrappers:
### 1. Existem duas categorias de tipos de dados:
#### a. Tipos primitivos: int, double, float e etc. Eles não herdam de Object.
#### b. Tipos de Classes. Todas as classes herdam indiretamente de Object.
### 2. Classes Wrappers:
#### a. É a ponte que faz com que os tipos primitivos trabalhem com os tipos de classes para herdarem de Object.
#### b. Todo tipo primitivo tem uma classe Wrapper correspondente.
#### c. A classe Wrapper é a representante do tipo primitivo no mundo das classes do Java.
#### d. Integer é uma classe que representa o tipo primitivo int no mundo dos objetos. Podemos dizer que a classe Integer vai "embrulhar"(wrapper) o tipo primitivo "int".
#### e. Integer é usado no lugar de int.
#### f. Double é usado no lugar de double.
#### g. Boolean é usado no lugar de boolean.
#### h. Character é usado no lugar do char.
#### i. Long no lugar de long.
#### j. Short no lugar de short.
### 3. Classes Wrappers podem sofrer o inverso. Ou seja, podem ser "desembrulhadas".
### 4. Método Parse: Pense em um valor digitado pelo usuário em uma caixa de texto, por exemplo. Você recebe ele em formato String e precisa converter ele para Double. é isso que métodos como esse fazem.
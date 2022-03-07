# Interfaces em Java
##
#### 1. Ao usar Interfaces, você está focando no que o objeto faz e não em como ele faz.
#### 2. Quando você separa a implementação da definição do que aquele objeto é capaz de fazer, você consegue fazer com que o seu sistema interaja apenas com aquela interface e não conheça a implementação por trás.
#### 3. Ao eliminar essa dependência da implementação, você pode trocar a implementação, sem precisar mexer no resto do sistema.
#### 4. O uso de interfaces é super importante na expansão do sistema e/ou até mesmo em manutenções futuras.
#### 5. Quando o seu método referencia apenas a interface e não as implementações dessa interface, o método ficará protegido de alterações que posteriormente sejam feitas.
#### 6. Ao usar Interfaces, isto é, uma classe implementando os métodos de uma interface, você não usa extends, lembre-se de usar a palavra-chave implements. Mas se uma interface herdar os métodos de outra interface, usar o extends (herança).
#### 7. Na herança, o java permite que se herde apenas de uma classe. Ao usar o "extends", você só "extends" "de alguém" e não "de alguns". No caso da Interface, não existe essa restrição. Você pode implementar de quantas interfaces quiser.
#### 8. As interfaces ajudam na abstração de conceitos e a achar alguma coisa em comum.
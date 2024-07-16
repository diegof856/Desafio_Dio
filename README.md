# Funcionamento da Classe Bootcamp

A classe `Bootcamp` representa um programa de treinamento para desenvolvedores onde eles podem se inscrever para aprender diversos conteúdos. Abaixo está uma explicação detalhada de como essa classe funciona:

### Atributos da Classe

- **`nome`**: Armazena o nome do bootcamp.
- **`descricao`**: Descrição detalhada do que o bootcamp oferece.
- **`dataInicial`**: Data de início do bootcamp, inicialmente definida como a data atual.
- **`datafinal`**: Data final do bootcamp, calculada como 45 dias após a `dataInicial`.
- **`devInscritos`**: Conjunto de desenvolvedores inscritos no bootcamp.
- **`conteudos`**: Conjunto de conteúdos oferecidos pelo bootcamp, como cursos e mentorias.

### Métodos Principais

- **`getNome()` e `setNome(nome)`**: Métodos para obter e definir o nome do bootcamp.
- **`getDescricao()` e `setDescricao(descricao)`**: Métodos para obter e definir a descrição do bootcamp.
- **`getDataInicial()` e `setDataInicial(dataInicial)`**: Métodos para obter e definir a data de início do bootcamp.
- **`getDatafinal()` e `setDatafinal(datafinal)`**: Métodos para obter e definir a data final do bootcamp.
- **`getDevInscritos()`**: Retorna o conjunto de desenvolvedores inscritos no bootcamp.
- **`getConteudos()`**: Retorna o conjunto de conteúdos oferecidos pelo bootcamp.
- **`hashCode()` e `equals(Object obj)`**: Métodos sobrescritos para garantir a comparação adequada dos objetos `Bootcamp` com base nos seus atributos.

### Funcionalidades Adicionais

- **Gerenciamento de Inscrições**: O método `inscreverBootcamp(Bootcamp bootcamp)` permite que um desenvolvedor se inscreva no bootcamp, adicionando todos os conteúdos do bootcamp ao conjunto `conteudosInscritos` do desenvolvedor e adicionando o desenvolvedor ao conjunto `devInscritos` do bootcamp.

- **Datas de Início e Término**: As datas de início e término são inicialmente definidas ao criar um novo objeto `Bootcamp`, proporcionando uma duração predefinida para o programa de treinamento.

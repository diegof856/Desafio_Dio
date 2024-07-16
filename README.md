# Funcionamento do Sistema de Bootcamp para Desenvolvedores

O sistema de bootcamp para desenvolvedores é composto por diversas classes que permitem o gerenciamento de cursos, mentorias, desenvolvedores inscritos e seu progresso no programa de treinamento. Abaixo está uma explicação detalhada de como as principais classes funcionam:

## Classe Curso

A classe `Curso` representa um curso oferecido no bootcamp. Possui os seguintes atributos:

- **`titulo`**: Título do curso.
- **`descricao`**: Descrição detalhada do curso.
- **`cargaHoraria`**: Carga horária do curso em horas.

### Métodos Principais

- **`getCargaHoraria()` e `setCargaHoraria(cargaHoraria)`**: Métodos para obter e definir a carga horária do curso.
- **`toString()`**: Retorna uma representação textual do curso incluindo título, descrição e carga horária.
- **`calcularXp()`**: Calcula e retorna a experiência (XP) obtida ao concluir o curso.

## Classe Mentoria

A classe `Mentoria` representa uma sessão de mentoria oferecida no bootcamp. Possui os seguintes atributos:

- **`data`**: Data da mentoria.
- **`formatter`**: Formato de formatação da data para exibição.

### Métodos Principais

- **`getData()` e `setData(data)`**: Métodos para obter e definir a data da mentoria.
- **`toString()`**: Retorna uma representação textual da mentoria incluindo título, descrição e data formatada.
- **`calcularXp()`**: Calcula e retorna a experiência (XP) obtida ao participar da mentoria.

## Classe Dev

A classe `Dev` representa um desenvolvedor participante do bootcamp. Possui os seguintes atributos:

- **`nome`**: Nome do desenvolvedor.
- **`conteudosInscritos`**: Conjunto de conteúdos (cursos, mentorias) nos quais o desenvolvedor está inscrito.
- **`conteudosConcluidos`**: Conjunto de conteúdos que o desenvolvedor concluiu.

### Métodos Principais

- **`inscreverBootcamp(bootcamp)`**: Inscreve o desenvolvedor em um bootcamp, adicionando todos os conteúdos do bootcamp aos `conteudosInscritos`.
- **`progredir()`**: Move o primeiro conteúdo inscrito para `conteudosConcluidos` após o desenvolvedor progredir.
- **`calcularTotalXp()`**: Calcula e retorna o total de XP acumulado pelos conteúdos concluídos.

## Classe Bootcamp

A classe `Bootcamp` representa o programa de bootcamp em si. Possui os seguintes atributos:

- **`nome`**: Nome do bootcamp.
- **`descricao`**: Descrição detalhada do bootcamp.
- **`dataInicial`**: Data de início do bootcamp, inicialmente definida como a data atual.
- **`datafinal`**: Data final do bootcamp, calculada como 45 dias após a `dataInicial`.
- **`devInscritos`**: Conjunto de desenvolvedores inscritos no bootcamp.
- **`conteudos`**: Conjunto de conteúdos oferecidos pelo bootcamp.

### Métodos Principais

- **`getNome()` e `setNome(nome)`**: Métodos para obter e definir o nome do bootcamp.
- **`getDescricao()` e `setDescricao(descricao)`**: Métodos para obter e definir a descrição do bootcamp.
- **`getDataInicial()` e `setDataInicial(dataInicial)`**: Métodos para obter e definir a data de início do bootcamp.
- **`getDatafinal()` e `setDatafinal(datafinal)`**: Métodos para obter e definir a data final do bootcamp.
- **`getDevInscritos()`**: Retorna o conjunto de desenvolvedores inscritos no bootcamp.
- **`getConteudos()`**: Retorna o conjunto de conteúdos oferecidos pelo bootcamp.
- **`inscreverBootcamp(dev)`**: Inscreve um desenvolvedor no bootcamp, adicionando todos os conteúdos do bootcamp aos `conteudosInscritos` do desenvolvedor.
- **`hashCode()` e `equals(Object obj)`**: Métodos sobrescritos para garantir a comparação adequada dos objetos `Bootcamp` com base nos seus atributos.

---

Este sistema permite a gestão completa de um bootcamp para desenvolvedores, desde a definição e oferta de cursos e mentorias até a inscrição e progresso dos desenvolvedores participantes. Cada classe desempenha um papel fundamental na estruturação e funcionamento do programa de treinamento.

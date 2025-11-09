# ArvoreBinaria-Recursividade
Trabalho Prático – Árvores Binárias e Recursividade

# Trabalho: Árvores Binárias e Recursividade

**Aluno:** João Pedro Lima Barbosa  
**Curso:** Engenharia de Software  
**Disciplina:** Estrutura de Dados  

## Parte 1 – Conceitos

**1. O que é recursividade?**  
Recursividade é quando uma função chama a si mesma para resolver um problema menor, até atingir um caso base.  
Exemplo: cálculo de fatorial, onde `fatorial(n) = n * fatorial(n-1)` e o caso base é `fatorial(0) = 1`.

**2. Como a recursividade é usada na árvore binária?**  
É usada para percorrer os nós: a função visita um nó, depois chama a si mesma para o filho esquerdo e o direito. O caso base é quando o nó é nulo.

**3. Diferença entre recursão e laço (for/while)?**  
Laço repete comandos até uma condição ser falsa.  
Recursão usa chamadas de função e é melhor para estruturas como árvores.  
Laços usam menos memória, mas recursão pode deixar o código mais claro.

## Parte 2 – Execução

**Compilação e execução:**  
```bash
javac Node.java ArvoreBinaria.java Main.java
java Main
```

**Saída esperada:**  
```
Inserindo valores: 18 3 10 1 6 14 4 7 131
Em ordem: 1 3 4 6 7 10 14 18 131
Pre-ordem: 18 3 1 10 6 4 7 14 131
Pos-ordem: 1 7 4 6 10 3 131 14 18
Buscar 10: true
Buscar 5: false
```

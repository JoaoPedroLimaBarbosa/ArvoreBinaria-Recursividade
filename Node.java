// Node.java
// Representa um nó da árvore binária de busca (BST).

public class Node {
    int valor;
    Node esquerda;
    Node direita;

    public Node(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}

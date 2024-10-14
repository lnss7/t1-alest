import java.util.EmptyStackException;

public class StackOfInteger {

    private DoubleLinkedListOfInteger list;

    public StackOfInteger() {
        this.list = new DoubleLinkedListOfInteger();
    }

    /**
     * Retorna o elemento que está no topo da pilha
     * @return Integer o valor do elemento no topo da pilha.
     */
    public Integer top() {
        if (list.size() == 0) {
            throw new RuntimeException("A pilha está vazia! ");
        }
        Integer element = list.get(list.size() - 1);
        return element;
    }

    /**
     * Remove e retorna o elemento que está no topo da pilha.
     * @return Integer o valor do elemento removido do topo da pilha.
     */
    public Integer pop() {
        if (list.size() == 0) {
            throw new RuntimeException("A pilha está vazia! ");
        }
        Integer elementRemoved = list.removeByIndex(list.size() - 1);
        return elementRemoved;
    }

    /**
     * Insere um elemento no topo da pilha.
     * @param value o valor do elemento a ser inserido na pilha.
     */
    public void push(Integer value) {
        list.add(value);
    }

}
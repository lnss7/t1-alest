public class QueueOfInteger {

    private DoubleLinkedListOfInteger list;

    public QueueOfInteger() {
        this.list = new DoubleLinkedListOfInteger();
    }

    /**
     * Retorna o elemento que está no início da fila sem removê-lo.
     * @return Integer o valor do elemento no início da fila.
     */
    public Integer head() {
        if (list.isEmpty()) {
            throw new RuntimeException("A fila está vazia.");
        }
        return list.get(0);
    }

    /**
     * Remove e retorna elemento que está no início da fila.
     * @return Integer o valor do elemento no início da fila.
     */
    public Integer dequeue() {
        if (list.isEmpty()) {
            throw new RuntimeException("A fila está vazia.");
        }
        Integer value = list.removeByIndex(0);
        return value;
    }

    /**
     * Insere um elemento no final da fila.
     * @param value o valor do elemento a ser inserido na fila
     * @return void
     */
    public void enqueue(Integer value) {
        list.add(value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (list.isEmpty()) {
            return "Fila vazia";
        }

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(" -> ");
            }
        }

        return sb.toString();
    }

}
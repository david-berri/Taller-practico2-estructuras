public class ListaEnlazada {
    private Nodo head; // referencia al primer nodo de la lista

    public ListaEnlazada() {
        this.head = null; // lista vacía
    }

    // Insertar al final
    public void add(char item) {
        Nodo nuevo = new Nodo(item);

        if (head == null) {
            head = nuevo; // primer nodo
        } else {
            Nodo actual = head;
            while (actual.next != null) {
                actual = actual.next; // avanzar hasta el último
            }
            actual.next = nuevo; // enlazar el nuevo nodo
        }
    }

    // Mostrar la lista
    public void printList() {
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.item + " ");
            actual = actual.next;
        }
        System.out.println();
    }

    // Obtener referencia a la cabeza
    public Nodo getHead() {
        return head;
    }
}

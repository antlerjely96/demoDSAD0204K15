package Buoi4.ProductList;

public class ListProduct {
    Node head;

    public ListProduct(){
        this.head = null;
    }
    public void addNode (Product product){

        Node newNode = new Node(product);
        if (head == null) {
            head = newNode;
        }else {
            Node current = head;
            while (current.next != null){
                current = current.next;

            }
            current.next = newNode;
        }
    }
    public void displayList(){
        Node current = head;
        while (current != null){
            Product p = current.data;
            System.out.println(p.id + " - " + p.name + " - " + p.price + " - " +p.quantity + " - " + p.brand );
            current = current.next;
        }
    }

    public void findAllProductByBrand(String brand){
        Node current = head;
        while(current != null){
            if(current.data.brand.equals(brand)){
                System.out.println(current.data.id + " - " + current.data.name + " - " + current.data.price + " - " +current.data.quantity + " - " + current.data.brand );
            }
            current = current.next;
        }
    }

    public void addFirst (Product product){
        Node newNode = new  Node(product);
        if (head == null){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void addAny(String id, Product product){
        Node currentNode = head;
        while (currentNode != null){
            if (currentNode.data.id.equals(id)){
                Node newNode = new Node(product);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
            currentNode = currentNode.next;
        }
    }
}

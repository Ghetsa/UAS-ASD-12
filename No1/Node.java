public class Node {
  Transaksipajak data;
  Node prev, next;

  Node(Node prev, Transaksipajak data, Node next) {
      this.prev = prev;
      this.data = data;
      this.next = next;
  }
}
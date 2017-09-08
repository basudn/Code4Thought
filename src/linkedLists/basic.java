package linkedLists;

public class basic {
	public static void main(String[] args) {
		Node node = new Node(1);
		node.printElements();
		node = node.appendAtHead(0);
		node.printElements();
		node = node.appendToTail(2);
		node.printElements();
		node = node.deleteFromTail();
		node.printElements();
		node = node.deleteHead();
		node.printElements();
	}
}

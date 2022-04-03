package easy.hashtable;

import java.util.HashMap;
import java.util.Map;

public class LruCache_46 {
	private final int capacity;
	private final Map<Integer, Node> map;
	private final Node head;
	private final Node tail;

	public LruCache_46(int capacity) {
		this.capacity = capacity;
		this.map = new HashMap<>();
		this.head = new Node(-1, -1);
		this.tail = new Node(-2, -2);
		this.head.next = tail;
		this.tail.prev = head;
	}

	public int get(int key) {
		if (!map.containsKey(key)) {
			return -1;
		}

		Node node = map.get(key);
		moveToHead(node);
		return node.value;
	}

	public void put(int key, int value) {
		if (map.containsKey(key)) {
			Node node = map.get(key);
			node.value = value;
			moveToHead(node);
		} else {
			Node node = new Node(key, value);
			map.put(key, node);
			addNode(node);
		}

		if (map.size() > capacity) {
			removeEldest();
		}
	}

	private void moveToHead(Node node) {
		removeNode(node);
		addNode(node);
	}

	private void removeNode(Node node) {
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}

	private void addNode(Node node) {
		head.next.prev = node;
		node.next = head.next;
		node.prev = head;
		head.next = node;
	}

	private void removeEldest() {
		map.remove(tail.prev.key);
		removeNode(tail.prev);
	}

	static class Node {
		int key;
		int value;
		Node next;
		Node prev;

		Node(int key, int value) {
			this.value = value;
			this.key = key;
		}
	}
}

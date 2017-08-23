package com.zhao.www;

import java.util.ArrayList;
import java.util.List;

public class TEST {
	public static void main(String[] args) {

		List<Node> nodes = new ArrayList<Node>();
		Node p1 = new Node("01", "", "01", "");
		Node p6 = new Node("02", "", "02", "");
		Node p7 = new Node("0201", "02", "0201", "");
		Node p2 = new Node("0101", "01", "0101", "");
		Node p3 = new Node("0102", "01", "0102", "");
		Node p4 = new Node("010101", "0101", "010101", "");
		Node p5 = new Node("010102", "0101", "010102", "");

		nodes.add(p1);
		nodes.add(p2);
		nodes.add(p3);
		nodes.add(p4);
		nodes.add(p5);
		nodes.add(p6);
		nodes.add(p7);

		TreeBuilder treeBuilder = new TreeBuilder(nodes);
		System.out.println(treeBuilder.buildJSONTree());
	}
}

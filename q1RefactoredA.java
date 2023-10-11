package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      extractedMethod(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
	   extractedMethod(edgeList, p);
      return null;
   }

   // Note: I added the method below and called it in m1 and m2 methods  
	<T extends Graph> void extractedMethod(List<T> objs, String p) {
		for (T obj : objs) {
			if (obj.contains(p))
				System.out.println(obj);
		}
	}
}

// Note: I added the superclass below
class Graph {
	String name; 
	
	public boolean contains(String p) {
		return name.contains(p);
	}
}

class Node extends Graph {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge extends Graph {
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}
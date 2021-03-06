package lab08;

import java.util.LinkedList;
import java.util.Iterator;

/**
 * This class represents a vertex (AKA node) in a directed graph. The vertex is
 * not generic, assumes that a string name is stored there.
 * 
 * @author Erin Parker
 * @version March 1, 2019
 */
public class Vertex {

	// used to id the Vertex
	private String name;

	private Vertex previous;

	public Vertex getPrevious() {
		return previous;
	}

	public void setPrevious(Vertex previous) {
		this.previous = previous;
	}

	public double getDistanceFromStart() {
		return dist;
	}

	public void setDistanceFromStart(double dist) {
		this.dist = dist;
	}

	private double dist;

	public boolean getVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	private boolean visited;

	// adjacency list
	private LinkedList<Edge> adj;

	public Vertex(String name) {
		this.name = name;
		this.adj = new LinkedList<Edge>();
	}

	public String getName() {
		return name;
	}

	public void addEdge(Vertex otherVertex) {
		adj.add(new Edge(otherVertex));
	}

	public Iterator<Edge> edges() {
		return adj.iterator();
	}

	public String toString() {
		String s = "Vertex " + name + " adjacent to ";
		Iterator<Edge> itr = adj.iterator();
		while (itr.hasNext())
			s += itr.next() + "  ";
		return s;
	}

	public void addEdge(Vertex vertex2, double weight) {
		// TODO Auto-generated method stub

	}

	public Object getEdges() {
		// TODO Auto-generated method stub
		return null;
	}

}
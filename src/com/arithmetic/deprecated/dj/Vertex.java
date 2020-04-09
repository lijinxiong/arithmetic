package com.arithmetic.deprecated.dj;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {

    /**
     * 顶点的名称
     */
    private String name;
    /**
     * 与这个点邻接的边
     */
    private List<Edge> adjacenciesList;

    /**
     * 是否已经计算完毕了
     */
    private boolean visited;
    /**
     * 边关联的另一个节点
     */
    private Vertex predecessor;
    /**
     * 起始点到本顶点的距离
     */
    private double distance = Double.MAX_VALUE;

    public Vertex(String name) {
        this.name = name;
        this.adjacenciesList = new ArrayList<>();
    }

    public void addNeighbour(Edge edge) {
        this.adjacenciesList.add(edge);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getAdjacenciesList() {
        return adjacenciesList;
    }

    public void setAdjacenciesList(List<Edge> adjacenciesList) {
        this.adjacenciesList = adjacenciesList;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Vertex otherVertex) {
        return Double.compare(this.distance, otherVertex.getDistance());
    }
}
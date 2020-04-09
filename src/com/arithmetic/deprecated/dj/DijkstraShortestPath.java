package com.arithmetic.deprecated.dj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraShortestPath {

    /**
     * @param sourceVertex 起始点
     */
    public void computeShortestPaths(Vertex sourceVertex) {

        // 起始点到自己的距离
        sourceVertex.setDistance(0);
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceVertex);
        sourceVertex.setVisited(true);

        while (!priorityQueue.isEmpty()) {

            // Getting the minimum distance vertex from priority queue
            // 在优先队列中获取距离最小的顶点
            Vertex actualVertex = priorityQueue.poll();

            // 获取和它关联的边
            for (Edge edge : actualVertex.getAdjacenciesList()) {

                Vertex v = edge.getTargetVertex();
                if (!v.isVisited()) {
                    double newDistance = actualVertex.getDistance() + edge.getWeight();

                    if (newDistance < v.getDistance()) {
                        priorityQueue.remove(v);
                        v.setDistance(newDistance);
                        v.setPredecessor(actualVertex);
                        priorityQueue.add(v);
                    }
                }
            }
            actualVertex.setVisited(true);
        }
    }

    public List<Vertex> getShortestPathTo(Vertex targetVertex) {
        List<Vertex> path = new ArrayList<>();

        for (Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPredecessor()) {
            path.add(vertex);
        }

        Collections.reverse(path);
        return path;
    }

}
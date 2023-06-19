class GrapheEdge {
    private GrapheVertex startVertex;
    private GrapheVertex endVertex;
    
    public GrapheEdge(GrapheVertex startVertex, GrapheVertex endVertex) {
        this.startVertex = startVertex;
        this.endVertex = endVertex;
    }
    
    public GrapheVertex getStartVertex() {
        return startVertex;
    }
    
    public GrapheVertex getEndVertex() {
        return endVertex;
    }
}

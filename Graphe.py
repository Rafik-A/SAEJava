class Graph:

    class MainLink:

        def __init__(self, name, type):
            self._name = name
            self._type = type
            self._list = None
            self._listed = False
            self._next = None
    
    class EdgeLink:

        def __init__(self, origin, destination, distance, fiability, duration):
            self._origin = origin
            self._destination = destination
            self._distance = distance
            self._fiability = fiability
            self._duration = duration
            self._next = None
    
    def __init__(self, number):
        self._number = number
        self._first = None

    def addMain(self, name, type):
        newMain = Graph.MainLink(name, type)
        newMain._next = None
        self._first = newMain
    
    def addEdge(self, origin, destination, distance, fiability, duration):
        newEdge = Graph.EdgeLink(destination, distance, fiability, duration)
        current = self._first
        while current._origin != origin:
            current = current._next
        newEdge._next = current._list
        current._list = newEdge

        newEdge = Graph.EdgeLink(origin, distance, fiability, duration)
        current = self._first
        while current._origin != destination:
            current = current._next
        newEdge._next = current._list
        current._list = newEdge

    def printGraph(self):
        res = ""
        current = self._first
        while current != None:
            res += current._origin + " : "
            current2 = current._list
            while current2 != None:
                res += current2._destination + " : "
                current2 = current2._next
            res += '\n'
            current = current._next
        return res
    
g = Graph(5)
g.addMain("Lyon", "Maternité")
g.addMain("Bourg-en-Bresse", "Bloc Opératoire")
g.addMain("Vénissieux", "Nutrition")
g.addMain("Villeurbanne", "Maternité")
g.addMain("Gerland", "Bloc Opératoire")

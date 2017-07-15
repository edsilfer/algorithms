
# Initialize graph
graph = {}
graph["start"] = {}
graph["start"]["A"] = 2
graph["start"]["B"] = 5

graph["A"] = {}
graph["A"]["B"] = 8
graph["A"]["C"] = 7

graph["B"] = {}
graph["B"]["C"] = 2
graph["B"]["D"] = 4

graph["C"] = {}
graph["C"]["end"] = 1

graph["D"] = {}
graph["D"]["C"] = 6
graph["D"]["end"] = 3

graph["end"] = {}

# Initialize costs
costs = {}
costs["A"] = 2
costs["B"] = 5
costs["C"] = float("inf")
costs["D"] = float("inf")
costs["end"] = float("inf")

# Initialize parents
parents = {}
parents["A"] = "start"
parents["B"] = "start"
parents["C"] = None
parents["D"] = None
parents["end"] = None

# Initialize processeds
processeds = []

def dijkstra (graph, costs, parents):
    node = findLowestCost(costs)
    while node is not None:
        cost = costs[node]
        neighbors = graph[node]
        for n in neighbors.keys():
            newCost = cost + neighbors[n]
            if costs[n] > newCost:
                costs[n] = newCost
                parents[n] = node
        processeds.append(node)
        node = findLowestCost(costs)

def findLowestCost(costs):
    lowestCost = float("inf")
    lowestCostNode = None
    for node in costs:
        cost = costs[node]
        if cost < lowestCost and node not in processeds:
            lowestCost = cost
            lowestCostNode = node
    return lowestCostNode

# **************************************************************************** #
# MAIN
# **************************************************************************** #
dijkstra(graph, costs, parents)
print (costs)
print (parents)

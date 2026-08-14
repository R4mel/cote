from collections import deque
def solution(bridge_length, weight, truck_weights):
    answer = 0
    bridge = deque([0] * bridge_length)
    truck_weights = deque(truck_weights)
    # [0, 0, 0] [7,4,5,6]
    # [0, 0, 7] [4, 5, 6]
    currentWeight = 0
    while truck_weights:
        answer += 1
        currentWeight -= bridge.popleft()
        
        if currentWeight + truck_weights[0] <= weight:
            currentWeight += truck_weights[0]
            bridge.append(truck_weights.popleft())
        else:
            bridge.append(0)
        
    return answer + bridge_length
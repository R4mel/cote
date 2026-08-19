def solution(dirs):
    answer = 0
    used = set()
    pos = [0,0]
    move = {'U':[0,1], 'D': [0, -1], 'R':[1,0], 'L':[-1,0]}
    for dir in dirs:
        nx = pos[0] + move[dir][0]
        ny = pos[1] + move[dir][1]
        if nx < -5 or nx > 5 or ny < -5 or ny > 5:
            continue
        current = (pos[0], pos[1])
        next_pos = (nx, ny)

        if (current, next_pos) not in used:
            answer += 1
            used.add((current, next_pos))
            used.add((next_pos, current))
        
        pos[0] = nx
        pos[1] = ny
    return answer
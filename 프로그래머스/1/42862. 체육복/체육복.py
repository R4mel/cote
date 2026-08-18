def solution(n, lost, reserve):
    answer = 0
    lost = set(lost)
    reserve = set(reserve)
    
    common = lost & reserve
    lost -= common
    reserve -= common
    
    for student in sorted(reserve):
        if student-1 in lost:
            lost.remove(student-1)
        elif student+1 in lost:
            lost.remove(student+1)
    return n-len(lost)
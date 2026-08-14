def solution(citations):
    citations = sorted(citations, reverse=True)
    # [6,5,3,1,0] citations
    # [1,2,3,4,5] i
    h = 0
    for i in range(len(citations)):
        if i + 1 <= citations[i]:
            h = i + 1
        else:
            break
    return h
    
    
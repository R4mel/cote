def solution(s):
    answer = []
    
    # 바깥쪽 {{ }} 제거 후 각각의 집합으로 분리
    sets = s[2:-2].split("},{")
    
    # 집합의 크기가 작은 순서대로 정렬
    sets.sort(key=len)
    
    seen = set()
    
    for numbers in sets:
        # 각 집합의 숫자를 분리
        for number in numbers.split(","):
            number = int(number)
            
            if number not in seen:
                seen.add(number)
                answer.append(number)
    
    return answer
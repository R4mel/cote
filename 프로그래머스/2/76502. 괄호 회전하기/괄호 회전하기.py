from collections import deque
def solution(s):
    def isGood(s):
        stack = []
        
        for ch in s:
            if ch in '([{':
                stack.append(ch)
            elif ch in ')]}':
                if not stack:
                    return False
                if ch == ')' and stack[-1] != '(':
                    return False
                if ch == ']' and stack[-1] != '[':
                    return False
                if ch == '}' and stack[-1] != '{':
                    return False
                
                stack.pop()
        return len(stack) == 0
    
    answer = 0
    s = deque(s)
    
    for _ in range(len(s)):
        if isGood(''.join(s)):
            answer += 1
        s.rotate(-1)
    return answer
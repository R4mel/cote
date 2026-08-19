def solution(s):
    answer = 0
    def isGood(s):
        stack = []
        pair = {')': '(', '}': '{', ']': '['}
        
        for ch in s:
            if ch in '({[':
                stack.append(ch)
            elif ch in pair: # key check
                if not stack or stack[-1] != pair[ch]:
                    return False
                stack.pop()
        return len(stack) == 0            
            
    for i in range(len(s)):
        rotate = s[i:] + s[:i]
        if isGood(rotate):
            answer += 1
    return answer
def solution(ss):
    stack = []
    for s in ss: # s는 괄호 한개한개
        if not stack:
            stack.append(s)
        elif s == '(':
            stack.append(s)
        elif s == ')' and stack[-1] == '(':
            stack.pop()
    return len(stack) == 0
            
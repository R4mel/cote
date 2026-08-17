def solution(word):
    vowels = ['A', 'E', 'I', 'O', 'U']
    answer = 0
    count = 0

    def dfs(current):
        nonlocal answer, count

        # 현재 만들어진 문자열도 하나의 단어이므로 순서 증가
        if current:
            count += 1

        # 현재 문자열이 찾는 단어라면 순서 저장
        if current == word:
            answer = count
            return

        # 길이가 5이면 더 이상 문자를 붙이지 않음
        if len(current) == 5:
            return

        for vowel in vowels:
            dfs(current + vowel)

            # 정답을 찾았다면 더 탐색할 필요 없음
            if answer != 0:
                return

    dfs("")

    return answer
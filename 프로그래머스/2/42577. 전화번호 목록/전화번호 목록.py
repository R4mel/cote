def solution(phone_book):
    answer = True
    hash_map = {}
    for phone_number in phone_book: # 북에 있는 것을 넘버로 넣는다.
        hash_map[phone_number] = 1 # 각 번호마다 1을 할당
    for phone_number in phone_book: 
        temp = ""
        for number in phone_number:
            temp += number
            if temp in hash_map and temp != phone_number:
                return False
    return answer
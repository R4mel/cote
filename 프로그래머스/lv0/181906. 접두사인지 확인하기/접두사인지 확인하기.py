def solution(my_string, is_prefix):
    for i in range(len(my_string)):
        if my_string[0:i + len(is_prefix)] == is_prefix and i + len(is_prefix) < len(my_string):
            return 1
    return 0

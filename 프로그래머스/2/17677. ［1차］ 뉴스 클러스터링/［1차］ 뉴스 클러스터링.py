from collections import Counter
def solution(str1, str2):
    arr1 = []
    arr2 = []
    
    for i in range(len(str1)-1):
        if str1[i:i+2].isalpha():
            arr1.append(str1[i:i+2].lower())
    for i in range(len(str2)-1):
        if str2[i:i+2].isalpha():
            arr2.append(str2[i:i+2].lower())
    
    a = Counter(arr1)
    b = Counter(arr2)
    gyo = list((a & b).elements())
    hap = list((a | b).elements())
    
    if len(hap) == 0:
        return 65536
    return int(len(gyo) / len(hap) * 65536)
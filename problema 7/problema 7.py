numero_casos = int(input())

for _ in range(numero_casos):
    N = int(input())
    array_A = list(map(lambda x: int(x), input().split(' ')))
    M = int(input())
    array_B = list(map(lambda x: int(x), input().split(' ')))
    num1 = 0
    num2 = 0

    while num1 < N and num2 < M:
        if array_A[num1] == array_B[num2]:
            num2 += 1

        num1 += 1

    print("Yes" if num2 == M else "No")

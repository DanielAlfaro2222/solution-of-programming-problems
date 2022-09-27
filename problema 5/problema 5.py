numeros_casos = int(input())

for _ in range(numeros_casos):
    entrada = input().split(' ')

    A = int(entrada[0])
    B = int(entrada[1])
    X = int(entrada[2])

    if (A == B):
        print("YES")
        continue

    print("YES" if ((A-B) % (2*X) == 0) else "NO")

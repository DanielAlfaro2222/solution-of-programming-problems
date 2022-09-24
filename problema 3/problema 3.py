num = int(input())

numeros = [i for i in range(1, num)]

total = 0

if num != 1 and num != 2:
    for i in range(len(numeros)):
        for j in range(len(numeros)):
            suma = numeros[i] + numeros[j]

            if suma == num:
                total += 1
elif num == 2:
    total += 1


print(total)

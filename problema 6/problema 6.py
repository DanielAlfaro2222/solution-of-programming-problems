from functools import reduce

numero_casos = int(input())

for _ in range(numero_casos):
    cantidad_array = int(input())
    cadena = list(map(lambda x: int(x), input().split(" ")))
    total = int(reduce(lambda a, b: a * b, cadena, 1))

    if total >= 0:
        print(0)
    else:
        numeros_negativos = list(filter(lambda x: x < 0, cadena))

        print(0 if len(numeros_negativos) % 2 == 0 else 1)

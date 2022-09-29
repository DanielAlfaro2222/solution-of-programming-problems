numero_casos = int(input())

for _ in range(numero_casos):
    entrada = list(map(lambda x: int(x), input().split(" ")))

    carreras_logradas = entrada[0]
    objetivo = entrada[1]

    print(abs(carreras_logradas - objetivo))
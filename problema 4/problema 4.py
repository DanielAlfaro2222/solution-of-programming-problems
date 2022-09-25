numero_casos = int(input())

for _ in range(numero_casos):
    entrada = input().split(' ')

    cantidad_cartas = int(entrada[0])
    cartas_boca_arriba = int(entrada[1])
    resta = cantidad_cartas - cartas_boca_arriba

    if (cantidad_cartas == cartas_boca_arriba):
        print(0)
    elif (resta > cartas_boca_arriba):
        print(cartas_boca_arriba)
    else:
        print(resta)

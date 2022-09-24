numero_casos = int(input("Ingrese la cantidad de casos: "))

for _ in range(numero_casos):
    horas = int(input("Ingrese la cantidad de horas"))

    respuesta = 'YES'  if horas < 7 else 'NO'

    print(respuesta)
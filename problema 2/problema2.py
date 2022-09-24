numeros = input()

numeros = numeros.split(' ')

alice = int(numeros[0])
bob = int(numeros[1])

respuesta = "Yes" if alice >= bob*2 else "No"

print(respuesta)

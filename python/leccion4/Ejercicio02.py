# Ejercicio 2: Modificar los elementos de una lista
# Llenar una lista con los numeros del 1 al 10, luego modificar los
# elementos de la lista multiplicamos por un valor ingresado por el usuario.
# que se muestre como una tabla de multiplicar

# Inicio
lista = []

# Resolucion

for i in range(1, 11):
    lista.append(i)

numero = int(input('Ingrese un numero: '))

# Mostramoss
for i in lista:
    print(f'{i} * {numero} = {i * numero}') # mostramos pero no modificamos la lista


# Como lo hizo el profe
lista1 = list(range(1, 11))
print('lista original')
for i in lista:
    print(i, end='-')
valor = int(input('\nDigite un valor a multiplicar: '))
# Multiplicamos todos los elementos de la lista
for indice, i in enumerate(lista1): #  enumerate nos permite modificar  la lista
    lista1[indice] *= valor
print(f'lista final con los elementos multiplicados por {valor}')
for i in lista1:
    print(i, end='-')
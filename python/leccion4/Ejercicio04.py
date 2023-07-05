# Ejercicio 4: sumar numeros pares  dentro  de un rango
# hacer un programa para sumar numeros pares dentro
# de un rango, por ejemplo:

#Inicio
numeros = []
suma = 0
for i in range(2, 30):
    numeros.append(i)
print('los siguientes numero')
print(numeros)

for i in numeros:
    if i % 2 == 0:#estoo es si el numero es par
        suma+=i
print(f'\nLa sumaa de los numeros pares  dentro del rango es:  {suma}')

"""
# Como lo hizo el profe
a = int(input("Digite de donde va a comenzar la suma:"))
b = int(input("Digite hasta donde quiere llegar a sumar: "))
suma = 0
for i in range(a, b+1):
    if i % 2 == 0:#estoo es si el numero es par
        suma+=i
print(f'\nLa sumaa de los numeros pares  dentro del rango es:  {suma}')"""
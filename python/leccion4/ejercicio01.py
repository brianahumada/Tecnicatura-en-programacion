# Ejerciciio 1: Llenar una lista
# llenar una lista con numeros del 1 al 50,  luego mostrar
# la lista con el bucle for, los elementos deben mosstrarse
# de la siguientte forma: 1-2-3

# Inicio
lista = []
for i in range(1, 51):
    lista.append(f'{i}-')
print(lista)


'''
# Como lo hizo el profe
lis = []
i = 1
while i <= 50:
    lista.append(i)
    i += 1
for i in lista:
    print(i, end='-')
'''

# Algoritmo eficaz
lista = list(range(1, 51))
for i in lista:
    print(i, end='-')

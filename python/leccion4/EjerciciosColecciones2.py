# Ejercicio2:
# escriba un programa que tenga 2 lista y que a continuacion
# cree las siguientes listas ( no debe tener repeticion)
# 1 lista de palabras que aparecen en la listas
# 2 lista de palabras que aparecen en la primera lista, pero no en la segunda
# 3 lista de palabras que aparecen en la segunda lista, pero no en la primera
# 4 listas de palabrasa que aparecen en ambas listas

# inicio
lista = ['python', 'java', 'javascript', 'python', 'java', 'javascript']
lista2 = ['pasion', 'lujuria', 'locura', 'pasion', 'lujuria', 'locura']
lista3 = []

# resolucion
lista4 = list(set(lista))
lista5 = list(set(lista2))
lista3.append(lista)
lista3.append(lista2)

# Mostamos
print(f'Las palabras de las listas son: {lista,lista2}')
print(f'Lista numero 1: {lista4}')
print(f'Lista numero 2: {lista5}')
print(f'listas unidas: {lista3}')

# como lo hizo el profe
lis = [1, 2, 3, 1, 2, 5, 4]
lis2 = [4, 5, 6, 4, 5]
# eliminar los elementos repedidos
conjunto1 = set(lis)
conjunto2 = set(lis2)

union = list(conjunto1 | conjunto2) # unimos las dos cconjuntos
solo1 = list(conjunto1 - conjunto2) # solo muestra el conjunto1
solo2 = list(conjunto2 - conjunto1) # solo muestra el conjunto2
interseccion = list(conjunto1 & conjunto2) # mostramos los que numeros que se repiten en varias listas

# mostramos
print(f'Las palabras de las listas son: {union}')
print(f'Lista numero 1: {solo1}')
print(f'Lista numero 2: {solo2}')
print(f'listas unidas: {interseccion}')

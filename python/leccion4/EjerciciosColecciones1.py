# Ejercicio1:
# Escriba un programa donde tenga una lista y que a continuacion
# Elimine los elementos repetidos, por ultimo mostrar la lista.

# Inicio
lista = ["Computadora", "televisor", "Computadora", "radio", "radio", "impresora"]
lista2 = []
# Ressolucion
for item in lista:
    if item not in lista2:
        lista2.append(item)
print(lista2)

# Como lo hizo el profe
# inicio
lista3 = [1, 2, 3, 1, 2, 3]

# Resolucion
# conjunto = set(lista3) # convertimos la lista en un conjunto tipo set
# lista3 = list(conjunto) # convertimos el conjunto a una lista
lista3 = list(set(lista3)) # la convercion hecha en una sola linea de codigo ( + eficiente)

# mostramos
print(lista3)


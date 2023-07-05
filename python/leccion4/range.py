"""
# Sintaxis de  range(inicio<opcional>, fin <requerido> , incremento <opcional>)
# Ejercicio 1: iterar un rango de 0 a 10 e imprimir numeros divisibles entre 3

#inicio
rango = range(11)
resultado = []

# resolucion

for divicible in rango: # con el for in rango voy a recorer del 0 al 10
    if divicible % 3 == 0: # voy a ver cuales son divicibles en 3
        resultado.append(divicible) # voy a mostrar

# Mostramos

print(resultado)

# ejercicio 2 : crear un rango de numero de 2 a 6 imprimirlos

# inicio

rango = range(2, 7)


# resolucion

for i in rango:
    # Mostramos
    print(i)"""

# ejercicio 3 : crear un rango de 3 a 10 pero con incremento de 2 en 2

# inicio
for i in range(3, 11, 2):
    print(i)


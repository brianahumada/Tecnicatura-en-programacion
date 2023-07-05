# Ejercicio  1: crear una función para sumar los valores recibidos de tipo
# numericos, utilizando argumentos variabes *args como parametro de la
# funcion y agregar como resultado la suma  de todos los valores pasados
# como argumentos.

#Inicio

def sumar(*args):# recibimos una cantidad de parametros indefinidos
    resultado = 0
    # Iteramos cada elemento
    for valor in args:
        resultado += valor
    return resultado

print(sumar(3, 5, 9, 2, 1))



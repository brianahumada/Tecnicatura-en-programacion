# Ejercicio 2: Funcion con * args para multiplicar
# crear una funcion para multiplicar los valores recibidos
# de tipo numerico, utilizando argumentos variables *args
# como parametro de la funcion y regresar como resultado
# la multiplicacion de todos los valores pasados como argumentos

# Inicio
# Definimos la funcion para multiplicar
def multiplicar_valores(*args):  # El mas utilizado es *args
    # pass #sirve para agregarle el valor despues
    resultado = 1  # el cero no nos ayuda a multiplicar
    for numero in args:
        resultado *= numero
    return resultado


# llamamos la funcion
print(multiplicar_valores(3, 5, 15, 3))  # Le pasamos los argumentos

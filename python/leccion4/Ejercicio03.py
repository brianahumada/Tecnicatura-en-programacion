# Ejercicio 3 : insertar elementos y ordenarlos
# pedir numeros y meterlos en una lista, cuando el usuario
# introduzca un numero 0, nuestro programma dejaria  de insertar.
# por ultimo, mostrar los numeros ordenados de menos a mayor

# Inicio
lista = []
salir = False

while not salir: # lo cammbiamos a verdadero
    numero = int(input('Digite un numero: '))
    if numero == 0:
        salir = True # cuando sea correcto se detiene y con el not lo cambia a falso al inicio
    else:
        lista.append(numero)
lista.sort() # esta funcion ordena la lista
# Mostamos
print(f'\nLista ordenada: \n{lista}')


# ejercicio1
# Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas, Física,
# Química, Historia y Lengua) en una lista y la muestre por pantalla.

# inicio

matematica = []
fisica = []
quimica = []
historia = []
lengua = []

# resolucion
asignaturas = [['matematica'], ['fisica'], ['quimica'], ['historia'], ['lengua']]

# mostramos

print(asignaturas)


# ejercicio2
# Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas, Física, Química, Historia y Lengua)
# en una lista y la muestre por pantalla el mensaje Yo estudio <asignatura>, donde <asignatura> es cada una de las asignaturas de la lista.

# inicio
asignaturas = ['Matematicasa', 'Literatura', 'ingles', 'informatica', 'programacion']

# resolucion

for elementos in asignaturas:
    print('yo estudio ', elementos)

# ejercicio 3 // esta resulto pero no es eficiente
# Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas, Física, Química, Historia y Lengua) en una lista,
# pregunte al usuario la nota que ha sacado en cada asignatura,
# y después las muestre por pantalla con el mensaje En <asignatura> has sacado <nota> donde <asignatura>
# es cada una des las asignaturas de la lista y <nota> cada una de las correspondientes notas introducidas por el usuario.


asignaturas = ['matematicas'], ['literatura'], ['programacion'], ['cienciaDeDatos'], ['ingles']

# resolucion # pedimos las notas utilizamos nuevas variablese
matematicas1 = float(input('Ingrese la nota de Matematicas: '))
literatura1 = float(input('Ingrese la nota de Literatura: '))
programacion1 = float(input('Ingrese la nota de Programacion: '))
cienciaDeDatos1 = float(input('Ingrese la nota de Ciencia De Datos: '))
ingles1 = float(input('Ingrese la nota de Ingles: '))

# ponemos las notas en las listas
matematicas = [matematicas1]
literatura = [literatura1]
programacion = [programacion1]
cienciaDeDatos = [cienciaDeDatos1]
ingles = [ingles1]

asignaturas1 = [[matematicas], [literatura], [programacion], [cienciaDeDatos], [ingles]] # ponemos los datos en una matriz

# mostramos

for materia, notas in zip(asignaturas, asignaturas1): # zip se utiliza para iterar dos listas
    print('En ', materia, 'has sacado ', notas)


# ejercicio 3 Como esta echo.

# inicio
asignaturas = ['Matematicas', 'Fisica', 'Quimica', 'programacion', 'ingles']
notas = []

# Resolucion
for materia in asignaturas: # recoremos la lista de asignaturas
    notas1 = input('¿Que nota has sacado en ' + materia + '?') # ponemos en pantalla que nos ingrese la nota de cada materia
    notas.append(notas1) # agregamos las notas en otra lista
for i in range(len(asignaturas)): # len devuelve la longitud de la cadena y con range recorremos desde 0 hasta la longitud que tiene la cadena
    print('En ' + asignaturas[i] + 'has sacado ' + notas[i]) # mostramos por pantalla la materia y la nota que a sacado.



# ejercicio 4
# Escribir un programa que pregunte al usuario los números ganadores de la lotería primitiva,
# los almacene en una lista y los muestre por pantalla ordenados de menor a mayor.

# Inicio
puestos = ['primer puesto', 'segundo puesto', 'tercer puesto']
ganadores = []

# Resoluccion
for numeros in range(len(puestos)):
    numeros1 = input('ingrese el numero ganador  de la loteria en el : ')
    ganadores.append(numeros1)
ganadores.sort() # el metodo .sort nos organiza la lista.

# mostramos
print(ganadores)

# Ejercicio 4 resuelto
# Inicio
ganadores = []

# Resolucion
for i in range(6):
    ganadores.append(int(input("Introduce un numero ganador: ")))
# ordenamos con la funcion .sort()
ganadores.sort()

# mostramos
print('Los ganadores son ' + str(ganadores)) # convierte la lista en string

# ejercicio 5
# Escribir un programa que almacene en una lista los números del 1 al 10 y los muestre por pantalla en orden inverso separados por comas.

# Inicio

lista = [] # creamos la lista

# Resolucion

for i in range(1, 11): # recorremos del 1 al 10 con range
    lista.append(i) # almacenamos cada valor en la lista
print(lista) # mostramos lista sin modificar

# Mostramos modificada
lista.sort(reverse=True) # el metodo .sort() reverse puede ser True o False
print(lista)





























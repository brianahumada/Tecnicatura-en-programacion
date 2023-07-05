"""
# lista

nombres = ['Nati', 'Osbaldo', 'Lily', 'Ariel']

print(nombres)
print(nombres[0])
print(nombres[1])

# para mostrar de manera inversa.

print(nombres[-1])# numero negativos para recorrer de atras hacia el principio.
print(nombres[-2])# nos muestra el ante ultimo.

# para recorer una sierta cantidad de indices

print(nombres[0:2])# Solo muestra el indice 0 , 1 pero no el numero  2
# ir del  inicio al indice ( sin incluirlo)

print(nombres[ :3])

# Desde el indice indicado hasta el final

print(nombres[1: ])

# Modificar un valor

nombres[2] = 'Liliana'
nombres[0] = 'Natalia'

print(nombres)

# Iterar una lista

for nombre in nombres:# Nombre  es singular , la lista es plural
    print(nombre)
else:
    print('se acabaron los elementos de nuestra lista')

# preguntamos cuantos elementos tiene una lista.

print(len(nombres)) # es una funcion , le debemos pasar la lista el parametro.

# agregar un elemento.

nombres.append('Marcela')

print(nombres)

# insertar un elemento en un indice especifico

nombres.insert(1, 'Alverto') # se debe poner el entero y el elementos que queramos utilizar

print(nombres)

nombres.insert(3, 'Debora')

print(nombres)

# Eleminar elemento.

nombres.remove('Alverto') # elimina el elemento especificamente

print(nombres)

# eliminar el ultimo elemento.

nombres.pop() # No elimina el ultimo elemento ingresado si no el ultimo de la lista.

print(nombres)

# eliminar un indice especifico

del nombres[2] #del significa delate (eliminar)

print(nombres)

# eliminar, borrar o limpiar los elementos.

nombres.clear()

print(nombres)

# eliminar la lista.

del nombres

# print(nombres) # no se puede imprimir la lista porque no esta definida fue borrada."""

# Tupla es similar de una lista sigue el orden de los elementos que se agrega pero no se puede modificar ni eliminar ( inmutable)

# Definimos una tupla

cocina = ('cuchara', 'cuchillo', 'Tenedor')

print(len(cocina))

# Acceder a un elemento, para esto utilizamos corchetes no parentesis

print(cocina[0])

# Mostrar de la manera inversa

print(cocina[-1])

# como acceder a un rango
print(cocina[0:2]) # muestra el elemento 0 y 1 al 2 no lo incluye.

# ejemplo ATENTO

verduras = ('papa') # esto no es una tupla porque le falta la coma "," es de tipo string ( aunque sea un elemento debemos colocar la coma)

# Recorremos los elementos de la tupla con un ciclo For

for cocinar in cocina:
    print(cocinar, end=' ') # print esta usando \n para salto de linea ( con end=' ' lo que hacemos es que no salte de linea)

# pasamos una tupla a una lista

cocinalista = list(cocina) # de tupla a lista

cocinalista[0] = 'plato' # modificacion

cocina = tuple(cocinalista) # de lista a tupla

print('\n', cocina)

# eliminamos tupla

# del cocina
# print(cocina)


















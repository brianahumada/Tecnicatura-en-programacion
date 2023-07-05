# tipo set o conjunto
# no tiene un orden no permite guardar elemetos duplicado o repetidos
# no permite  modificaiones pero podes agregar  y eliminar
# el orden es completamente aleatorio

# Inicio
# Diccionario
planetas = {'martes', 'jupiter', 'venus'}
print(planetas)

print(len(planetas)) # len  muestra la cantidad de longitud

print('martes' in planetas) # revisar si un elemento existe
print('martes' not in planetas) #revisamos si no esta

planetas.add('Tierra') # add agrega un elemento es una funcion no agrega elementos repetidos o dupliacados
print(planetas)        # lo podemos utilizar en almacenamiento de usuario

# Eliminar

planetas.remove('jupiter') # Se elimina el elemento deseado con remove
print(planetas)

# El metodo remove() elimina el elemento que se pasa como parámetro.si no se encuentra,se lanza la exepción keyError
# ejemplo:
'''s = set([1, 2])
s.remove(2)
print(s) # {1}'''


planetas.discard('Tierra') # tambien se puede eliminar elementos
print(planetas)

# El método discard() es muy parecido al remove(),
# borra el elemento que se pasa como parámetro, y se encuentra no hace nada.
# ejemplo:
'''s = set([1, 2])
s.discard(3)
print(s) # {1, 2}'''

# Limpiar nuestro set o conjunto

planetas.clear()
print(planetas)

# Eliminar set o conjunto
del planetas
# print(planetas) # al eliminar nos muestra fun error

# Como se organiza un diccionaro
# 'maradona': 10 un diccionario esta compuesto por dos elementos
#  una llave y un valor
# dict(Key,value)
# no tiene indices
diccionario = {
    'IDE':'Integrated Development Environment',
    'POO':'Programacion orientada a objetos',
    'SABD':'Sistema de Administracion de Base de Datos'
}
print(diccionario)
# verificamos la cantidad de elementos en el diccionario
print(len(diccionario)) # vemos cuantos elementos almacenamos

# Acceder a un diccionario con llave(key)
print(diccionario['IDE']) # nos muestra el valor que esta dentro de esa llave, debe ser identica la llave ejemplo:
                          # si ponemos 'ide' nos saldra erorro igual que  si ponemos 'Ide'. debe ser igual.

# Otra forma de recuperar un elemento
print(diccionario.get('POO')) # la funcion get tambien podemos acceder al elemento.
print(diccionario.get('SABD'))

# Modificar los elementos
diccionario['IDE'] = 'Entorno de Desarrollo Integrado' # Un diccionario puede modificarse
print(diccionario)

# Como recorre los elementos

for termino in diccionario: # solo accedemos a las llaves no se puede acceder al valor
    print(termino)

# para recorrer el valor dentro de la llave vamos a usar una funcion
for termino, valor in diccionario.items(): # funcion .items
    print(termino, valor) # podemos acceder al valor solo tambien

# Otras maneras de acceder al diccionario
for termino in diccionario.keys(): # Acedemos a las llaves con esta funcion .keys()
    print(termino)

for valor in diccionario.values(): # la funcion values() nos muestra los valores sin las llaves.
    print(valor)

# Comprobar la existencia de algun elemento.
print('IDE' in diccionario) # devuelve booleano
print('IDE' not in diccionario) # pregunta si no esta esa clave

# Agregar elemento
diccionario['PK'] = 'Primary key'
print(diccionario)

# Eliminar un elemento
diccionario.pop('SABD') # eliminamos la clave y el valor dentro de esa llave.
print(diccionario)

# Como vaciar un diccionario
diccionario.clear()  # La funcion clear() borra el contenido del deccionario
print(diccionario) # El diccionario esta vacio.

# Eliminar diccionario del diccionario # elimina el diccionario.! si ponemos print(diccionario) nos saldra Error

# ejercio y tarea
# inicio
selecionArgentina = {
    10: {'Nombre': 'Lionel Messi',  'Edad': 40, 'Altura': 1.70, 'Precio': '50 Millones', 'Posicion': 'Extremo derecho'},
    8: {'Nombre': 'Marcos Javier Acuña',  'Edad': 30, 'Altura': 1.72, 'Precio': '15 Millones', 'Posicion': 'Defensa'},
    11: {'Nombre': 'Angel Di Maria', 'Edad': 34, 'Altura': 1.80, 'Precio': '12 millones', 'Posicion': 'Extremo derecho'},
    24: {'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'Precio': '35 millones', 'Posicion': 'Media Punta'},
    19: {'Nombre': 'Nicolas Otamendi', 'Edad': 34, 'Altura': 1.83, 'Precio': '3.5 millones', 'Posicion': 'Defensa Central'},
    1: {'Nombre': 'Franco Armani', 'Edad': 35, 'Altura': 1.89, 'Precio': '3.5 millones', 'Posicion': 'Portero'},
    27: {'Nombre': 'Julian Alvarez',  'Edad': 22, 'Altura': 1.73, 'Precio': '51 Millones', 'Posicion': 'Delantero'},
    18: {'Nombre': 'Guido Rodríguez',  'Edad': 28, 'Altura': 1.85, 'Precio': '80 Millones', 'Posicion': 'Centrocampista'},
    25: {'Nombre': 'Lisandro Martínez', 'Edad': 24, 'Altura': 1.75, 'Precio': '54 Millones', 'Posicion': 'Defensa'},
}
print(selecionArgentina)

# Recorremos
for llave, valor in selecionArgentina.items():
    print(llave, valor)

print(len(selecionArgentina)) #  el tamaño de diccionario

# Vamos a recorrer el diccionario
print('Vamos a Recorrer con un for el diccionario')
for i in selecionArgentina:
    print(f'{i} -> {selecionArgentina[i]}')
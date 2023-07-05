

# Comenzamos con funciones
#mi_funcion()   NO SE PUEDE.
# Definimos una funcion
def mi_funcion():
    print('mi primera funcion')

# Llamamos la funcion No se puede llamar antes de la definicion de la funcion
mi_funcion()
mi_funcion()
mi_funcion()
mi_funcion()

# PARA LLAMAR UNA FUNCION  DE OTRO MODULO LO QUE TENEMOS QUE HACER IMPORTAR EL MODULO

# desempaquetado de listas o list unpacking
def show(name, lastName):
    print(name+""+lastName)
person = ["Brian", " Ahumada"]
show(person[0], person[1]) # pasamos uno por uno los datos de la lista de función
show(*person) #  Esto es lo mismo que lo anterior paro le pasamos todo junto
person2 = ("belu", " Caceres") # desempaquetamos a traves de una tupla
show(*person2)
person3 = {"lastName": "Diaz", "name": " Brenda"}
show(**person3)

numbers = [1, 2, 3, 4, 5]
for n in numbers:
    print(n)
    if n == 3:
        break # esta es la unica manera para que noi se ejecute else
else:
    print("Esto se termina")

# list comprehension, lista de comprension

names = ["brian", "ana", "belen", "agustina", "brenda"]
alongP = [p for p in names if p[0] == "b"] # esto regresa una nueva  lista
print(alongP)

bottleC = [{"Name": "Quilmes", "country": "Arg"},
           {"Name": "Corona", "country": "Mx"},
           {"Name": "Stella Artois", "country": "Belgium"},
        ]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

# paso de argumentos(Funcioness)
def mi_Funcion(name, lastName):
    print("Saludos a todos lo que ven a través del canal de YouTube")
    print(f' Nombre: {name}, Apellido: {lastName}')


# Aca en el llamado de la funcion son parametros
mi_Funcion('Rocio', 'Santander')
mi_Funcion('aldana', 'Rogriguez')

# La palabra return en funciones
# Creamos una funcion para sumar
def sumar(a, b):
    return a + b

# pasamos los parametros a una variable
#resultado = sumar(78, 22)
#print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es {sumar(55, 45)}')

def sumar2(a:int = 0, b:int = 0):
    return a + b
resultado = sumar2()
print(f'Resultado de la suma: {resultado}')
print(f'Resultado de la suma: {sumar2(22, 66)}')

# Argumentos, variables en funciones
def lista_Nombres(*nombres): # * se refiere a que la variable va a variar y se va añadiendo a la funcion
    for nombres in nombres:
        print(nombres)# se convierte en tuplas
lista_Nombres('belen', 'julieta', 'ana', 'agustina')# argumentos son tuplas
lista_Nombres('veronica', 'lorena', 'delfina')

# definimos otra funcion para que maneje lista de terminos
# se usa doble asteritico **Kwargs
# nombres variable,**nombre tuplas, ** terminos diccionario
def listaTerminos(**terminos): # lo mas utiizado es **Kwarg pararecibir los argumentos
    for llave, valor in terminos.items(): # items para recorrer diccionarios
        print(f'{llave} : {valor}')

listaTerminos() # no recibe nada
listaTerminos(IDE='Integrated Develoment Enviroment', PK='Primary key')
listaTerminos(Nombre='Leonel Messi')

# funcion de lista
def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)

# creamos una lista
nombres2 = ['brenda', 'Belen', 'sulema']
desplegarNombres(nombres2)
desplegarNombres('Carla') # lo muestra por letra
#desplegarNombres(10)# sale error porque no es un objeto iterable
#desplegarNombres(10, 11)

# para recorrer los numeros podemos ingresar una tupla o lista
# si ponemos dos parentecis seria una tupla y se puede ingresar
desplegarNombres((10,))# tupla no olvidar la coma
desplegarNombres([25, 52])# lista

# FUNCIONES RECURSVA : SE LLAMA A SI MISMA PARA COMPLETAR UNA TAREA
# necesita un caso base y un caso recursivo, para que no se vuelva un ciclo infinito

def factorial(numero):
    if numero == 1: # caso base
        return 1
    else:
        return numero * factorial(numero-1) # caso Recursivo

#resultado = factorial(5) # lo hacemos en codigo duro
#print(f'El factorial del numero 5 es: {resultado}')

# pedimos al usuario el numero usuario
numero1 = int(input("ingrese un numero: "))

resultado = factorial(numero1)
print(resultado)

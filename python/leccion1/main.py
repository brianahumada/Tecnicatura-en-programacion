"""
miVariable = 3
print(miVariable)
miVariable = "cambio la variable"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print(z)
# las literales se escriben x=x240, la variable y=x272, la variable z=x592
print(id(x))
print(id(y))
print(id(z))
# tipos int,float,string,bool
X = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "hola alumnos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))
# manejo de cadena (string)
MiGrupoFavorito = "los piojos " "la renga"
print("mi grupo favorito es: "+MiGrupoFavorito)

# numero1 = "7"
# numero2 = "8"
# print(int(numero1) + int(numero2))

# Tipos boleanos (bool)
miBooleana = True
print(miBooleana)
miBooleana = 3 > 2
if miBooleana:
    print("el resultado es verdadero")
else:
    print("el resultado es falso")

# procesar la entrada del usuario
# resultado = input("Diigite un numero: ")
# print(resultado)

# convercion de entrada de datos
# numero1 = input("esccribir el primer numero: ")
# numero2 = input("escribe el segundo numeero: ")
# resultado = int(numero1) + int(numero2)
# print("el resultado de la  suma es: ", resultado)
# ejercicio numero 1: califica tu dia del 1 al 10
# Dia = input("que tal estuvo tu dia: ")
# print("tu dia fue evaluado el resultado fue: ", Dia)
# ejercicio numero 2: se solicita informacion libro y autor
libro = input("ingrese el nombre del libro: ")
autor = input("ingrese el nombre del autor: ")
print(libro)
print(autor)
print("el libro se llama ", libro, "escrito por ", autor)
"""
''' 27/04/2022
operandoA = 8
operandoB = 5
suma = operandoA + operandoB
# print("resultado de la suma: ", suma)
print(f'el resultado de la suma es: {suma} ')
resta = operandoA -operandoB
print(f'El resultado de la resta es : {resta}')
multiplicacion = operandoA * operandoB
print(f'El resultado de la multiplicacion es : {multiplicacion}')
division = operandoA / operandoB
print(f'El resultado de la divicion es: {division}')
division1 = operandoA // operandoB
print(f'El resultado de la divicion entera es: {division1}')
modulo = operandoA % operandoB
print(f'El resultado de la divicion o residou (modulo) es: {modulo}')
exponente = operandoA ** operandoB
print(f'El resultado del exponente es: {exponente}')

radio = float(input("ingrese el valor del radio: "))
area = 3.14 * (radio**2)
circunferencia = 2 * (3.14 * radio)
print("el aria del circulo es: ", area, "y su circurferencia es: ", circunferencia)

alto = int(input("Ingresar el alto del rectángulo: "))
ancho = int(input("Ingresar el ancho del rectángulo: "))
area = alto * ancho
perimetro = (alto + ancho) * 2
print(f'Teniendo el 
rectangulo con {alto} de alto y {ancho} de ancho\nEl área es: {area}\nY el perímetro es: {perimetro}')

miVariable3 = 10
print(miVariable3)
# operadores  dee reasignacion
miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1
print(miVariable3)
miVariable3 *= 3
print(miVariable3)
miVariable3 /= 5
print(miVariable3)
miVariable3 -= 5
print(miVariable3)
# operadores de comparacion
d = 4
b = 2
resultado = (d == b)  # comprobamos si son iguales con ==
print(resultado)
resultado1 = d != b
print(resultado1)
 
numero = int(input("ingrese un numero  y verificaremos si es impar o par: "))
print(f'El residuo de la divicion es: {numero % 2}')
if (numero % 2) == 0:
    print(f'el numero {numero} es par')
else:
    print(f"el numero {numero} es impar")

numero = int(input("ingrese su edad: "))
segunda = 8
if numero >= 18:
    print(f'Eres mayor de edad {numero}')
elif numero == segunda:
    print(f'el  numero es igual a la segunda variable {numero}')
else:
    print(f'Eres menor de edad {numero}')  
# operadores logicos
# operador and
a = False
b = False
resultado = a and b
print(resultado)
# operaador or
resultado = a or b
print(resultado)
# operador not
resultado = not a
print(resultado) 
#  ejercicio dentro de un rango
numero = int(input("ingrese un numero: "))
resultado = numero >= 0 and numero <= 5
print(f'¿El numero ingresado {numero} se encuentra dentro del rango? {resultado}')
# eejercicio or, operador not
vacaciones = True
diaDescanso = True
if not (vacaciones or diaDescanso):  # cambia el resuulado  not
    print("tiene trabajo que hacer")
else:
    print("puede asisstir al juego")
# ejercicio 3 rango de 20 a 30 años
edad = int(input("Ingrese su edad: "))
# veinte = edad <= 20 and edad <= 30
# treinta = edad <= 30 and edad <= 40
 #  if veinte:
 #   print(f'se encuentra dentro del rango  de 20 a 30 años')
 #   elif treinta:
 #      print('Estas dentro del rango de 30 a 40 años')
 #   else:
 #       print('No esta dentro del rango')
 if (20 <= edad <30) or (30 <= edad < 40):
    print (f'estas dentro delrango')
else:
    print (f'se encuentra fuera de rango de 20 y 40 años')
# ejercicio 4 el mayor de los numeros
numero1 = int(input("Digite un  numero: "))
numero2 = int(input("digite segundo numero: "))
if numero1 < numero2:
    print("el numero 1 es mayor que el numero 2")
elif numero1 > numero2:
    print("el numero 2 es mayor que el numero 1")
elif numero1 == numero2:
    print("El numero 1  y numero 2 son iguales")'''
# ejercicio tiendade libro
print("INGRESE LOS SIGUINTES DATOS DEL  LIBRO")
nombre = input("ingrese el nombre del libro: ")
idd = int(input("ingrese el id del libro: "))
precio = float(input("ingrese el precio: "))
envioGratuito = input("ingrese si el envio es gratituo (True/False)")
if envioGratuito == 'True':
    envioGratuito = True
elif envioGratuito == 'False':
    envioGratuito = False
else:
    envioGratuito = "El valor  ingresado es incorrecto introdusca (True/False) "
print(f'''
        Nombre:{nombre}
        ID:{idd}
        Precio:{precio}
        Envio Gratuito:{envioGratuito}
''')

"""
# Ejercicio 1:
# Deberemos plasmar la expresion en una expresión
# algoritmica, oseaa hacerlo en codig

a = float(input('Digite el valor de a: '))
b = float(input('Digite el valor de b: '))
c = float(input('Digite el valor de c: '))
resultado = (a ** 3 * (b ** 2 - 2 * a * c)) / (2 * b)
print(resultado)
# Ejercicio 2: determinar la solucion logica..
a = bool((3 + 5 * 8) < 3)
b = bool((3 + 5 * 8) + 2 < 2)
resultado = a and b or (a > b)
print(resultado)
# ejercicio 3: Intercambiar el valor de dos variables
a = 10
b = 5
print(f'El valor de a es: {a}')
print(f'El valor de b es: {b}')
a = 5
b = 10
print(f'El valor de a que cambiamos es: {a}')
print(f'El valor de b que cambiamos es: {b}')"""
# Ejercicio 4 : Área y longitud de un circulo hacr un programa para ingresar el radio de un circulo
# y se reporte su área y la longitud de la circurferencia.// importamos el modulo de matematica
import math
radio = float(input("ingrese el radio del circulo: "))
area = (math.pi * radio ** 2)
print(f'El area del circulo es: {area}')
longitud = (2 * math.pi * radio)
print(f'La longitud del circulo es: {longitud} ')

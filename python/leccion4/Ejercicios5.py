#Ejercicio 5 : Factorial de un numero positivo
#hacer un programa para calculaar el factoriall de un numero positivo

"""numero = int(input("Digite un numero positivo:  "))
numero2 = []

for i in range(numero, numero, +1):
    numero2.append(i)
print(numero2)"""


# Como lo hizo el profe
numero = int(input("Digite un numero"))
while numero < 0:
    print("Error --- el numero tiene que ser positivo")
    numero = int(input("Digite  un numero: "))
factorial = 1  # la variable para calcular el factorial
for i in range(1, numero+1):
    factorial*=i
print(f'\nEl factorial del numero {numero} positivo ingresadoo es: {factorial}')


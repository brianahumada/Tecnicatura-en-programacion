# ejercicio 7 : juego adivina el numero
# realizar un juego para adivinar un numero. Para ello se debe
# generar un numero aleatorio entre 1 - 100, y luego ir pidiendo
# numeros indicando " es mayor" o "es menor" segun sea mayor o menor
# con respecto a N. el proceso termina cuando el usuario acierta
# y alli se debe mostrar el numero de intentos.
import random
# Inicio
print(" JUEGO ADIVINA EL NUMERO ")

aleatorio = random.randint(0, 100)
contador = 0
while True:
    numero = int(input(" Digite un numero: "))
    contador += 1
    if numero > aleatorio:
        print("\tNo es el numero, digite un numero menor")
    elif numero < aleatorio:
        print("\tNo es el numero digite un numero mayor")
    else:
        print(f"Felicidades, acabas de adivinar el numero{aleatorio}")
        break # Rompe el ciclo y el bucle

print(F"\nNumeros de intentos: {contador}")



# Ejercicio 3: función recursiva
# Imprimir números de 5 a 1 de manera descendente usando funciones recursivas
# puede se cualquier calor positivo, por ejemplo, si pasamos el valor.de
# 5, debe imprimir:
# 5
# 4
# 3
# 2
# 1
# si se ingresan números negativos no imprime nada
# numero ingresado por el usuario
numero = int(input("Igrese un numero: "))


def imprimir_numeros_recursivos(numero):
    if numero >= 1:  # caso base
        print(numero)
        # una funcion se llama para que que sea recusiva
        imprimir_numeros_recursivos(numero - 1)  # menos uno pra que valla restando
    elif numero == 0:
        return
    elif numero <= 0:
        print("valor ingresado incorrecto")


imprimir_numeros_recursivos(5)
imprimir_numeros_recursivos(numero)  # llamamos al numero.

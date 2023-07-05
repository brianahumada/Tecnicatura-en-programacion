elementos = int(input(" ingrese un la cantidad de numeros que quiera ingresar: "))
pares = 0
impares = 0
i = 1
suma = 0
impares1 = 0
while elementos >= i:
    num = int(input("digite un numero: "))
    if num % 2 == 0:
        suma = suma + num
        pares += 1
    elif num % 2 != 0:
        impares = impares + num
        impares1 += 1

    i += 1
promedio = impares / impares1
print(f'la suma de los numeros pares son: {suma}\nLa cantidad de numeros pares: {pares}\nPromedio de numeros impares {promedio}')
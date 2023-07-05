num = 0
positivo = 0
negativo = 0
neutro = 0
i = 1
for i in range(10):
    num = float(input("Digite un numero: "))
    if num > 0:
        positivo = positivo + 1
    elif num < 0:
        negativo = negativo + 1
    elif num == 0:
        neutro = neutro + 1
print(f'la cantidad de numeros positivos: {positivo}')
print(f'la cantidad de numeros negativos: {negativo}')
print(f'la cantidad de numeros neutros: {neutro}')



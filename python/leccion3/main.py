# ciclo whille (mientraas o durrantes)
"""
contador = 0
while contador < 78:
    print('Ejecutamos nuestro ciclo while', contador)
    contador += 1
else:
    print('Fin del ciclo  while')

# imprimir numeros del 0 al 5 con el ciclo while
maximo = 5
contador = 0
while contador <= maximo:
    print(contador)
    contador += 1
# imprimir numeros del  5  al 0 con el ciclo while
minimo = 1
contador = 5
while contador >= minimo:
    print(contador)
    contador -= 1

# ciclo for
cadena = 'Hello'
for letra in cadena:
    print(letra)
else:
    print('Fin del ciclo for')

# palabra reservada break
for letra in 'Alemania':
    if letra == 'a':
        print(f'letra encontrada: {letra}')
        break # rompe el ciclo y termina
else:
    print('fin del ciclo')
"""
# palabra reservada continue
for i in range(6):
    if i % 2 == 0:
        print(f'el valor: {i}')
for i in range(6):
    if i % 2 != 0:
        continue # anula toodos los numeros que sean impares y vuelve a buscar en el rango
    print(f'valor: {i}')
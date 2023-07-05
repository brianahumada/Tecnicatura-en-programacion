# En esta clase veremos la sentencia if/else

condicion = False
if condicion is True:  # pusimos "is" para que no salte de error porque si ponemos "==" (simplificado)
    print('Condicion Verdadera')  # "is": devolvera truve si dos variables apuntal al mismo objeto
elif condicion is False:  # "==" : devolvera true si los valores de la vareable son iguales
    print('Condicion Falsa')
else:
    print('Condicion sin especificar')

num = int(input('digite un numero en el rango del 1 al 3: '))
numTexto = ''
if num == 1:
    numTexto = 'numero 1'
elif num == 2:
    numTexto = 'numero 2'
elif num == 3:
    numTexto = 'numero 3'
else:
    numTexto = 'has ingresado un numero fuera de rango'
print(f'El numero ingresado es: {num} - {numTexto}')
# sintaxis simplificada en codigo pequeño
condicion = True
print('Condicion Verdadera') if condicion else print('Condicion Falsa')

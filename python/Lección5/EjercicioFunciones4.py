
# Ejercicio 4: Calculadora de impuestos
# Crear una funcion para calcular el total de un pago incluyendo
# un impuesto aplicado. (IVA)
# formula: pago_total = Pago_sin_impuesto + pago_sin_impuesto *(impuesto/100)
# proporcione el pago sin impuesto: 1000
# proporcione el monto del impuesto: 21%
# paga con impuesto: XXXXXX


# Creamos la funcion que calcula el total del pago incluyendo el impuesto
def calcular_total(pagoSin, impuesto):
    return pagoSin + pagoSin * (impuesto/100)

#Pedimos los datos al usuario
pagoSin = float(input("Digite el pago sin impuesto: "))
impuesto = float(input("Digite el monto del impuesto a aplicar: "))

#agregamos una variable llamada pagoCon impuesto
pagoCon = calcular_total(pagoSin, impuesto)

#Mostramos
print(f'El pago con impuesto es: {pagoCon}')



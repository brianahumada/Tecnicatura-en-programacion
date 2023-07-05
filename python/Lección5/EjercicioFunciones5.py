# Ejercicio 5: convertidor de temperaturas
# Realizar dos funciones para convertir de grados celsius
# a fahrenheit y viseversa.
# Investigar las formulas

#funcion de celsius a fahrenheit
def celsius_fahrenheit(numero1):# pedimos los celsius
    return (numero1 * 1.8) + 32

#funcion para pasar de fahrenheit a celsius

def fahrenheit_celsius (numero2): # Pedimos los gahrenheit
    return (numero2 - 32) / 1.8

# hacemos un menu
print(":::::Menu:::: convertidor de temperatura")
print("1.De celsius a fahrenheit")
print("2.De fahrenheit a celsius")
print("Ingrese una opcion correcta")
numero3 = 0
while 1 != numero3 != 2:
    numero3 = float(input("Ingrese un opción: "))

    if numero3 == 1:
        celsius = celsius_fahrenheit(float(input("Digite los grados celsius: ")))
        # Mostramos
        print(f'los grados fahrenheit son: {celsius}')
    elif numero3 == 2:
        fahrenheit = fahrenheit_celsius(float(input("Digite los grados fahrenheit: ")))
        #mostramos
        print(f'Los grados celsius son: {fahrenheit}')
    else:
        print("intente nuevamente")










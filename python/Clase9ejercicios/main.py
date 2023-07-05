i = 0
while i == 0:
    fecha = int(input("Ingrese un año:  "))
    if (fecha % 4 == 0):
        print("El año es bisiesto")

    elif (fecha % 100 == 0 and  fecha % 400 == 0):
        print("No  es año bisiesto")
    i = int(input("siquiere seguir utilizando el programa ingrese  0 si no preccione algun numero: "))



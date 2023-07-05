# Ejercicio 8: Menú interactivo - cajero automatico
# hacer un programa que simule un cajero automatico con un saldo
# inicial de 1.000$ y tendrá eñ siguiente menu de opciones
#           1. Ingresar dinero en la cuenta
#           2. Retirar dinero de la cuenta
#           3. Mostrar dinero disponible
#           4. Salir

saldo = 1000
while True:
    print("\t.:MENU:.")
    print("1. Ingresar dinero en la cuenta")
    print("2. Retirar dinero de la cuenta")
    print("3. Mostrar dinero disponible")
    print("4. Salir")
    opcion = int(input("Digite una opcion de menu: "))
    print()
    if opcion == 1:
        extra = float(input("Digite cuanto dinero desea ingresar en su cuenta -> "))
        saldo += extra
        print(f"Dinero en la cuenta al momento: ${saldo}")
    elif opcion == 2:
        retirar = float(input("Cuanto dinero desea retirar -> "))
        if retirar > saldo:
            print("No tiene suficiente fondo en esta cuenta")
        else:
            saldo -= retirar
            print(f"Dinero en la cuenta al momento: ${saldo}")
    elif opcion == 3:
        print(f"Dinero en la cunta al momento: ${saldo}")
    elif opcion == 4:
        print(f"Gracias por utilizar su cajero automatico, hasta pronto ")
        break
    else:
        print("Se a equivocado de opcion intente nuevamente")
        print()

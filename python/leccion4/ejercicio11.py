# Ejercicio 11: agennda telefonica
# hacer un programa que simule una agenda de contactos. Crear un
# diccionario donde la clave sea el nombre de usuario y el valor
# sea el telefono, el
#   1. nuevo contacto
#   2. Borrar contacto
#   3. ver contactos existentese
#   4. salir

# Inicio
agenda = {
    "Brian Ahumada": 2625595941,
    "Nora": 2625958635,
    "Belu": 2625144895
}

while True:
    print("_:MENU:_")
    print("1. Nuevo contacto")
    print("2. borrar contacto")
    print("3. Mostrar agenda de contactos")
    print("4. salir")

    opcion = int(input("Digite una opcion: "))

    if opcion == 1:
        nombre = input("Ingrese un nombre: ")
        telefono = int(input("Ingrese un numero de telefono: "))
        if nombre not in agenda:
            agenda[nombre] = telefono
        else:
            print("Este nombre de contacto ya existe")
        print("Contacto agregado exitosamente")

    elif opcion == 2:
        nombre = input("Ponga el nombre que quiere eliminar: ")
        if nombre in agenda:
            del (agenda[nombre])
            print("Se ha eliminado el contacto requerido")
        else:
            print("Ese contacto no existe en la agenda")
    elif opcion == 3:
        print("Agenda de contactos")
        for clave, valor in agenda.items():# items
            print(f"Nombree : {clave}, telefono : {valor}")
    elif opcion == 4:
        print("Gracias por utilizar su agenda de contacto")
        break
    else:
        print("Ha ingresado una opción de menu que no existe ")
        print()







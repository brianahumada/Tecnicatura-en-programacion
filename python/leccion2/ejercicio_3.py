# ejercicio3 : http://campus.frsr.utn.edu.ar/moodle/mod/lesson/view.php?id=23989
mes = int(input("ingrese una estacion de mes numero entero: "))
if mes >= 1 and mes <= 3 :
    print("se encuenra en verano")
else:
    if mes >= 4 and mes <= 6 :
        print("se encuentra en otoño")
    else:
        if mes >= 7 and mes <= 9 :
            print("se encuentra en invierno")
        else:
            if mes >= 10 and mes <= 12 :
                print("se encuentra en primavera")
            else:
                print("Error ingrese un numero entero del 1 al 12")
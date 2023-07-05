# ejercicio5:http://campus.frsr.utn.edu.ar/moodle/mod/lesson/view.php?id=23989

calificacion = float(input("digite la calificacion obtenida:"))
if calificacion >= 9 or calificacion <= 10 :
    print("A")
elif calificacion >=8 and calificacion < 9 :
    print("B")
elif calificacion >= 7 and calificacion < 8 :
    print("C")
elif calificacion >= 6 and calificacion < 7 :
    print("D")
elif calificacion >= 0 and calificacion < 6:
    print("F")
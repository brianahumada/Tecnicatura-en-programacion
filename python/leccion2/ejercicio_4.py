# Ejercicio4: http://campus.frsr.utn.edu.ar/moodle/mod/lesson/view.php?id=23989
edad = int(input("ingrese la edad que tienes:"))

if 0 <= edad < 10:
    print("la infancia es increible y bella")
else:
    if 10 <= edad <= 19:
        print("tienees muchos cambios,mucho que estudiar")
    else:
        if 20 <= edad <= 29:
            print("amor y comienza el trabajo")
        else:
            if 30 <= edad <= 39:
                print("traabajo y mas trabajo")
            else:
                if 40 <= edad <= 49:
                    print("hijos y familia")
                else:
                    if 50 <= edad <= 59:
                        print("cambio de casa y de señora")
                    else:
                        if 60 <= edad <= 69:
                            print("jubilacion y vacaciones")
                        else:
                            if 70 <= edad <= 79:
                                print("problemas de salud")
                            else:
                                print("felicitaciones tienes mas de 80,es hora de morir")
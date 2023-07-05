calificacion = 0
i = 0
suma = 0
calificacion1  = 0
calificacionBaja = 11
for i in range(10):
    calificacion = int(input("ingrese la nota del alumno: "))
    suma = suma + calificacion
    if calificacion < calificacionBaja:
        calificacionBaja = calificacion
promedio = suma / 10
print(f'La calificacion promedio es: {round(promedio,2)}')
print(f'La calificacion mas baja es:  {round(calificacionBaja,2)}')

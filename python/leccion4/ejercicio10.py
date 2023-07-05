# Ejercicio 10: no repetir caracteres
# hacer un programa que pida una cadena por teclado, luego
# meter los caracteres en una lista sin repetir caracteres

# Inicio
caracteres = set()
cadena = input("escriba un deseo: ")
for i in cadena:
    caracteres.add(i)

# Mostramos
print("Los caracteres aparecidos en el deseo sin repetir son: ")
print(caracteres)

# como lo hizo el profe
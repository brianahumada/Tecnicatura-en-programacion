# Ejercicio 9: Mostrar una frrase sin espacios y contar su longitud
# Hacer un programa donde el usuario ingrese una frase, se le
# devolvera la misma frase pero sin espacios en blanco, y
# ademas un contador de cuantos caracteres tiene la frase
# (sin contar los espacios en blanco)
# ejemplo:  Frase = vivir por siempre  en paz
#           frase final = vivirporsiempreenpaz
#           frase de caracteres = 20

# Inicio
frase = input("Digite una frase: ")
frase2 = " "

for i in frase:
    if i != " ":
        frase2 += i
frase = frase2

# Mostramos
print(f'\nFrase final: {frase}')
print(f'\nNumeros de caracteres: {len(frase)}')
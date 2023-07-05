# Ejercicio 6: Tabla de multiplicar
# Hacer un programa que pida un numero por teclado y guarde
# en una lisa su tabla de multiplicar hasta el 10. por ejemplo:
# si digita en el 5 la lista tendra: 5,10,15,20,25,30,40,45,50

# Inicio
lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
numero = int(input("Digiete un numero: "))
resultado = []

#Desarrollo
for i in lista:
    resultado.append(i * numero)

# Mostramos
print(f'\nEl numero ingresado fue {numero} y su tabla de multiplicar es: ')
print(resultado)
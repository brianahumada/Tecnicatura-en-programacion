"""
Crear la clase cubo con los atributos,
ancho alto y profundidad, con un método calcular_volumen que tendra la formular:
volumen = ancho * altura * profundidad
que le usuario ingrese los valores
"""

class Cubo :
    def __init__(self, ancho, altura, profundidad):
        self.ancho = ancho
        self.altura = altura
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.ancho * self.altura * self.profundidad


print("Calcular el volumen de un cubo")
ancho = int(input('Digite el ancho: '))
altura = int(input('Digite la altura: '))
profundidad = int(input('Digite la profundidad: '))

cubo1 = Cubo(ancho, altura, profundidad)
print(f'El volumen del cubo es: {cubo1.calcular_volumen()}')

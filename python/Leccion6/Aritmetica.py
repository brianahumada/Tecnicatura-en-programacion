class Aritmetica:
    """
    el nombre de este tipo de comentario es: DocString
    esto es documentacion de la clase de python
    Vamos a hacer en esta clase algunas operaciones de: suma resta multiplicacion y mas.
    """

    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB
    # Metodo para sumar
    def sumar(self):
        return self.operandoA + self.operandoB
    #metodo para restar
    def resta(self):
        return  self.operandoA - self.operandoB
    #metodo para multiplicar
    def multiplicacion(self):
        return self.operandoA * self.operandoB
    # Metodo para dividir
    def divicion(self):
        return  self.operandoA / self.operandoB



#llamamos
aritmetica1 = Aritmetica(7, 9) # le pasamos los argumentos para los operadores
print(f'La suma es: {aritmetica1.sumar()}')


print(f'La resta es: {aritmetica1.resta()}')


print(f'La multiplicación es: {aritmetica1.multiplicacion()}')

print(f'La divicion es: {aritmetica1.divicion():.2f}') # :.2f Para agregar dos sifras despues de la coma 


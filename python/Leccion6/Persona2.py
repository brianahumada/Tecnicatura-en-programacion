class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad


    def mostrar_detalles(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}')

    @property # Decorador
    def nombre(self): # Método Getter
        print('Estamos utilizando el método get')
        return self._nombre

    @nombre.setter
    def nombre(self, nombre): # Método Setter
        print('Estamos utilizando el método set')
        self._nombre = nombre

    @property
    def apellido(self): #Getter
        return self._apellido

    @apellido.setter
    def apellido(self, apellido): #set
        self._apellido = apellido

    @property
    def edad(self): #Getter
        return self._edad

    @edad.setter
    def edad(self, edad): #set
        self._edad = edad


persona1 = Persona2('brian', 'Ahumada', 27)
print(persona1.nombre)
persona1.nombre = 'celeste' # Llamos al metodo setter
persona1.edad = 28 # setter
print(persona1.mostrar_detalles())
persona1.apellido = 'Pereyra' # setter
print(persona1.mostrar_detalles())

#objeto nuevo
persona2 = Persona2('Rocio', 'Figeroa', 33)
print(persona2.mostrar_detalles())
persona2.nombre = 'Macarena'
persona2.apellido = 'Montero'
persona2.edad = 34
print(persona2.mostrar_detalles())

#objeto nuevo
persona3 = Persona2('Mariana', 'landaburo', 26)
print(persona3.mostrar_detalles())
persona3.nombre = "Maria"
persona3.apellido = 'romero'
persona3.edad = 30
print(persona3.mostrar_detalles())

#nuevo objeto
persona4 = Persona2('noelia', 'martinez', 25)
print(persona4.mostrar_detalles())
persona4.nombre = 'brenda'
persona4.apellido = 'Ahumada'
persona4.edad = 20
print(persona4.mostrar_detalles())



# Tarea crear tres objetos mm{as, utilizado los métodos getter and setter
# para modificar, y mostrar los cambios





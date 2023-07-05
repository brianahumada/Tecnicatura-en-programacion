class Persona: # Creamos la clase
    # Lo que vamos a realizar abajo es mala practica.
    # pass # No se procesa nada más (No tiene contenido)0

    def __init__(self, nombre, apellido, dni, edad, *args , **kwargs): # se lo llama método Init Dunder
        self.nombre = nombre
        self.apelledido = apellido
        self.dni = dni # Este atributo esta encapsulado de una manera sugerida
        self.edad = edad
        self.args = args
        self.kwargs = kwargs

    def mostrar_detalle(self): # self = this ( self puede cambiar el nombre)
        print(f'La clase Persona tiene los siguientes datos: {self.nombre} {self.apelledido} {self.dni} {self.edad}, la direccion es: {self.args}, los datos importantes son:  {self.kwargs}')

persona1 = Persona ('brian', 'ahumada',15945865, 27) # Constructor apunta directamente al metodo especial __init__
print(persona1.nombre)
print(persona1.apelledido)
print(persona1.edad)

persona2 = Persona('mari', "quieroga",159646512, 45)
print(f'El objeto2 de la clase persona: {persona2.nombre} {persona2.apelledido} {persona2.edad}')


persona3 = Persona('Maria', 'Becerra',1465456156, 20)
print(f'el objeto 3 contiene su nombre: {persona3.nombre} :su apellido: {persona3.apelledido} :EDAD: {persona3.edad}')

# Modificamos valores
persona1.nombre = 'Belen'
persona1.apelledido = 'Caceres'
persona1.edad = 26
print(f'el objeto 3 contiene su nombre: {persona1.nombre} :su apellido: {persona1.apelledido} :EDAD: {persona1.edad}')


# los atributos son: Caracteristicas
# los metodos son: El comportamiento que van a tener lo objetos( acciones )
# al metodo se lo llama a la clase y la funcion se llama a si mismo.
print(type(Persona))
persona1.mostrar_detalle()# La referencia se pasa de forma automatica
persona1.mostrar_detalle()



# llamamos de otra forma no se utiliza
# Persona.mostrar_detalle(persona1) # debemos pasarle una referencia para el self o dará error

# creamos metodos atributos ( atributo superficial solamente para la persona1
persona1.telefono = '2625849562'
print(f'Este es el telefono: {persona1.nombre} {persona1.telefono}' ) # Cremos el atributo de persona uno

# como vemos el atributo no aparece en persona dos
# print(persona2.telefono) # Error de tipo atributo, persona 2 no tiene el atributo telefono

persona4 = Persona('rogelio', 'romero', 15654984651, 22, 'telefono', '2659623595', 'calle lopez', 77, 'casa', 18, Altura=1.83, Peso=105)
persona4.mostrar_detalle()
# print(persona4._dni) esto no se puede utilizar en python
# persona3._nombre Es totalmente encapsulado



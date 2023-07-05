//Tipos de datos en javaScript
/*
para comentarios de varias lineas
*/

let nombre = 'Brian'//tipo string
console.log(typeof nombre)

let numero = 25
console.log(typeof numero)

// tipo objeto

let objeto = {
    nombre: 'belen',
    apellido: 'Caceres',
    numero: '2625859563'
}
console.log(typeof objeto)

//Tipo de dato boolean
let bandera = true;
console.log(bandera);

// otro tipo de dato Funcion es un tipo de dato
// Las funciones se puede utilizar las veces necesarias es necesario llamarla a la funcion

function miFuncion() { }
console.log(miFuncion)

//Tipo de dato symbol 

let simbolo = Symbol("Mi simbolo");
console.log(simbolo);


//tipo de dato clase
class persona {
    constructor(nombre, apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

console.log(persona)

//agregamos a una variable un objeto  y le pasamos los parametros
let persona1 = new persona('Brian', 'Ahumada')

console.log(persona1)


//Tipo de dato undefined
// este tipo de dato lo tenemos cuando la variable no esta inicializada solo ha sido creada
let x;
console.log(typeof x);

//null: significa ausencia de valor

let y = null; //null no es un tipo de dato, pero su origen es object 
console.log(typeof y);

// Tipo de dato array y Empty String
let autos = ['Citroen','Audi','BMW','Ford'];
console.log(autos)
console.log(typeof autos)

let z = '';
console.log(z); //Esto se refiere que es una cadena vacia
console.log(typeof z);



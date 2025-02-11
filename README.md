## Estudiando las Clases con POO

Para controlar todo el tratamiento de las Clases en Java mhe creado este proyecto sencillo pero eficaz para asi tener todo
bien claro a la hora de ejecutar objetos y clases. 

Con ello podemos gestionar información de personas y validar DNIs de ellas, así estamos tambien tratando excepciones.

Contiene de forma simplificada: Atributos, Constructores, Metodos y una Excepcion.


Atributos de la clase:

    numPersonas: Variable estática que cuenta el número total de instancias de Persona creadas.

    nombre, apellido, telefono, DNI: Atributos que almacenan la información personal de una persona.

    paso: Un booleano que no se utiliza en el código proporcionado, pero podría representar algún estado de la persona.

Constructores:

    Constructor por defecto (Persona()):

        Incrementa el contador numPersonas cada vez que se crea una nueva instancia de Persona.

    Constructor con parámetros (Persona(String nombre, String apellido, String telefono, String DNI)):

        Asigna los valores proporcionados a los atributos correspondientes.

        También incrementa el contador numPersonas.

Métodos:

    Getters y Setters:

        Métodos para obtener y modificar los valores de los atributos nombre, apellido, telefono y DNI.

    morir():

        Reduce el contador numPersonas en 1, simulando la "eliminación" de una persona.

    toString():

        Devuelve una representación en cadena de la persona con su nombre, apellido y teléfono.

    compruebaDNI(String DNI):

        Método privado que valida el formato del DNI.

        Verifica que el DNI tenga 8 dígitos seguidos de una letra válida según el algoritmo de validación de DNIs en España.

        Si el DNI no es válido, lanza una excepción DNIException.


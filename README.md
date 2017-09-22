# Java
Material de realizado durante las clases de Programación Orientada a Objetos I de la [Universidad Nacional del Oeste](http://uno.edu.ar/), Buenos Aires, Argentina

## Docentes:
Ing. [Leonardo Blautzik](https://github.com/leoblautzik)

Prof. Mag. Ing. [Pablo Pandolfo](mailto:ppandolfo@uno.edu.ar)

## Alumnos contribuyentes al repositorio:
[Fernando Pastorelli / Phosphorus Moscu](https://github.com/Phosphorus-M)

Fabian Zacarola

## [Codigos realizados](https://github.com/Phosphorus-M/Java/tree/master/src/Clases):
- ## [Hola Mundo](https://github.com/Phosphorus-M/Java/blob/master/src/Clases/HolaMundo.java)
Clasico mensaje de "Hola Mundo"
- ## [Numero Complejo](https://github.com/Phosphorus-M/Java/blob/master/src/Clases/Complejo.java)
Primer vistazo al paradigma de objetos.
- ## [FizzBuzz](https://github.com/Phosphorus-M/Java/blob/master/src/Clases/FizzBuzz.java)
Pertenecientes a la actividad del material de clase [2](https://docs.google.com/viewer?a=v&pid=sites&srcid=ZGVmYXVsdGRvbWFpbnx1bm9wcm9nY29ub2JqZXRvczF8Z3g6Njk0MmE2ZDZjZjQwYTk3Mg) y [3](https://docs.google.com/viewer?a=v&pid=sites&srcid=ZGVmYXVsdGRvbWFpbnx1bm9wcm9nY29ub2JqZXRvczF8Z3g6NTA3ZjFlMDlhNWVhNWIxYQ).
  Imprime por pantalla los números del 1 al 100 pero considerando lo siguiente:

    Si el número es divisible por 3 se debe imprimir “Fizz”.
    Si el número es divisible por 5 se debe imprimir “Buzz”.
    Si el número es divisible por 3 y por 5 se debe imprimir “FizzBuzz”.

- ## [Sumados](https://github.com/Phosphorus-M/Java/blob/master/src/Clases/Sumados.java)
Pertenecientes a la actividad del material de clase [2](https://docs.google.com/viewer?a=v&pid=sites&srcid=ZGVmYXVsdGRvbWFpbnx1bm9wcm9nY29ub2JqZXRvczF8Z3g6Njk0MmE2ZDZjZjQwYTk3Mg) y [3](https://docs.google.com/viewer?a=v&pid=sites&srcid=ZGVmYXVsdGRvbWFpbnx1bm9wcm9nY29ub2JqZXRvczF8Z3g6NTA3ZjFlMDlhNWVhNWIxYQ)
  Suma los 1000 primeros números naturales (1+2+3+4+...+1000), imprimiendo por cada suma el resultado parcial obtenido.
- ## [Punto](https://github.com/Phosphorus-M/Java/blob/master/src/Clases/Punto.java)
 Pertenecientes a la actividad del material de clase [4](https://docs.google.com/viewer?a=v&pid=sites&srcid=ZGVmYXVsdGRvbWFpbnx1bm9wcm9nY29ub2JqZXRvczF8Z3g6NGZhYWNhMjI1OTFhZTNkZA).

Define una clase punto que tendrá dos atributos, de tipo real, x e y, que representarán las coordenadas del punto dentro del plano. Define un método que tenga como argumento otro objeto de la clase punto y que calcule la distancia entre los dos puntos. Para probar esta funcionalidad, escribi un método main en el que se creen dos puntos, el primero de los cuales deberá tener las coordenadas 100.0, 200.0 y el segundo deberá tener las coordenadas 400.0, 800.0 y calcule e imprima la distancia entre ambos.
- ## [Fecha](https://github.com/Phosphorus-M/Java/blob/master/src/Clases/fecha.java)
 Verifica si una fecha es valida o no.
 Se utilizara el objeto fecha, preguntara día, mes y año. Si las fechas no son validas los atributos seran null.
- ## [Examen](https://github.com/Phosphorus-M/Java/blob/master/src/Clases/Examen.java)
 Agrega una lista de examenes que se mostraran por pantalla, tiene dependencia de la class [Fecha](https://github.com/Phosphorus-M/Java/blob/master/src/Clases/fecha.java), ya que para [Examen.java](https://github.com/Phosphorus-M/Java/blob/master/src/Clases/Examen.java) se utilizara el objeto fecha como tipo de dato para un atributo, preguntara día, mes y año, y obligara al usuario ingresar un valor valido.
 El sistema de notas varia del 0 al 10.
 - ## [SumaArchivos](https://github.com/Phosphorus-M/Java/blob/master/src/Clases/SumaArchivos.java)
 Lee de un [Archivo](https://github.com/Phosphorus-M/Java/blob/master/Archivos/Para%20leer/Suma.txt), una linea(La primera) indica cuantas lineas se van a leer luego de la primera. Y suma todas las lineas indicadas.
- ## [ArchivoTunning](https://github.com/Phosphorus-M/Java/blob/master/src/Clases/ArchivoTunning.java)
 Lee de un [Archivo de texto](https://github.com/Phosphorus-M/Java/blob/master/Archivos/Para%20leer/Lista.txt) y muestra por pantalla todo lo que contiene.
- ## [Escribir](https://github.com/Phosphorus-M/Java/blob/master/src/Clases/Escribir.java)
 Escribe en un [Archivo de texto](https://github.com/Phosphorus-M/Java/blob/master/Archivos/Generados/Texto%20impreso%20-%20Escribir.java.txt) "Hola, buenos dias" y "Hoy llueve.".
- ## [Vehiculos](https://github.com/Phosphorus-M/Java/blob/master/src/Clases/Sumados.java)
 Pertenecientes a la actividad 1 del material de clase [5](https://docs.google.com/viewer?a=v&pid=sites&srcid=ZGVmYXVsdGRvbWFpbnx1bm9wcm9nY29ub2JqZXRvczF8Z3g6NDRiOWQ2ZjRiZTMyNGJkYg).

  Existen dos tipos de vehículos: las motocicletas, que llevan un chofer y un acompañante, y los autobuses, que llevan un chofer y varios pasajeros. Los vehículos deben conocer la cantidad de kilómetros recorridos, asignar y cambiar chofer. Cada vehículo particular deberá poder agregar un acompañante o diversos pasajeros, respectivamente. En caso del Autobús, no puede cambiar de chofer si hubiera pasajeros. En el caso de la Motocicleta, no puede hacerlo si hubiera un acompañante.

  Esta actividad tiene dependencia de las class [Vehiculo](https://github.com/Phosphorus-M/Java/blob/master/src/Clases/Vehiculo.java), [Persona.java](https://github.com/Phosphorus-M/Java/blob/master/src/Clases/Persona.java), [Autobus](https://github.com/Phosphorus-M/Java/blob/master/src/Clases/Autobus.java), [Motocicleta.java](https://github.com/Phosphorus-M/Java/blob/master/src/Clases/Motocicleta.java).

  Persona crea el objeto persona y le establece un nombre y lo devuelve con un metodo.

  Vehiculo establece el kilometraje y el chofer. Puede devolver el nombre del chofer y el kilometraje con metodos. También puede cambiar el chofer.

  Autobus establece el atributo pasajeros, la cantidad maxima de pasajeros por autobus, la cantidad actual de pasajeros y tiene herencia de [Vehiculo](https://github.com/Phosphorus-M/Java/blob/master/src/Clases/Vehiculo.java), estos atributos se modifican con metodos en el mismo Autobus y como herencia de [Vehiculo](https://github.com/Phosphorus-M/Java/blob/master/src/Clases/Vehiculo.java).

  Motocicleta crea el atributo acompañante y tiene herencia de [Vehiculo](https://github.com/Phosphorus-M/Java/blob/master/src/Clases/Vehiculo.java), tiene metodos para modificar este atributo en el mismo archivo y como herencia de [Vehiculo](https://github.com/Phosphorus-M/Java/blob/master/src/Clases/Vehiculo.java).

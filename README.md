# Programación Orientada a Objetos
Material de realizado durante las clases de Programación Orientada a Objetos I de la [Universidad Nacional del Oeste](http://uno.edu.ar/), Buenos Aires, Argentina

## Docentes:
POO1:
  Ing. [Leonardo Blautzik](https://github.com/leoblautzik)

  Prof. Mag. Ing. [Pablo Pandolfo](https://github.com/ppandomail)

  Esp. [Gustavo Dejean](https://www.linkedin.com/in/dejean2010/)

  Ayudante de cátedra [Lucas Carnero](https://github.com/lcarnero)

POO2
  Lic. [Jorge Fossati](jorgefossati@yahoo.com) // Cursada POO 2 2018
  Ing. [José Luis Cabrera](jcabrera0000@gmail.com)
  Ing. [Leonardo Blautzik](https://github.com/leoblautzik)

## Alumnos contribuyentes al repositorio:
[Fernando Pastorelli / Phosphorus Moscu](https://github.com/Phosphorus-M)
Fabian Zacarola
[Nicolás Failla/Krasnyco](https://github.com/krasnyco)

## [Códigos realizados](https://github.com/Phosphorus-M/Java/tree/master/src):
- ## [Hola Mundo](src/objetos2017/SC/clases/HolaMundo.java)
Clásico mensaje de "Hola Mundo"
- ## [Numero Complejo](src/objetos2017/SC/clases/Complejo.java)
Primer vistazo al paradigma de objetos.
- ## [FizzBuzz](src/objetos2017/SC/clases/FizzBuzz.java)
Pertenecientes a la actividad del material de clase [2](https://docs.google.com/viewer?a=v&pid=sites&srcid=ZGVmYXVsdGRvbWFpbnx1bm9wcm9nY29ub2JqZXRvczF8Z3g6Njk0MmE2ZDZjZjQwYTk3Mg) y [3](https://docs.google.com/viewer?a=v&pid=sites&srcid=ZGVmYXVsdGRvbWFpbnx1bm9wcm9nY29ub2JqZXRvczF8Z3g6NTA3ZjFlMDlhNWVhNWIxYQ).
  Imprime por pantalla los números del 1 al 100 pero considerando lo siguiente:

    Si el número es divisible por 3 se debe imprimir “Fizz”.
    Si el número es divisible por 5 se debe imprimir “Buzz”.
    Si el número es divisible por 3 y por 5 se debe imprimir “FizzBuzz”.

- ## [Sumados](src/objetos2017/SC/clases/Sumados.java)
Pertenecientes a la actividad del material de clase [2](https://docs.google.com/viewer?a=v&pid=sites&srcid=ZGVmYXVsdGRvbWFpbnx1bm9wcm9nY29ub2JqZXRvczF8Z3g6Njk0MmE2ZDZjZjQwYTk3Mg) y [3](https://docs.google.com/viewer?a=v&pid=sites&srcid=ZGVmYXVsdGRvbWFpbnx1bm9wcm9nY29ub2JqZXRvczF8Z3g6NTA3ZjFlMDlhNWVhNWIxYQ)
  Suma los 1000 primeros números naturales (1+2+3+4+...+1000), imprimiendo por cada suma el resultado parcial obtenido.
- ## [Punto](src/objetos2017/SC/clases/Punto.java)
 Pertenecientes a la actividad del material de clase [4](https://docs.google.com/viewer?a=v&pid=sites&srcid=ZGVmYXVsdGRvbWFpbnx1bm9wcm9nY29ub2JqZXRvczF8Z3g6NGZhYWNhMjI1OTFhZTNkZA).

Define una clase punto que tendrá dos atributos, de tipo real, x e y, que representarán las coordenadas del punto dentro del plano. Define un método que tenga como argumento otro objeto de la clase punto y que calcule la distancia entre los dos puntos. Para probar esta funcionalidad, escribí un método main en el que se creen dos puntos, el primero de los cuales deberá tener las coordenadas 100.0, 200.0 y el segundo deberá tener las coordenadas 400.0, 800.0 y calcule e imprima la distancia entre ambos.
- ## [Fecha](src/objetos2017/SC/clases/fecha.java)
 Verifica si una fecha es valida o no.
 Se utilizara el objeto fecha, preguntara día, mes y año. Si las fechas no son validas los atributos serán null.
- ## [Examen](src/objetos2017/SC/clases/Examen.java)
 Agrega una lista de exámenes que se mostraran por pantalla, tiene dependencia de la class [Fecha](src/objetos2017/SC/clases/fecha.java), ya que para [Examen.java](src/objetos2017/SC/clases/Examen.java) se utilizara el objeto fecha como tipo de dato para un atributo, preguntara día, mes y año, y obligara al usuario ingresar un valor valido.
 El sistema de notas varia del 0 al 10.
 - ## [SumaArchivos](src/objetos2017/SC/clases/SumaArchivos.java)
 Lee de un [Archivo](src/objetos2017/SC/clases/Archivos/Para%20leer/Suma.txt), una linea(La primera) indica cuantas lineas se van a leer luego de la primera. Y suma todas las lineas indicadas.
- ## [ArchivoTunning](src/objetos2017/SC/clases/ArchivoTunning.java)
 Lee de un [Archivo de texto](src/objetos2017/SC/clases/Archivos/Para%20leer/Lista.txt) y muestra por pantalla todo lo que contiene.
- ## [Escribir](src/objetos2017/SC/clases/Escribir.java)
 Escribe en un [Archivo de texto](src/objetos2017/SC/clases/Archivos/Generados/Texto%20impreso%20-%20Escribir.java.txt) "Hola, buenos dias" y "Hoy llueve.".
- ## [Vehiculos](src/objetos2017/SC/clases/Vehiculo.java)
 Pertenecientes a la actividad 1 del material de clase [5](https://docs.google.com/viewer?a=v&pid=sites&srcid=ZGVmYXVsdGRvbWFpbnx1bm9wcm9nY29ub2JqZXRvczF8Z3g6NDRiOWQ2ZjRiZTMyNGJkYg).

  Existen dos tipos de vehículos: las motocicletas, que llevan un chofer y un acompañante, y los autobuses, que llevan un chofer y varios pasajeros. Los vehículos deben conocer la cantidad de kilómetros recorridos, asignar y cambiar chofer. Cada vehículo particular deberá poder agregar un acompañante o diversos pasajeros, respectivamente. En caso del Autobús, no puede cambiar de chofer si hubiera pasajeros. En el caso de la Motocicleta, no puede hacerlo si hubiera un acompañante.

  Esta actividad tiene dependencia de las class [Vehiculo](src/objetos2017/SC/clases/Vehiculo.java), [Persona.java](src/objetos2017/SC/clases/Persona.java), [Autobus](src/objetos2017/SC/clases/Autobus.java), [Motocicleta](src/objetos2017/SC/clases/Motocicleta.java).

  Persona crea el objeto persona y le establece un nombre y lo devuelve con un metodo.

  [Vehiculo](src/objetos2017/SC/clases/Vehiculo.java) establece el kilometraje y el chofer. Puede devolver el nombre del chofer y el kilometraje con metodos. También puede cambiar el chofer.

  [Autobus](src/objetos2017/SC/clases/Autobus.java) establece el atributo pasajeros, la cantidad maxima de pasajeros por autobus, la cantidad actual de pasajeros y tiene herencia de [Vehiculo](src/objetos2017/SC/clases/Vehiculo.java), estos atributos se modifican con metodos en el mismo [Autobus](src/objetos2017/SC/clases/Autobus.java) y como herencia de [Vehiculo](src/objetos2017/SC/clases/Vehiculo.java).

  [Motocicleta](src/objetos2017/SC/clases/Motocicleta.java) crea el atributo acompañante y tiene herencia de [Vehiculo](src/objetos2017/SC/clases/Vehiculo.java), tiene metodos para modificar este atributo en el mismo archivo y como herencia de [Vehiculo](src/objetos2017/SC/clases/Vehiculo.java).

- ## [Empresa](src/objetos2017/SC/clase_6_herencias/ejercicio_2/empresa.java)
 Pertenecientes a la actividad 2 del material de clase [5](https://docs.google.com/viewer?a=v&pid=sites&srcid=ZGVmYXVsdGRvbWFpbnx1bm9wcm9nY29ub2JqZXRvczF8Z3g6NDRiOWQ2ZjRiZTMyNGJkYg).

 Modele una Empresa con [empleados](src/objetos2017/SC/clase_6_herencias/ejercicio_2/empleados.java). Una empresa conoce a todos sus empleados. Los [empleados](src/objetos2017/SC/clase_6_herencias/ejercicio_2/empleados.java) pueden ser de planta permanente o temporaria, además hay gerentes, que también son [empleados](src/objetos2017/SC/clase_6_herencias/ejercicio_2/empleados.java) de planta permanente, pero siguen un régimen salarial particular. Cuando un [empleado](src/objetos2017/SC/clase_6_herencias/ejercicio_2/empleados.java) es de planta permanente cobra la cantidad de horas trabajadas por $300, más antigüedad ($100 por año de antigüedad), más salario familiar.

 Cuando es de planta temporaria, no cobra antigüedad y cobra la cantidad de horas trabajadas por $200, más salario familiar. El salario familiar es $200 por cada hijo, los [empleados](src/objetos2017/SC/clase_6_herencias/ejercicio_2/empleados.java) casados además cobran $100 por su esposa/o. Un gerente cobra de manera similar a un [empleado](src/objetos2017/SC/clase_6_herencias/ejercicio_2/empleados.java) de planta permanente pero su hora trabajada vale $400, por antigüedad se le pagan $150 por año, mientras que el salario familiar es el mismo que el de los empleados de planta permanente y temporal.

 Defina e implemente el mensaje montoTotal() en la clase Empresa, que retorna el monto total que la empresa debe pagar en concepto de sueldos a sus empleados. Provea una clase [TestEmpresa](src/objetos2017/SC/clase_6_herencias/ejercicio_2/TestEmpresa.java) para instanciar y testear su sistema. En el método main de esa clase cree el siguiente escenario y envíe a la empresa el mensaje montoTotal() para obtener la liquidación total.

 El contenido de la clase TestEmpresa:

    Una empresa, con el CUIT y Razón Social que desee, y con los cuatro empleados que se describen a continuación.
        Un empleado de Planta Temporaria con 80 horas trabajadas, con esposa y sin hijos.
        Un empleado de Planta Permanente (que no sea gerente) con 80 horas trabajadas, con esposa, 2 hijos y 6 años de antigüedad.
        Un empleado de Planta Permanente (que no sea gerente) con 160 horas trabajadas, sin esposa, sin hijos y con 4 años de antigüedad.
        Un Gerente con 160 horas trabajadas, con esposa, un hijo y 10 años de antigüedad.

Esta actividad tiene dependencia de las class, [Empresa](src/objetos2017/SC/clase_6_herencias/ejercicio_2/empresa.java), [TestEmpresa](src/objetos2017/SC/clase_6_herencias/ejercicio_2/TestEmpresa.java), [empleados.java](src/objetos2017/SC/clase_6_herencias/ejercicio_2/empleados.java).

- ## [VideoClub](src/objetos2017/SC/clase%20del%20Videoclub)
 Pertenecientes a la actividad 2 del material de clase [7](https://docs.google.com/viewer?a=v&pid=sites&srcid=ZGVmYXVsdGRvbWFpbnx1bm9wcm9nY29ub2JqZXRvczF8Z3g6Yjk5MzI5MDM1ZTcyZTI5).


 Un [Video Club](src/objetos2017/SC/clase%20del%20Videoclub) pone a disposición de sus socios series, películas y videojuegos.
   Crear una clase llamada [Pelicula](src/objetos2017/SC/clase%20del%20Videoclub/Pelicula.java) con las siguientes caracteristicas:
  - Sus atributos son titulo, año, entregado, genero y director.
  - Por defecto, el genero es "No definidio" y entregado false. El resto de los atributos serán valores por defecto según el tipo del atributo.
  - Los constructores que se implementaran serán:
      - Un constructor por defecto.
      - Un constructor con el titulo y director. El resto por defecto.
      - Un constructor con todos los atributos, excepto de entregado.
  - Los metodos que se implementara serán:
      - Metodos get de todos los atributos, excepto de entregado.
      - Métodos set de todos los atributos, excepto de entregado.
      - Sobrescribe los metodos toString.

  Crear una clase llamada [Serie](src/objetos2017/SC/clase%20del%20Videoclub/Serie.java) con  las siguientes caracteristicas:
    - Sus atributos son titulo, numero de temporadas, entregado, genero y creador.
    - Por defecto, el numero de temporadas es de 3 temporadas y entregado false. El resto de atributos serán valores por defecto según el tipo del atributo.
    - Los constructores que se implementaran seran:
      - Un constructor por defecto.
      - Un constructor con el titulo y creador. El resto por defecto.
      - Un constructor con todos los atributos, excepto de entregado.
    - Los metodos que se implementaran serán:
      - Metodos get de todos los atributos, excepto de entregado.
      - Metodos set de todos los atributos, excepto entregado.
      - Sobrescribe los metodos toString.

    Crear una clase [Videojuego](src/objetos2017/SC/clase%20del%20Videoclub/Videojuego.java) con las siguientes caracteristicas:
      - Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
      - Por defecto, las horas estimadas serán de 10 horas y entregado false. El resto de atributos serán valores por defecto según el tipo del atributo.
      - Los constructores que se implementaran serán:
        - Un constructor por defecto.
        - Un constructor con el titulo y horas estimadas. El resto por defecto.
        - Un constructor con todos los atributos, excepto de entregado.
      - Los metodos que se implementaran serán:
        - Metodos get de todos los atributos, excepto de entregado.
        - Metodos set de todos los atributos, excepto de entregado.
        - Sobrescribe los metodos toString.

    Crear una interface llamada [Entregable](src/objetos2017/SC/clase%20del%20Videoclub/Entregable.java) con los siguientes metodos:
      - entregar(): cambia el atributo prestado a true.
      - devolver(): cambia el atributo prestado a false.
      - isEntregado(): devuelve el estado del atributo prestado.
      - Metodo compareTo(Object a), commpara las horas estunadas eb kis vudeihyegis y en las series el numero  de temporadas. Y en las Peliculas el año.

    Crear una [aplicación ejecutable](src/objetos2017/SC/clase%20del%20Videoclub/Test.java) que haga lo siguiente:
      - Crea tres arrays, uno de Peliculas, otro de Series y otro de Videojuego.
      - Crea un objeto en cada posición del array, con los valores que desees, puede usar distintos constructores.
      - Entrega algunos Videojuegos y Peliculas y Series con el metodo entregar().
      - Cuenta cuantas Peliculas, Series y Videojuegos hay entregados. Al contarlos, devuelvelos.
      - Por ultimo, indica que Videojuego tiene más horas estimadas, la serie con más temporadas y la Pelicula más antigua. Muestralos en pantalla con toda su información (usa el metodo toString()).


Esta actividad tiene dependencia de las class, [Pelicula](src/objetos2017/SC/clase%20del%20Videoclub/Pelicula.java),  [Serie](src/objetos2017/SC/clase%20del%20Videoclub/Serie.java), [Videojuego](src/objetos2017/SC/clase%20del%20Videoclub/Videojuego.java), [Entregable](src/objetos2017/SC/clase%20del%20Videoclub/Entregable.java), [Test](src/objetos2017/SC/clase%20del%20Videoclub/Test.java).

# Final 2017
## [Final 2017 Segundo llamado](src/objetos2017/Final/2017%20Diciembre%20Segundo%20llamado/)
  - Juan es un amante de las matematicas, esta enamorado de los [Naturales](src/objetos2017/Final/2017%20Diciembre%20Segundo%20llamado/Natural.java), pero no de todos por igual. Le gustan más los pares que los impares, y dentro de cada subconjunto (pares o impares), prefiere los más chicos.
  - Implementar un metodo estatico getNaturales que reciba como parametro el nombre de [un archivo](src/objetos2017/Final/2017%20Diciembre%20Segundo%20llamado/naturales.in) que contiene numeros naturaes de a uno por linea, y devuelva una LinkedList<[Natural](src/objetos2017/Final/2017%20Diciembre%20Segundo%20llamado/Natural.java)> conteniendo los naturales leidos del archivo.
  - Implementar un metodo estatico listaOdenadoXJuan que reciba como parametro la lista recién obtenida y el nombre del archivo de la salida donde se listaran los naturaes, ordenados según las preferencias de Juan.
  - Nota: Se espera un adecuado tratamiento de excepciones.

# [Programación Orientada a Objetos 2018](src/objetos2018)
# [Primer cuatrimestre](src/objetos2018/PC)
# [Programación Orientada a Objetos I](src/objetos2018/PC/POO1)
# [Clases](src/objetos2018/PC/POO1/clases)
## [CUIL](src/objetos2018/PC/POO1/clases/CUIL.java)
  Actividad del generador de CUILs hablada en las clases del profesor [Gustavo Dejean](https://www.linkedin.com/in/dejean2010/).
  La clase CUIL recibe en su constructor como parametros un DNI y el genero.
## [Camino](src/objetos2018/PC/POO1/clases/CUIL.java)
    ### Falta hacer
## [Parcial Nº2](src/objetos2018/PC/POO1/Parcial%20Nº2)
  [Segunda parte del parcial](src/objetos2018/PC/POO1/Parcial%20Nº2/Segundo%20Examen%20Parcial.pdf) de POO1 Turno Tarde a cargo del ayudante de cátedra [Lucas Carnero](lcarnero@uno.edu.ar).
  [Carpeta con las clases](src/objetos2018/PC/POO1/Parcial%20Nº2/)
# [Programación Orientada a Objetos II](src/objetos2018/PC/POO2)
## [Trabajo Practico Nº1](src/objetos2018/PC/POO2/TPNº1)
  Trabajo realizado con [Nicolás Failla/Krasnyco](https://github.com/krasnyco) para los docentes de turno noche [Jorge Fossati](jorgefossati@yahoo.com) y [José Luis Cabrera](jcabrera0000@gmail.com).
  El trabajo consiste en:

  Prueba de Software:  Los alumnos recibirán el enunciado del problema "[Búsqueda Numérica](src/objetos2018/PC/POO2/TPNº1/BusquedaNumerica.pdf)"  y [distintos programas ejecutables](src/objetos2018/PC/POO2/TPNº1/Ejecutables) que, supuestamente, resuelven el problema.
  Los grupos de trabajo deben diseñar e implementar distintos casos de prueba que permitan testear en profundidad el funcionamiento del software entregado. Estos deberán ser lo suficientemente ingeniosos y atómicos para poder decir de la manera mas certera posible, el o los errores cometidos en la implementación de cada ejecutable.

  Deberán también completar y entregar un [informe detallado](src/objetos2018/PC/POO2/TPNº1/Analisis) de los resultados obtenidos, indicando los errores observados.

Esta actividad tiene dependencia de las class, [Probador](src/objetos2018/PC/POO2/TPNº1/src/tp1/Probador.java) y [TP1](src/objetos2018/PC/POO2/TPNº1/src/tp1/TP1.java).

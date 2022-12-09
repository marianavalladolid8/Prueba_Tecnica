# Prueba_Tecnica
Prueba Tecnica para Generation
Prueba técnica JAVA 
El propósito de esta prueba es validar los conocimientos que las instructoras y los instructores tienen con respecto a la programación JAVA. 
Criterios de evaluación 
 Código limpio. 
 Automatización de pruebas unitarias. 
 Arquitectura limpia. 
Entregables 
 Código fuente en el repositorio de Git, GitHub, GitLab o cualquier otra que nos permita compartir el proyecto. 
 Tendrá 2 días para completar esta solicitud desde el momento en que reciba este documento.  Para cualquier duda, estaremos a su disposición. 
Estructura de la aplicación 
*Antes de presentar la estructura de esta aplicación, es importante decir que está permitido realizar investigaciones para cumplir con los requisitos de estos proyectos.

Proyecto 1 
1. Implementar una clase llamada “Propietario”. 
2. Declarar los siguientes atributos de la clase: 
a. Nombre 
b. RFC (Registro Federal de Contribuyentes) 
c. CURP (Clave Única de Registro de Población) 
d. Fecha de Nacimiento 
e. Calle 
f. Colonia 
g. Ciudad 
h. Código Postal 
3. Encapsular los atributos de la clase llamada “Propietario”. 
4. Los atributos “Nombre”, “RFC”, y “CURP” son obligatorios (crear un constructor con estos parámetros. Puedes jugar con la siguiente sintaxis ABCD123456XXX). 
5. Implementar una clase llamada “Automóvil”. 
6. Declarar los siguientes atributos en la clase: 
a. Modelo 
b. Color 
c. Año 
d. Marca 
e. Chasís (4, 6 o 10 llantas). 
f. Propietario 
g. Velocidad máxima 
h. Velocidad actual 
i. Número de puertas 
j. ¿Tiene techo solar? 
k. Número de marchas 
l. ¿Tiene transmisión automática? 
7. Encapsular la clase llamada “Automóvil”, así como sus atributos. 
8. Implementar un método para la aceleración que aumente la velocidad del automóvil (de 1 en 1 km/h). 
9. Implementar un método para el frenado del automóvil (velocidad = 0 km/h).

10. Implementar un método que permita cambiar de marchas. 
11. Implementar un método que permita reducir las marchas. 
12. No se puede engranar la marcha atrás si la velocidad supera los 0 km/h. 
13. Cambiar la clase llamada “Propietario” para que los atributos referentes a la dirección formen parte de una nueva clase llamada “Dirección”. 
14. Encapsular la clase llamada “Dirección”, así como sus atributos. 
15. La dirección del propietario no puede estar vacía (cámbiela en el constructor para recibir la dirección). 
16. Todo automóvil debe tener un dueño (implementar un constructor para “Automóvil” que pase al “Propietario” como parámetro). 
17. Implementar un método que calcule la autonomía del viaje del automóvil, con base en un consumo medio que sea pasado como parámetro. 
18. Implementar un método para mostrar el volumen de combustible, dicho valor debe ser pasado como parámetro. 
19. Transformar el atributo “marca” de un automóvil a una clase llamada “Marca” con nombre, número de modelo, año de lanzamiento y código identificador. 
20. Instanciar un objeto de la clase “Automóvil”, “Propietario” y “Marca”, y relacionar los objetos usando métodos o constructores cuando sea necesario. 
Proyecto 2 
1. Crear una clase llamada “Factura” para una tienda de suministros informáticos. La clase debe contener cuatro variables: 
a. Número (String) 
b. Descripción (String) 
c. Cantidad comprada de un artículo (int) 
d. Precio por artículo (double) 
2. La clase debe tener un constructor y métodos get y set para cada variable de instancia.

3. Proporcionar un método llamado “getTotalFactura” que calcule el monto de la factura y luego devuelva el monto como un double. Si el valor es positivo, debe ser establecido en 0. Si el precio por artículo no es positivo, debe establecerse en 0.0. 
4. Escribir una función llamada “FacturaTest” (en otro archivo) que demuestre las capacidades de la clase “Factura”. 
Proyecto 3 
1. Crear una clase llamada “Empleado” que incluya tres variables de instancia: 
a. Nombre (String) 
b. Apellido (String) 
c. Salario mensual (double) 
2. La clase debe tener un constructor y métodos get y set para cada variable de instancia. 
3. Escribir una clase de prueba llamada “EmpleadoTest” que instancie dos objetos de la clase “Empleado” y muestre el salario de cada objeto. Luego dé a cada empleado un aumento del 10% y vuelva a mostrar el salario anual de cada empleado. 
4. Introducir una variable de clase capaz de contar el número de empleados que han pasado por la empresa hasta la fecha. 
Proyecto 4 
1. Crear una clase llamada “IntegerSet”. Cada objeto de esta clase puede almacenar números enteros en el rango de 0 a 100. El conjunto está representado por una matriz de valores booleanos. El elemento de matriz a [i] es verdadero si el entero i está en el conjunto. El elemento de matriz a[i] es falso si el entero no está en el conjunto. El constructor sin argumentos inicializa la matriz de JAVA en un “conjunto vacío” (todos los valores son falsos). 
2. Implementar un método de unión, que crea un tercer conjunto que es la unión de dos conjuntos existentes (es decir, aplica la función lógica OR en los conjuntos y devuelve el valor lógico verdadero o falso).

3. Implementar un método de intersección, que crea un tercer conjunto que es la intersección teórica de dos conjuntos existentes (es decir, aplica la función lógica AND en los conjuntos y devuelve el valor lógico verdadero o falso). 
4. Implementar un método llamado “insertElement” que inserta un nuevo elemento entero k en un conjunto. 
5. Implementar un método llamado “deleteElement” que elimina un elemento del conjunto. 6. Implementar un método llamado “toSetString” que devuelve el conjunto como una lista de números, separados por espacios. Incluye sólo los elementos que están presentes en el conjunto. Usar “- “ para representar que un conjunto está vacío. 
7. Implementar un método llamado “equalTo” para determinar si dos conjuntos son iguales. Consideraciones finales 
Recuerda que se permite la investigación para llevar a cabo cualquier requerimiento de estos proyectos, queremos que te sientas libre de crear esta aplicación de la mejor manera posible. Aunque no puedas hacer todo el proyecto, envíanos los avances implementados en la cita agendada. 

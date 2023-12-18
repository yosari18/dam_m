<center><h1>Herramientas de automatización</h1></center>

### To-do 1:
<p>Pruebe a lanzar los comandos anteriores sobre el archivo hola.c .</p>

![Alt text](to-do1_1.png)

<p>Compruebe el resultado ejecutando los archivos compilados
</p>

![Alt text](to-do1_0.png)

### To-do 2:
<p>Crea y compila el primer programa de la calculadora para verificar que funciona (calc.c, calc.h y calcula.c).
</p>

![!\[Alt text\](to-do2_0.png)](image.png)
![Alt text](to-do2_0_1.png)
<p>Añade una nueva función que sea “mayor”, que devolverá el número mayor
</p>
<p><b>calc.h</b></p>

![Alt text](to-do2_1.png)
<p><b>calc.c</b></p>

![Alt text](to-do_2_2.png)

<p><b>calcula.c</b></p>

![Alt text](to-do2_3.png)
<p>Compile el programa con la nueva función “mayor” y verifica que todo funciona correctamente.
</p>

![Alt text](<image (1).png>)

### To-do 3:

<p>Cree el archivo Makefile e intente construir los diferentes objetivos, probando el resultado de make , make calcula y make calc.o . Borra todos los archivos objeto y ejecutables entre cada prueba.

![Alt text](to-do3_0.png)


</p>

<p>Prueba a invertir el orden de las reglas en el Makefile , primero la regla de calc.o y después calcula . Ejecuta el make con este Makefile y explica los resultados.

![Alt text](to-do3_1.png)

- En la regla 1: "calcula " es la primera en el Makefile. Al ejecutar "make" construye "calcula"
- En la regla 2: "calc.o" es laprimera en el Makefile. Al ejecutar "make" construye calc.o si es necesario, luego se construirá "calcula" utilizando "calc.o" 

</p>

<p>Restaurar el archivo Makefile con el mandato anterior.
</p>

### To-do 4:

<p>Implementa las funciones “install” y “targz”, verifica que funciona
</p>

<p>Diseña una nueva funcionalidad, “Readme”, donde se crea un archivo readme en formato markdown

- Comando:  echo “# Readme\n *** Important\n It’s a Readme”> Readme.txt

</p>
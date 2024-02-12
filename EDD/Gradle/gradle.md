<center><img src="GRADLE.png" alt="![alt text](GRADLE.png)"></center>




* Realiza las acciones de gradle run y clean en helloGradle.
    
    - Sube el proyecto a la tarea.

:pencil2:Inicializamos el programa
    ![alt text](Hinit.png)
    
   :pencil2: Miramos donde se encuentra ubicado.
    ![alt text](Htree.png)

   :pencil2:    Ejecutamos el programa para ver los datos de salida.
    ![alt text](hellograRun.png)    
    ![alt text](hellograClean.png)

* Cread un proyecto con Gradle para vuestro código de la calculadora. A esta calculadora debéis añadirle ahora dos métodos adicionales:

   - public Boolean isPrime(float op1){...} 
   esta función nos devolverá un valor lógico, indicando si el número es primo o no (primo=divisible solo por él mismo y por 1).
![alt text](isPrime.png)

   - public Integer nextPrime(float op1){...}
    este método nos devolverá el siguiente número primo al que le indiquemos (si indicamos un número primo, nos devolverá el mismo).


![alt text](nexPrime.png)

![alt text](initCalcu.png)

 :pencil2:Miramos donde se encuentra ubicado

![alt text](treeCalcu.png)

:pencil2: Pasamos los valores por el archivo build.gradle.

![alt text](buildRunCalcu.png)

:pencil2:Importamos la libreria Math para llamar en el programa princial.

![alt text](mathCalcu.png)
![alt text](imporCalcu.png)

:pencil2:Pasamos los valores para poder ejecutar el programa. En este caso, son 4 y 3.

![alt text](resulCalcu.png)
![alt text](terminalCalcula.png)

![alt text](cleanCalcu.png)
# serenity-bdd-web-selenium

### Objetivo del Repositorio
El objetivo principal de este repositorio es proporcionar una base
sólida para aprender y practicar la automatización de pruebas. 
Me enfocaré en ejemplos prácticos y casos de estudio reales para demostrar 
cómo se pueden diseñar, implementar y ejecutar pruebas automatizadas de manera eficiente.

### Análisis del Login de Swag Labs
Como primer paso en este proyecto, realicé un análisis detallado del proceso de login de Swag Labs.
Este análisis me permitió identificar los puntos críticos y diseñar una serie de pruebas automatizadas
para asegurar la funcionalidad y seguridad del sistema de autenticación.

### Matriz de Casos de Prueba
Basado en el análisis del login, diseñé una matriz de casos de prueba que cubre diversos escenarios,
incluyendo casos positivos y negativos. 
Puedes encontrar la matriz de casos de prueba en el siguiente enlace:

[Casos de prueba_Swag Labs](https://docs.google.com/spreadsheets/d/1KrlrD2UEOHPPgusZ-elelKcQiOm6ZGPH/edit?usp=drive_link&ouid=112052354328608051614&rtpof=true&sd=true)


## Herramientas utilizadas

En este repositorio se exploran diversas herramientas de automatización de pruebas, tales como:

- Serenity BDD:
- Selenium: Para la automatización de pruebas de aplicaciones web.
- JUnit: Frameworks para la automatización de pruebas unitarias en Java.
- IntelliJ IDEA CE:

### Cómo Empezar

Para comenzar, simplemente clona este repositorio y sigue las instrucciones proporcionadas en cada directorio de proyecto.

[```sobarzolicandeo/serenity-bdd-web-selenium```](https://github.com/sobarzolicandeo/serenity-bdd-web-selenium)

### Pre-requisites

[```Java```](https://www.java.com/es/)serenity BDD es una librería Java, por lo que necesitarás tener instalado un JDK reciente. [```JDK 11.0.23.```](https://www.oracle.com/java/technologies/javase/11-0-23-relnotes.html)

 [```IntelliJ IDE```](https://www.jetbrains.com/idea/)
de Java: También necesitarás un entorno de desarrollo Java como IntelliJ.

### Herramientas

[```Selenium```](https://selenium.dev) es un marco de pruebas automatizadas gratuito (de código abierto) que se utiliza para validar aplicaciones web en diferentes navegadores y plataformas. Puede utilizar
múltiples lenguajes de programación como Java, C#, Python etc. para crear Scripts de prueba Selenium.

[```Cucumber```](https://cucumber.io/) lee especificaciones ejecutables escritas en texto plano y valida que el software hace lo que dicen esas especificaciones.

[```serenity BDD```](https://serenity-bdd.info/) Es una biblioteca de informes de código abierto que le ayuda a escribir criterios de aceptación automatizados mejor estructurados y más fáciles de mantener.
estructurados y fáciles de mantener.

[```Jenkins```](https://www.jenkins.io/) Servidor de integración continua que se utilizará para la ejecución de pruebas automatizadas.

### La estructura de directorios del proyecto

La estructura de directorios estándar utilizada en la mayoría de los proyectos Serenity generalmente sigue un patrón que facilita la organización y la gestión del proyecto. A continuación, te proporciono un ejemplo de cómo podría ser esta estructura de directorios:

src
  + test
    + java
      + swaglabs
        + actions
           + InventorySteps
           + LoginSteps  
        + pageobjects
           + InventoryPage
           + LoginPage 
        + stepdefinitions
           + LoginStepDefs
        + utils
           + CucumberTestSuite                         
      + resources

### Contribuir
¡Las contribuciones son bienvenidas! Si tienes ejemplos adicionales, correcciones o mejoras, no dudes en hacer un fork del repositorio y enviar un pull request.

### Licencia
Este proyecto corresponde a un proyecto personal de aprendizaje. 


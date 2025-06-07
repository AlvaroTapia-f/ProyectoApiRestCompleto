En el repositorio se encuentran los archivos de una aplicación en JAVA implementando una APIREST.


Pasos para ejecutar el programa:
1. Descargar el proyecto.
2. Abrir la carpeta del proyecto con un IDE como Intellij IDEA.
3. Utilizar la base de datos h2 para realizar la persistencia.
4. Configurar el archivo application.properties en caso de querer utilizar otra base de datos, por defecto la base de datos es una base de datos en memoria RAM.



# Sistema de Gestión Bibliotecaria - API REST

## Descripción General
Esta aplicación es una API REST desarrollada en Java con Spring Boot que implementa un sistema de gestión bibliotecaria. El sistema permite administrar personas, libros, autores y localidades, implementando una arquitectura moderna y escalable.

## Características Técnicas

### Tecnologías Principales
- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database** (configurable para otras bases de datos)
- **Swagger/OpenAPI** para documentación
- **Gradle** como sistema de construcción

### Arquitectura
La aplicación implementa una arquitectura en capas:
1. **Capa de Controladores**: Maneja las peticiones HTTP
2. **Capa de Servicios**: Implementa la lógica de negocio
3. **Capa de Repositorios**: Gestiona el acceso a datos

### Estructura del Proyecto
La aplicación está programada en Java spring boot, y utiliza la arquitectura en capas de
controladores, servicios y repositorios. También se utilizan varios conceptos de la POO
(herencia, interfaces, clases genéricas, DTO).


### Entidades Principales
- **Persona**: Entidad central que representa a los usuarios
- **Libro**: Representa los libros disponibles
- **Autor**: Gestiona la información de los autores
- **Localidad**: Maneja las ubicaciones
- **Domicilio**: Información de direcciones

## Funcionalidades

### Gestión de Personas
- Registro de nuevos usuarios
- Consulta de información personal
- Actualización de datos
- Asociación con libros y domicilios

### Gestión de Libros
- Alta de nuevos libros
- Asociación con autores
- Consulta de disponibilidad
- Actualización de información

### Gestión de Autores
- Registro de autores
- Vinculación con libros
- Consulta de obras

### Gestión de Localidades
- Alta de nuevas localidades
- Consulta de información geográfica

## Endpoints Principales
- `/api/v1/personas`: Gestión de usuarios
- `/api/v1/libros`: Administración de libros
- `/api/v1/autores`: Manejo de autores
- `/api/v1/localidades`: Control de localidades

## Características Técnicas Destacadas
- **Diseño Genérico**: Implementación de clases base genéricas para reducir la duplicación de código
- **Patrón DTO**: Utilizado para la transferencia segura de datos
- **Auditoría**: Sistema de seguimiento de cambios en entidades
- **CORS**: Configurado para permitir acceso desde diferentes orígenes
- **Documentación API**: Integración con Swagger para documentación interactiva

## Configuración y Despliegue

### Requisitos Previos
- Java JDK 17 o superior
- Gradle 7.x o superior
- IDE compatible (recomendado: IntelliJ IDEA)

### Pasos de Instalación
1. Clonar el repositorio
2. Importar como proyecto Gradle
3. Configurar `application.properties` según necesidades
4. Ejecutar `gradle bootRun`

### Configuración de Base de Datos
Por defecto usa H2 (en memoria), pero es configurable para:
- PostgreSQL
- MySQL
- Oracle

### Acceso a la Documentación
- Swagger UI: `/swagger-ui.html`
- API Docs: `/v3/api-docs`

## Seguridad
- Implementación de CORS
- Validación de datos de entrada
- Manejo de excepciones personalizado

## Pruebas
- Incluye pruebas unitarias
- Pruebas de integración
- Cobertura de código

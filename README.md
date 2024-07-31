# Ejercicio de Acceso a Datos con JDBC

Este repositorio contiene un proyecto de ejemplo que demuestra el uso de JDBC para conectar y operar con bases de datos desde Java. JDBC es una API que permite la ejecución de operaciones sobre bases de datos de manera agnóstica al tipo de DBMS (Sistema de Gestión de Bases de Datos).

## 🚀 Descripción del proyecto

El proyecto es una aplicación Java que utiliza JDBC para realizar consultas, inserciones, actualizaciones y eliminaciones en una base de datos. Este ejemplo sirve para mostrar las prácticas básicas de interacción entre una aplicación Java y una base de datos mediante JDBC.

### 📄 Estructura del proyecto

El código fuente se encuentra organizado de la siguiente manera:
- **`src/main/java`**: Contiene los archivos Java.
- **`src/main/resources`**: Incluye archivos de configuración y scripts SQL.

### 🛠️ Configuración y ejecución

#### Requisitos previos

1. **Java JDK**: Asegúrate de tener Java JDK instalado en tu sistema.
2. **Maven**: Utilizado para la gestión de dependencias y la construcción del proyecto.
3. **Base de datos**: Este proyecto está configurado para usar MySQL, pero puedes modificar la configuración para cualquier otra base de datos compatible con JDBC.

#### Pasos para la configuración de la base de datos

- Asegúrate de tener una base de datos MySQL disponible.
- Ejecuta el script SQL incluido en `src/main/resources/db.sql` para crear las tablas necesarias.

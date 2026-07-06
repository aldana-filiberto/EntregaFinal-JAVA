# Backend/Java-Techlab-Entrega-Final
# 🍰 Ecommerce Pastelería

Aplicación web de ecommerce desarrollada como proyecto final, enfocada en la venta de productos de pastelería y panadería.

El proyecto está compuesto por dos aplicaciones independientes:

- **Frontend:** React + Vite
- **Backend:** Spring Boot + Spring Data JPA
- **Base de datos:** MySQL
- **Gestión de Base de Datos:** phpMyAdmin (XAMPP)

---

# 📸 Características

- Visualización de productos.
- Catálogo de pastelería y panadería.
- Búsqueda y filtrado de productos.
- Carrito de compras.
- Diseño responsive.
- API REST desarrollada con Spring Boot.
- Persistencia de datos mediante MySQL.
- Comunicación entre Frontend y Backend mediante HTTP.

---

# 🛠 Tecnologías utilizadas

## Frontend

- React
- Vite
- JavaScript
- HTML5
- CSS3

## Backend

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Maven

## Base de Datos

- MySQL
- phpMyAdmin
- XAMPP

---

# 🎨 Frontend

El frontend fue desarrollado utilizando **React** y **Vite**, implementando una interfaz moderna e intuitiva para la navegación del catálogo.

Entre las principales funcionalidades se encuentran:

- Listado de productos.
- Visualización de detalles.
- Búsqueda por nombre.
- Filtrado por categorías.
- Productos más vendidos.
- Carrito de compras.
- Componentes reutilizables.
- Organización modular del proyecto.
- Consumo de la API REST desarrollada en Spring Boot.

---

# ⚙️ Backend

El backend fue desarrollado utilizando **Spring Boot** siguiendo una arquitectura en capas.

```
Cliente
   │
   ▼
Controller
   │
   ▼
Service
   │
   ▼
Repository
   │
   ▼
MySQL
```

## Arquitectura

### Controller

Se encarga de recibir las peticiones HTTP provenientes del frontend y devolver respuestas en formato JSON.

### Service

Contiene la lógica de negocio de la aplicación.

### Repository

Gestiona el acceso a la base de datos utilizando Spring Data JPA.

### Entity

Representa la tabla **productos** de la base de datos.

---

# 📦 API REST

Actualmente la API implementa un CRUD completo de productos.

## Obtener todos los productos

```
GET /productos
```

---

## Obtener un producto por ID

```
GET /productos/{id}
```

---

## Crear un producto

```
POST /productos
```

---

## Actualizar un producto

```
PUT /productos/{id}
```

---

## Eliminar un producto

```
DELETE /productos/{id}
```

---

# 🗄 Base de datos

La aplicación utiliza **MySQL** como sistema gestor de base de datos.

La tabla principal es:

## productos

| Campo | Tipo |
|--------|------|
| id | BIGINT |
| nombre | VARCHAR |
| descripcion | VARCHAR |
| precio | DECIMAL |
| categoria | VARCHAR |
| imagen | VARCHAR |
| stock | INT |
| mas_vendido | BOOLEAN |

---

# Inicialización automática

Al iniciar la aplicación Spring Boot:

- crea nuevamente la estructura de la base de datos (`schema.sql`);
- carga automáticamente todos los productos iniciales (`data.sql`).

Esto permite comenzar siempre con una base de datos limpia durante el desarrollo.

---

# 📂 Backend

El backend utiliza la siguiente organización:

```
src/main/java
│
├── controller
│
├── model
│
├── repository
│
├── service
│
└── EcommerceApplication.java
```

---

# 🚀 Instalación

## 1) Clonar el repositorio

```bash
git clone https://github.com/USUARIO/REPOSITORIO.git
```

---

## 2) Abrir el proyecto

El proyecto contiene dos carpetas:

```
frontend
backend
```

---

# ⚠ Requisitos

Antes de ejecutar el proyecto es necesario tener instalado:

- Java 21
- Maven
- Node.js
- npm
- XAMPP
- MySQL
- Git

---

# ▶ Iniciar la Base de Datos

Abrir **XAMPP** e iniciar los siguientes servicios:

- ✅ Apache
- ✅ MySQL

Luego acceder a **phpMyAdmin** para verificar que la base de datos esté disponible.

---

# ▶ Ejecutar el Backend

Ingresar a la carpeta:

```bash
cd backend
```

Ejecutar:

```bash
mvn spring-boot:run
```

El backend quedará disponible en:

```
http://localhost:8080
```

---

# ▶ Ejecutar el Frontend

Ingresar a la carpeta:

```bash
cd frontend
```

Instalar dependencias (solo la primera vez):

```bash
npm install
```

Iniciar la aplicación:

```bash
npm run dev
```

El frontend quedará disponible normalmente en:

```
http://localhost:5173
```

Las credenciales de acceso segun el rol son:

```

    {
        "email": "admin@example.com",
        "password": "admin123",
        "role": "admin"
    },
    {
        "email": "client@example.com",
        "password": "cliente123",
        "role": "cliente"
    }
```


---

# 📌 Flujo de funcionamiento

```
React
   │
   ▼
API REST
(Spring Boot)
   │
   ▼
Service
   │
   ▼
Repository
   │
   ▼
Hibernate
   │
   ▼
MySQL
```

---

# 📚 Conceptos implementados

Durante el desarrollo del backend se trabajó con:

- Arquitectura en capas.
- API REST.
- CRUD completo.
- Spring Boot.
- Spring Data JPA.
- Hibernate.
- Inyección de dependencias.
- Anotaciones de Spring.
- Persistencia de datos.
- Comunicación HTTP.
- MySQL.
- Inicialización automática de la base de datos mediante `schema.sql` y `data.sql`.

---

# 📈 Mejoras futuras

- Autenticación con JWT.
- Registro e inicio de sesión.
- Gestión de usuarios.
- Panel de administración.
- Gestión de pedidos.
- Pasarela de pagos.
- Historial de compras.
- Validaciones de formularios.
- Paginación de productos.
- Subida de imágenes.
- Dockerización del proyecto.

---

# 👩‍💻 Autora

**Aldana Micaela Filiberto**

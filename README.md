# Evaluación Spring Boot - Farmacia

## Descripción

Proyecto de ejemplo para evaluar conceptos de Spring Boot con manejo de medicamentos y especialidades.

---

## Requisitos

- Java 23+  
- Maven  
- Base de datos MySQL (o la que uses)  
- Postman para probar APIs REST

---

## Configuración

1. Clonar el repositorio:

```bash
git clone https://github.com/tuusuario/tu-repo.git
cd tu-repo
Crear la base de datos y tablas (MySQL):

sql
Copiar
CREATE DATABASE farmacia;

USE farmacia;

CREATE TABLE especialidad (
  cod_espec INT PRIMARY KEY,
  descripcion VARCHAR(100) NOT NULL
);

CREATE TABLE medicamento (
  id INT PRIMARY KEY AUTO_INCREMENT,
  descripcion_med VARCHAR(255) NOT NULL,
  fecha_fabricacion DATE,
  fecha_vencimiento DATE,
  presentacion VARCHAR(100),
  stock INT,
  precio_venta_uni DECIMAL(10,2),
  precio_venta_pres DECIMAL(10,2),
  marca VARCHAR(100),
  cod_espec INT,
  FOREIGN KEY (cod_espec) REFERENCES especialidad(cod_espec)
);

La API estará disponible en: http://localhost:8080

Endpoints principales
Método	URL	Descripción	Cuerpo (JSON)
GET	/medicamentos	Lista todos los medicamentos	N/A
POST	/medicamentos	Inserta un nuevo medicamento	Ver ejemplo JSON más abajo
PUT	/medicamentos/{id}	Actualiza medicamento por ID	JSON completo del medicamento con el id correcto
DELETE	/medicamentos/{id}	Elimina medicamento por ID	N/A


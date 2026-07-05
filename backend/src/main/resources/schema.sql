DROP TABLE IF EXISTS productos;

CREATE TABLE productos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    descripcion VARCHAR(1000),
    precio DECIMAL(10,2),
    categoria VARCHAR(100),
    imagen VARCHAR(500),
    stock INT,
    mas_vendido BOOLEAN
);


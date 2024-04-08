
Historias de Usuario

Historia 1: Registro de Usuario

Como: usuario nuevo,  
Quiero: poder registrarme en la aplicación usando mi cuenta de Gmail,  
Para que: pueda realizar compras y recibir despachos a domicilio.

Criterios de Aceptación

1- La opción de registro debe ser visible en la pantalla principal de la aplicación.
2- Al seleccionar la opción de registro, el usuario debe ser dirigido a una página para iniciar sesión con su cuenta de Gmail.
3- Una vez autenticado, el usuario debe recibir una confirmación de registro exitoso.
4- Los datos del usuario (nombre, correo electrónico) deben ser almacenados de manera segura para futuras transacciones.

Historia 2: Realizar una Compra

Como: usuario registrado,  
Quiero: poder seleccionar productos y añadirlos a mi carrito de compras,  
Para que: pueda comprarlos y organizar su envío a mi domicilio.

Criterios de Aceptación

1- Los usuarios deben poder navegar por una lista de productos disponibles.
2- Los usuarios deben poder añadir productos a su carrito de compras y especificar la cantidad de cada uno.
3- El carrito de compras debe mostrar el total de la compra en tiempo real.
4- Debe existir una opción para proceder al checkout y confirmar la compra.

Historia 3: Cálculo de Costo de Envío

Como: usuario que ha realizado una compra,  
Quiero: que la aplicación calcule automáticamente el costo de envío basado en la distancia y el total de la compra,  
Para que: pueda saber cuánto necesito pagar por el envío antes de confirmar mi pedido.

Criterios de Aceptación

1- El cálculo del costo de envío debe ser automático al momento del checkout.
2- Para compras sobre 50 mil pesos y dentro de un radio de 20 km, el despacho debe ser gratuito.
3- Para compras entre 25,000 a 49,999 pesos, se debe cobrar una tarifa de 150 pesos por kilómetro.
4- Para compras menores a 25,000 pesos, se debe cobrar una tarifa de 300 pesos por kilómetro.
5- El usuario debe recibir una desglose detallado del costo de su compra, incluyendo el costo de envío.

Historia 4: Confirmación de Pedido

Como: usuario que ha completado una compra,  
Quiero: recibir una confirmación de mi pedido con detalles del mismo y la fecha estimada de entrega,  
Para que: pueda estar seguro de que mi pedido fue procesado correctamente y saber cuándo esperarlo.

Criterios de Aceptación

1- Después de confirmar la compra, el usuario debe recibir una confirmación por correo electrónico, incluyendo los detalles del pedido y la fecha estimada de entrega.
2- La aplicación debe mostrar una pantalla de confirmación de pedido con todos los detalles relevantes.
3- El usuario debe tener la opción de descargar o enviar por correo electrónico los detalles del pedido como un recibo.

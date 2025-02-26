#### Manuel David Robayo Vega
# PARCIAL PRIMER CORTE
## 1. Creación del repositorio
Usando spring e implementando maven, construimos el repositorio y lo vinculamos a la cuenta de GitHub.
![image](/images/img1.png)
![image](/images/img2.png)

## 2. Selección de patrón
Para cumplir con las funcionalidades requeridas, se implementó el patrón de diseño observador,
ya que es muy útil en este caso debido a que los agentes están esperando modificaciones todo el
tiempo para poder enviar la notificación de existencias.
En este caso, se define el sujeto ProductServices que será el encargado de notificar a los 
observadores, en este caso agentes(Log y Advertencia) si hay un cambio en la cantidad de productos.



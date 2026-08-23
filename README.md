# Perfil de Personaje en un Videojuego

## Descripción

Programa desarrollado en Java que simula las características y evolución de un personaje de videojuego. Permite controlar su salud, nivel, ataque, defensa y experiencia, además de simular situaciones de combate y progreso.

## Funcionamiento

El programa utiliza una clase `Personaje` con seis atributos:

* `nombre`: identifica al personaje.
* `nivel`: indica el nivel actual.
* `salud`: representa los puntos de vida.
* `ataque`: representa el poder de ataque.
* `defensa`: representa la capacidad defensiva.
* `experiencia`: almacena la experiencia obtenida.

La clase utiliza un **constructor** para establecer los valores iniciales del personaje. El nivel comienza en `1` y la experiencia en `0`.

Cuenta con cuatro métodos principales:

* `recibirDano()`: reduce la salud según la cantidad de daño recibida y evita que sea menor que `0`.
* `recuperarSalud()`: aumenta la cantidad de salud del personaje.
* `ganarExperiencia()`: suma experiencia y permite subir de nivel cuando se alcanzan `100` puntos.
* `mostrarEstado()`: muestra todos los atributos actuales del personaje.

En el método `main` se crean dos personajes, `Mateo` y `Goblin`. Luego se simula un enfrentamiento donde ambos reciben daño, uno recupera salud y gana experiencia suficiente para subir de nivel. Finalmente, se muestra el estado de ambos personajes.

## Lógica de subida de nivel

Cuando el personaje alcanza **100 puntos de experiencia**, el programa aumenta su nivel en uno y reinicia la experiencia:

```java
if (experiencia >= 100) {
    nivel = nivel + 1;
    experiencia = 0;
}
```

También se controla que la salud nunca sea negativa:

```java
if (salud < 0) {
    salud = 0;
}
```

## Captura de ejecución

<img width="291" height="802" alt="image" src="https://github.com/user-attachments/assets/142ee04b-fedb-4535-a27f-0be313bf8b3c" />


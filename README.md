# Universidad Nacional de Colombia

**Programación Orientada a Objetos 2026-2S**

## Actividad 2: Clases y Objetos - Valor 20%

*   **Nombre del estudiante:** Alejandro Ramos Rincón
*   **Docente:** Walter Hugo Arboleda Mazo

---

### Descripción del Repositorio

Este repositorio contiene la solución a la **Actividad 2** del curso de Programación Orientada a Objetos. Los ejercicios fueron desarrollados en el lenguaje de programación **Java**, aplicando conceptos de clases, objetos, atributos, constructores, métodos get y set, métodos con y sin valor de retorno, métodos con parámetros y valores enumerados.

El proyecto incluye el código fuente de los siguientes ejercicios basados en el libro *Ejercicios de programación orientada a objetos con Java y UML* de Leonardo Bermón Angarita, junto con sus ejercicios propuestos:

*   **Ejercicio 2.1:** Definición de clases (clase Persona). Propuesto: país de nacimiento y género de la persona.
*   **Ejercicio 2.2:** Definición de atributos con tipos primitivos de datos (clase Planeta). Propuesto: periodo orbital y periodo de rotación.
*   **Ejercicio 2.3:** Estado de un objeto con métodos get y set (clase Automovil). Propuesto: automóvil automático y multas por exceso de velocidad.
*   **Ejercicio 2.4:** Definición de métodos con y sin valores de retorno (figuras geométricas). Propuesto: clases Rombo y Trapecio.
*   **Ejercicio 2.5:** Definición de métodos con parámetros (clase CuentaBancaria). Propuesto: porcentaje de interés mensual.

### Estructura
El código fuente se encuentra en la carpeta `Codigo fuente`. Cada ejercicio está organizado en su respectivo paquete y cuenta con una clase `Main` que contiene el método `main`. Las demás clases tienen métodos get y set para cada atributo, y los valores enumerados se definen dentro de la clase a la que pertenecen:

| Paquete | Clases |
|---|---|
| `Ejercicio2_1` | `Persona`, `Main` |
| `Ejercicio2_2` | `Planeta` (con el enumerado `TipoPlaneta`), `Main` |
| `Ejercicio2_3` | `Automovil` (con los enumerados `TipoCom`, `TipoA` y `TipoColor`), `Main` |
| `Ejercicio2_4` | `Circulo`, `Rectangulo`, `Cuadrado`, `TrianguloRectangulo`, `Rombo`, `Trapecio`, `Main` |
| `Ejercicio2_5` | `CuentaBancaria` (con el enumerado `Tipo`), `Main` |

### Documentos y recursos
| Archivo / carpeta | Contenido |
|---|---|
| `Actividad2_POO_con_imagenes.tex` / `.pdf` | Documento de entrega con los diagramas de clases y las capturas de ejecución |
| `Actividad2_POO_sin_imagenes.tex` / `.pdf` | El mismo documento, con un recuadro con el nombre de cada imagen en lugar de la imagen |
| `Diagramas/` | Diagramas de clases en draw.io (`.xml`) y exportados a PNG (`.drawio.png`) |
| `Ejecuciones/` | Capturas de la ejecución de cada ejercicio (`2.1.png` a `2.5.png`) |

En los documentos se omiten los métodos get y set, tanto en el código como en los diagramas; el código fuente completo está en la carpeta `Codigo fuente`.

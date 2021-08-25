#language:  es

Característica: DemoQA - Pagina de elementos

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de demoqa

  Escenario: agregar elemento a la tabla
    Dado  que el usuario se encuentra en el menu "WebTables"
    Cuando el usuario agrega un nuevo elemento
    Entonces el usuario valida que registro se encuentre en la tabla

  Esquema del escenario: Eliminar elemento de la tabla
    Dado  que el usuario se encuentra en el menu "WebTables"
    Cuando el usuario elimina el elemento para el escenario "<Escenario>"
    Entonces el usuario valida que el registro se elemino de manera exitosa
    Ejemplos:
    |Escenario|
    |Eliminar elemento 1|
    |Eliminar elemento 2|
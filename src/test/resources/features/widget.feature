#language:  es

Característica: DemoQA - Pagina de elementos

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de demoqa

  Esquema del escenario: : ingersar fecha
    Dado  que el usuario se encuentra en el menu "Widgets"
    Cuando el usuario ingresa la fecha "<Fecha>"
    Entonces el usuario valida que el campo se diligencio de manera correcta
    Ejemplos:
      | Fecha |
      | conHora   |
      | sinHora   |
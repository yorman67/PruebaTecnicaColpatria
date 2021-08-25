#language:  es

Característica: DemoQA - Pagina de elementos

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de demoqa

  Escenario: ver alerta
    Dado  que el usuario se encuentra en el menu "Alerts"
    Cuando el usuario da click en el boton "ver alerta"
    Entonces la alerta deberia contener el texto "You clicked a button"

 Escenario: Alerta despues de 5s
   Dado  que el usuario se encuentra en el menu "Alerts"
   Cuando el usuario da click en el boton "alerta con 5s"
   Entonces la alerta deberia contener el texto "This alert appeared after 5 seconds"

  Escenario: Alerta confirmacion - ok
    Dado  que el usuario se encuentra en el menu "Alerts"
    Cuando el usuario da click en el boton "alerta de confirmacion ok"
    Entonces el usuario valida que para la opcion "Aceptar" el resultado contenga el texto "You selected Ok"

  Escenario: Alerta confirmacion - cancel
    Dado  que el usuario se encuentra en el menu "Alerts"
    Cuando el usuario da click en el boton "alerta de confirmacion cancel"
    Entonces el usuario valida que para la opcion "Cancelar" el resultado contenga el texto "You selected Cancel"

  Escenario: Alerta con input
    Dado  que el usuario se encuentra en el menu "Alerts"
    Cuando el usuario da click en el boton "alerta con input"
    Entonces el usuario valida que para la opcion "Input" el resultado contenga el texto "You entered "

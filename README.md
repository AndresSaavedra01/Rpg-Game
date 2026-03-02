### Como funciona un RPG por turnos ?

- Una batalla tiene:
  - dos teams de participantes
  - un jugador
  - Un manejador de turnos
- Una battalla puede:
  - comenzar
  - finalizar
  - dar un turno
  - mirar si alguien murio

- Un Manejador de turnos tiene:
  - una cola ordenada
- Un manejador de turnos puede:
  - ordenar la cola por speed
  - sacar los muertos de la cola
  - retornar el primero de la cola y sacarlo
- 

- un participante tiene
  - vida
  - ataque
  - armadura
  - velocidad
  - curacion
- un participante puede:
  - atacar a uno o varios participantes enemigos
  - cubirse
    - esto hara que si lo atacan reciba menos daño
  - curarse o curar un aliado
  - morirse

### Casos de uso
- desde la interfaz el jugador le da a comenzar batalla
- el sistema instancia los tres aliados y los tres enemigos a la batalla
- los participantes de la batalla se organizan segun su speed para tomar turno
- el jugador manejara los allies y la IA los enemies
- cuando un participante toma turno puede atacar, cubrirse o curar
- cuando el participante termina el turno se pasa al siguiente
- el flujo de turnos es una lista enlazada circular
- cuando muere un charcater toma el turno pero no ejecuta ninguna accion
- el flujo se rompe cuando todos los participantes de alguno de los dos teams mueren y el programa termina
- si mueren todos los enemies el jugador gana
- si mueren todos los allies el jugador pierde
- el jugador maneja tres personajes de los seis que hay en la batalla
- el jugador presiona el boton atacar, elige un enemigo para atacar, se aplica el daño al enemigo
- el jugador presiona el boton guard, el daño causado a ese personaje es reducido
- el jugador presiona el boton healing, elige uno de los tres personajes que manje y se cura

### View
- panelInicio con un boton para iniciar batalla
  - al presionar iniciar se borra el panel de inicio y instancia el batallaPanel
- batallaPanel
  - contiene un panel con tres botones attack, guard y helling
  - contiene un panel donde se muestran los participantes de la batalla
  - contiene un characterPanel
    - characterPanel muestra el sprite del personaje y sus stats
      -characterPanel tiene seleccion, que muestra un sprite de que da a ententer que esta selesccionado

### Controller
- selectorController, se encarga de manejar la variable de seleccion de cada characterPanel, se activa solo al presionar atacar o curar
  - si el jugador elige atacar mostrara el sprite de seleccion del primer enemigo en la lista
  - si el jugador elige curar mostrara el sprite de seleccion del primer aliado en la lista
  - el jugador podra cambiar de seleccion con las flechas del teclado y podra hacia la izquierda o derecha
  - cuando el jugador presione enter la accion de atacar o curar se ejecutara
- battleController, se encarga de inicializar la batalla y todo lo que necesite, aqui se crearan las instancias de enemies y allies, para luego crear battle
### Model
- Charcater
  - Enemy
  - Ally
- Battle
  - contiene un TurnManager, un CharacterConteiner
- CharacterConteiner
  - contiene una lista de enemigos y aliados
- TurnManager
  - contiene una lista enlazada circularmente que marca el turno de los Characters
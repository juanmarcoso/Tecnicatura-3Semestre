// Variables globales
let personajeSeleccionado = null;
let vidasJugador = 3;
let vidasEnemigo = 3;

// Elementos del DOM
const botonPersonaje = document.getElementById("boton-personaje");
const botonReiniciar = document.getElementById("boton-reiniciar");
const seccionSeleccionar = document.getElementById("seleccionar-personaje");
const seccionAtaque = document.getElementById("seleccionar-ataque");
const seccionMensajes = document.getElementById("mensajes");
const textoMensaje = document.getElementById("texto-mensaje");
const spanVidasJugador = document.getElementById("vidas-jugador");
const spanVidasEnemigo = document.getElementById("vidas-enemigo");
const seccionReiniciar = document.getElementById("reiniciar");

// Event Listeners
botonPersonaje.addEventListener("click", seleccionarPersonajeJugador);
botonReiniciar.addEventListener("click", reiniciarJuego);

// Función para seleccionar personaje
function seleccionarPersonajeJugador() {
    const personajes = document.getElementsByName("personaje");
    
    for (const personaje of personajes) {
        if (personaje.checked) {
            personajeSeleccionado = personaje.id;
            break;
        }
    }

    if (personajeSeleccionado) {
        // Ocultar selección y mostrar ataques
        seccionSeleccionar.classList.add("hidden");
        seccionAtaque.classList.remove("hidden");
        seccionMensajes.classList.remove("hidden");
        
        // Mostrar mensaje de selección
        textoMensaje.textContent = `¡Has elegido a ${personajeSeleccionado}! ¡Prepárate para la batalla!`;
    } else {
        alert("Por favor, selecciona un personaje.");
    }
}

// Función para volver al inicio
function volverAlInicio() {
    // Oculta todas las secciones
    seccionAtaque.classList.add("hidden");
    seccionMensajes.classList.add("hidden");
    seccionReiniciar.classList.add("hidden");
    
    // Muestra solo la sección de selección
    seccionSeleccionar.classList.remove("hidden");
    
    // Resetea cualquier selección
    const radioButtons = document.querySelectorAll('input[name="personaje"]');
    radioButtons.forEach(radio => {
        radio.checked = false;
    });
}

// Asignar evento a los botones de volver
document.querySelectorAll(".btn-volver").forEach(boton => {
    boton.addEventListener("click", volverAlInicio);
});

// Función para reiniciar el juego
function reiniciarJuego() {
    location.reload();
}
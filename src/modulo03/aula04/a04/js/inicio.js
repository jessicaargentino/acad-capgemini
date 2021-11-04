/* Funções para exibir páginas diferentes no iFrame da página inicio.html */

function cadastrar() {
    let frame = document.getElementById("frame");
    frame.src = "cadastrar.html"
}

function listar() {
    let frame = document.getElementById("frame");
    frame.src = "listar.html"
}

function contato() {
    let frame = document.getElementById("frame");
    frame.src = "contato.html"
}
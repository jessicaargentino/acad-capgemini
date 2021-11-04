/* Ao carregar a página, é criado um vetor/array de pessoas, 
e é enviado ao localStorage um item de pessoa através da conversão para JSON */
window.onload = function () {
    console.log('Carregando Js...');
    let pessoa = []
    localStorage.setItem("pessoa", JSON.stringify(pessoa));
}

/**
 * Método que chama o evento preventDefault para cancelar se necessário, sem parar o fluxo do mesmo.
 * Após isso, guarda os valores digitados pelo usuário através do document.getElementById
 * em variáveis. Executa uma verificação de idade e se for true, guarda as informações em um elemento
 * do array de pessoa, após isso, seta o item de pessoa para o localStorage através do uso de JSON.
 */
function salvar(event) {
    event.preventDefault();
    let nome = document.getElementById('nome');
    let sobrenome = document.getElementById('sobrenome');
    let idade = document.getElementById('idade');
    //dicionario - Chave:Valor
    if (idade.value >= 18) {
        pessoa = { "nome": nome.value, "sobrenome": sobrenome.value, "idade": idade.value };
        let pessoas = JSON.parse(localStorage.getItem("pessoa"));
        pessoas.push(pessoa);
        localStorage.setItem("pessoa", JSON.stringify(pessoas));
    } else {
        alert('Sai fora de menor')
    }
    carregaTabela();
}

/**
 * Método que busca os elementos do vetor/localStorage de pessoas e os exibe em formato de tabela
 */
function carregaTabela() {
    let tbody = document.getElementById("corpo-tabela");
    let pessoas = JSON.parse(localStorage.getItem("pessoa"));
    tbody.innerHTML = "";
    pessoas.forEach(p => {
        tbody.innerHTML += "<tr>"
            + "<td>" + p["nome"] + "</td>"
            + "<td>" + p["sobrenome"] + "</td>"
            + "<td>" + p["idade"] + "</td>"
            + "</tr>";
    });
}
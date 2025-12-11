function trocarCor(cor) {
    img_cor.src = `assets_trocador/paper/${cor}.png`
}

var vt_chapeus = [5, 6, 7, 8]
function exibirChapeus() {
    elementos_chapeus.innerHTML = ""
    for (let i = 0; i < vt_chapeus.length; i++) {
        elementos_chapeus.innerHTML += `
        <div class="caixa_roupa">
            <img onclick="trocarChapeu(${vt_chapeus[i]})" class="icon_roupa" src="assets_trocador/icones/${vt_chapeus[i]}.png">
        </div>
        `
    }
}

exibirChapeus()

function trocarChapeu(chapeu) {
    if (img_chapeu.src.endsWith(`${chapeu}.png`)) {
        img_chapeu.src = "assets_trocador/paper/0.png"
        return
    }
    img_chapeu.src = `assets_trocador/paper/${chapeu}.png`
}

var i = 0
var vt_camisas = [9, 10, 11, 12, 13, 14, 15]
function exibirCamisas() {
    elementos_camisas.innerHTML = ""
    var contador = i
    for (let w = i; w < i + 4; w++) {
        elementos_camisas.innerHTML += `
        <div class="caixa_roupa">
            <img onclick="trocarCamisa(${vt_camisas[w]})" class="icon_roupa" src="assets_trocador/icones/${vt_camisas[w]}.png">
        </div>
        `
    }
}

exibirCamisas()

function direitaCamisas() {
    if (i >= vt_camisas.length - 4) {
        i = -1
    }
    i ++
    exibirCamisas()
}

function esquerdaCamisas() {
    if (i <= 0) {
        i = vt_camisas.length - 3
    }
    i--
    exibirCamisas()
}

function trocarCamisa(camisa) {
    if (img_camisa.src.endsWith(`${camisa}.png`)) {
        img_camisa.src = "assets_trocador/paper/0.png"
        return
    }
    img_camisa.src = `assets_trocador/paper/${camisa}.png`
}

function testarJAVA() {

    fetch('http://localhost:8080/alimentos/obter')
        .then(resposta => resposta.json())
        .then(resposta2 => {

            console.log(resposta2)
            alert(resposta2[0].nome)

        })
        .catch(error => {

            console.error('Error fetching data:', error)
            alert("DEU ERRO")

        });
}
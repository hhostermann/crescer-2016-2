//https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference

//1
function gerarPiramide(nivel){
for (var i = 0 ; i < nivel; i++) {
   var piramide = '';
   for (var j = 0; j < i; j++) {
     piramide += 'R$';
  }
  console.log(piramide);
   }
 }
gerarPiramide(9);

//2
function diglettDig(){
  for(var i = 0; i <= 100; i++){
    if(i % 3 === 0 && i !== 0){
      console.log('Diglett dig');
    }
    if(i % 5 === 0 && i !== 0){
      console.log('trio trio trio');
    }
    if(i % 5 === 0 && i % 3 === 0 && i !== 0){
      console.log('Diglett dig, trio trio trio');
    }
    if(i % 5 !== 0 && i % 3 !== 0 ){
      console.log(i);
    }
  }
}
diglettDig();


//3
function find(array, tipo){
    var resultado = '';
    for(var i=0; i< array.length; i++){
        if(tipo(array[i])){
          resultado += array[i] + ' ';
        }
    }
    return resultado;
}

var maiorIgualADois = function(elemento) {
  return elemento >= 2;
};
console.log(find([ 1, 2, 3 ], maiorIgualADois));
// [ 2, 3 ]

console.log(find([ 'a', 5, null, false, 'false' ], function(elem) {
  return typeof elem === 'string';
}));
// [ 'a', 'false' ]

console.log(find([ { nome: 'a' }, { nome: 'b' }  ], function(elem) {
  return typeof elem.nome === 'c';
}));
// []
//4
function subtrair (numeroPrimeiro){
 function equacao(numeroSegundo){
      return resultado = numeroPrimeiro - Math.abs(numeroSegundo);
  }
    return equacao;
}

console.log(subtrair(2)(1)); // 1
console.log(subtrair(0)(0)); // 0
console.log(subtrair(-1)(-2)); // -3

//5
//não consegui fazer! //TO_DO

//6
function ctrlC (valor) {
    var resultado = {};
    for(var tipo in valor) {
        resultado[tipo] = valor[tipo];
    }
    return resultado;
}

var origem = { a: '1' };
var destino = ctrlC(origem);

console.log(destino);
// { a: '1' }
console.log(origem === destino);
// false
console.log(ctrlC(origem, destino));
// true
destino = ctrlC({ a: [ { b: '1', c: '2' }, { d: false }, { e: function() { return 3; } } ] });
console.log(destino.a[2].e());
// 3

//7

var mesclar = function(primeiroObjeto, segundoObjeto, recursivo){

    for (var index in segundoObjeto){
      var segundoObjetoAtributo = segundoObjeto.hasOwnProperty(index);
      var atributosegundoObjeto = typeof segundoObjeto[index] === "object";
      if(!!recursivo){
        if (segundoObjetoAtributo) {

          if(atributosegundoObjeto){
              mesclar(primeiroObjeto[index], segundoObjeto[index], true);
          }
        }
      }
      if(recursivo) {
        Object.assign(primeiroObjeto, segundoObjeto);
 }
    return primeiroObjeto;
  }
}

var objeto1 = {
  abacaxi: 0,
  banana: { peso: 52, preco: 100, origem: { cidade: 'taquari', estado: 'rs' } },
  cereja: 97
};
var objeto2 = {
  banana: { preco: 200, origem: { cidade: 'cachoeira do sul', estado: 'rs' } },
  damasco: 100
};
mesclar(objeto1, objeto2, true);
console.log(objeto1);

function b(a, b) { return a+=b, a;
}
console.log(b(1, 2));

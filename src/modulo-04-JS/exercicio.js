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



function subtrair (numeroPrimeiro, numeroSegundo){
 function primeiroNumero(num1){
    return num1;
  }
  function numeroSegundo(num2){
    return num2;
  }
  return primeiroNumero(numeroPrimeiro) - numeroSegundo(numeroSegundo);
}

// como tem de ficar:
console.log(subtrair(2)(1)); // 1
console.log(subtrair(0)(0)); // 0
console.log(subtrair(-1)(-2)); // -3

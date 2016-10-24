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

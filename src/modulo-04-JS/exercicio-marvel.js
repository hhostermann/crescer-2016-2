class Heroi {
  constructor(array) {
    this.array = array;
}
 foraDaGuerraCivil() {
    let retorno = [];
    for(var i = 0 ; i < this.array.length ; i++){
      var objeto = this.array[i];
      var item = objeto['events']['items'];
      var fora = false;
      for(var j=0;j<item.length;j++){
      if(item[j].name === 'Civil War'){
        fora = true;
      }
      }
      if(!fora){
        retorno.push(objeto);
      }
    }
    return retorno;
}
//   maisPublicado(){
//     for (var i = 0; i < array.length; i++) {
//       array[i]
//     }
//     return
//
// }
}

          fun main(){
              val nome = "Junior"

            /*  if (nome == "Madson" || nome == "Marcos" || nome == "Luis") {
                  println("Nome Valido")
              }else{
                  println("Nome Invalido")
              }
*/
              when (nome){
                  "Madson", "Marcos", "Luis" -> println("Nome Valido")
              else  -> println("Nome Invalido")
              }
          }
fun main() {
/*
    var contador = 0
    while(contador<5){
        println("Ao infinito e alem")
        contador++
    }
    */
    /*  var opcao = 0                                   //var porque durante a operação sera uma variavel mutavel
    while (opcao != 2) {                            //false enqaunto for diferente de 2, o loop continua
    println("Escolha uma opção: (1) Iniciar Jogo | (2) Sair")
        opcao = readLine()!!.toInt()

        if (opcao == 1){
            println("Iniciando o jogo...")
        }else{
            break
        }
        println("Jogo Finalizado...")

 }
   */
    while (false) {
        println("Nunca vai ser executado")    //não vai ser executado
        do {
            println("vai executar uma vez") //vai ser executado apenas uma vez
        } while (false)     //vai finalizar o programa
    }
}

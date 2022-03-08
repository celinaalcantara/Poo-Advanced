fun main(args: Array<String>) {
    /*
    Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão e pelo
    menos mais duas opções de construtores conforme sua percepção, com os atributos: nome
    (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
    A classe precisará de métodos para adicionar, remover e listar os itens do atributo
    listaDeCompras.
    Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue
    uma exceção. Ao instanciar a classe cliente na função main(), não esquecer de colocar
    dentro de um bloco try catch.
    */


    println("Digite o nome: ")
    val nome = readLine()!!

    println("Digite o endereço: ")
    val endereco = readLine()!!

    println("Digite o telefone: ")
    val telefone = readLine()!!

    try {
        val nome = Cliente("Nancy", "Rua Elm, 1428", "(11)95678-1234")

    }catch (e: Exception){
        println(e.message)
    }

    while (true){

        println("\nMenu de ações")
        println("1 - Adicione itens na compra")
        println("2 - Remova itens da compra")
        println("3 - Lista de itens da compra")
        println("Para sair, digite S")
        println("\nSelecione uma opção: ")

        var opcao = 0

        while (true) {
            println("\nSelecione uma opção")

            try {
                opcao = readLine()!!.toInt()
                break
            } catch (e: Exception) {
                println("Opção inválida.")
            }
        }

        when(opcao){

            1 ->
            2 ->
            3 ->

        }


    }


}


import encap.Cliente

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
        val compra = Cliente

    } catch (e: Exception) {
        println(e.message)
    }

    while (true) {
        val compra = Cliente
        var opcao = 0

        println("\nMenu de ações")
        println("1 - Adicione itens na compra")
        println("2 - Remova itens da compra")
        println("3 - Lista de itens da compra")
        println("Para sair, digite S")
        println("\nSelecione uma opção: ")

        while (true) {
            println("\nSelecione uma opção")

            try {
                opcao = readLine()!!.toInt()
                break
            } catch (e: Exception) {
                println("Opção inválida.")
            }
        }

        when (opcao) {

            1 -> {
                println("Digite item a ser adicionado: ")
                val item = readLine()!!
                compra.adicionar(item)
            }
            2 -> {
                println("Digite item a ser removido: ")
                val item = readLine()!!
                compra.remover(item)
            }
            3 -> compra.listaritens()

            else -> break
        }

    } catch(e: Exception) {
        println(e.message)
    }

}


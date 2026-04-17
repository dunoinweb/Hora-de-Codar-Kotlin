fun main() {
    println("Bem vindo ao Hora de Codar 4")
    println("Digite o número da questão:")
    println("1 - Estudantes")
    println("2 - Planetas")
    println("3 - Mercado")
    var questao = readln().toInt()
    when (questao) {
        1 -> estudantes()
        2 -> planetas()
        3 -> listaDeCompras()
    }
}

fun estudantes () {
    val nomes_estudantes = mutableListOf<String>()
    var nome_estudante: String
    println("--- Lista de estudantes ---")
    println("Digite o nome do aluno (digite PARE quando quiser parar)")
    while (true) {
        nome_estudante = readln().uppercase()
        if (nome_estudante == "PARE") {
            break
        }
        nomes_estudantes.add(nome_estudante)
    }

    println("O número de alunos é: ${nomes_estudantes.size}")
    println("Nomes dos alunos: $nomes_estudantes")
    println("")
    println("Voltando para a tela inicial...")
    main()

}

fun planetas () {
    val planetas = listOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")

    println("--- Lista de Planetas ---")
    println("")
    println("Digite o nome do planeta:")
    var planetaUsuario = readln()

    if (planetas.contains(planetaUsuario)) {
        println("O planeta está na lista")
    } else {
        println("O planeta não está na lista")
        planetas()
    }
    println("")
    println("Voltando para a tela inicial...")
    main()
}

fun listaDeCompras () {

    println("--- Lista de Compras ---")

    val frutas = mutableListOf<String>("maçã", "banana", "laranja", "abacaxi", "uva")

    while (frutas.isNotEmpty()) {
        println("Frutas disponíveis: $frutas")
        println("Digite o nome da fruta que você comprou")
        var fruta_usuario = readln().lowercase()

        if (frutas.remove(fruta_usuario)) {
            println("Fruta removida da lista")
        } else {
            println("Você já tirou essa fruta da lista.")
        }
    }
    println("Você comprou todas as frutas")
    println("")
    println("Voltando para a tela inicial...")
    main()
}
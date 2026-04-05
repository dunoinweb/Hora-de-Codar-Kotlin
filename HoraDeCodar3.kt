fun main() {
    println("--- Seja bem vindo ao Hora de Codar 3: De volta ao Código. ---")
    println("Escolha qual dos programas você gostaria de executar: ")
    println("1 - Vai explodir!")
    println("2 - Dividindo por mais de zero")
    println("3 - Contagem regressiva de 10 a 1")
    println("4 - Média aritmética de 15 a 100")
    println("5 - Média aritmética dos seus números")
    println("6 - Aprovado ou não aprovado")
    println("7 - Média de 6 notas")
    println("8 - Contando e contando")
    println("9 - Contando até 110 (só que a partir de 101)")
    println("10 - Números entre 24 e 42")
    println("11 - Multiplicando o quanto quiser")
    var opcao = readln().toInt()
    if (opcao == 1){
        questao1()
    }
    else if (opcao == 2){
        questao2()
    }
    else if (opcao == 3){
        questao3()
    }
    else if (opcao == 4){
        questao4()
    }
    else if (opcao == 5){
        questao5()
    }
    else if (opcao == 6){
        questao6()
    }
    else if (opcao == 7){
        questao7()
    }
    else if (opcao == 8){
        questao8()
    }
    else if (opcao == 9){
        questao9()
    }
    else if (opcao == 10){
        questao10()
    }
    else if (opcao == 11){
        questao11()
    } else {
        println("Opção inválida, tente novamente...")
        println(" ")
        main()
    }
}

fun questao1 () {

    // Crie uma bomba relógio (usando somente código - para deixar claro!)
    // cuja contagem regressiva vá de 30 a 0. No final da repetição escreva "EXPLOSÃO".

        println("--- VAI EXPLODIR! ---")
        var kabum: Int = 30
        while (kabum > 0) {
            println("$kabum")
            kabum--
            Thread.sleep(1000)
        }
    println("EXPLOSÃO")
    questao2()
}

fun questao2 () {

    // Escreva um algoritmo para ler 2 valores informados pelo usuário e enquanto
    // o segundo valor informado for igual ou menor que ZERO, deve ser lido um novo
    // valor, mas para a mesma variável. Ou seja, para o segundo valor não será
    // aceito o valor zero nem um valor negativo.

    //O seu programa deve imprimir o resultado da divisão do primeiro valor lido pelo
    // segundo valor e exibir o resultado ao usuário.

    println("--- Dividindo por mais de zero ---")
    println("Pelo visto você quer dividir... Me informe o primeiro valor:")
    val primeiro = readLine()!!.toDouble()
    println("Agora informe o segundo valor:")
    var segundo = readLine()!!.toDouble()
    while (segundo <= 0) {
        println("Ops, você não consegue dividir por números negativos ou zero.")
        println("Vamos tentar novamente. Informe o segundo valor:")
        segundo = readln().toDouble()
    }
    val total = primeiro / segundo
    println("O resultado da divisão é $total")
    questao3()
}

fun questao3 () {

    // Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive)
    // em ordem decrescente.
    //Exemplo: 10, 9, 8, 7, 6, 5, 4, 3, 2, 1

    println("--- Contagem regressiva de 10 a 1 ---")
    println("Prepare-se para correr")
    for (i in 10 downTo 1) {
        println("$i")
        Thread.sleep(1000)
    }
    questao4()
}

fun questao4 () {
    println("--- Média aritmética de 15 a 100 ---")

    var numeros = mutableListOf<Double>()
    println("Somando...")
    Thread.sleep(500)
    println("Dividindo...")
    for (i in 15..100) {
        numeros.add(i.toDouble())
    }
    println("Conferindo...")
    Thread.sleep(1000)
    val total = numeros.sum()
    println("A média aritmética dos números somados entre 15 e 100 é $total")
    questao5()
}

fun questao5 () {

    // Faça um algoritmo que calcule e escreva a média aritmética dos
    // dois números inteiros informados pelo usuário e todos os números
    // inteiros entre eles. Considere que o primeiro sempre será menor que o segundo.

    println("--- Média aritmética dos seus números ---")

    println("Informe o primeiro valor:")
    val valor1 = readLine()!!.toInt()
    println("Informe o segundo valor:")
    var valor2 = readLine()!!.toInt()
    while (valor2 <= valor1) {
        println("O segundo valor informado deve ser maior que o primeiro.")
        println("Tente novamente:")
        valor2 = readLine()!!.toInt()
    }
    var numeros = mutableListOf<Int>()
    for (i in valor1 .. valor2) {
        numeros.add(i)
    }
    val totalValores = ((valor1 + valor2) / 2).toDouble()
    val totalNumeros = numeros.sum()
    println("Média aritmética dos valores informados: $totalValores")
    println("Média aritmética dos números entre os valores informados: $totalNumeros")
    questao6()
}

fun questao6 () {

    // Escreva um programa para ler 2 notas de um aluno, calcular e imprimir a média final.
    // Considere que a nota de aprovação é 9,5. Logo após escrever a mensagem "Calcular a média de
    // outro aluno Sim/Não?" e solicitar um resposta. Se a resposta for "S", o programa deve ser executado
    // novamente, caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.

    println("--- Aprovado ou não aprovado ---")
    println("Informe a primeira nota do aluno")
    var notaUm = readln().toDouble()
    while (notaUm < 0 || notaUm > 10) {
        println("Informe uma nota de 0 a 10")
        notaUm = readln().toDouble()
    }
    println("Informe a segunda nota do aluno")
    var notaDois = readln().toDouble()
    while (notaDois < 0 || notaDois > 10) {
        println("Informe uma nota de 0 a 10")
        notaUm = readln().toDouble()
    }
    val media = (notaUm + notaDois) / 2
    if (media > 9.5) {
        println("A média é $media")
        println("APROVADO!")
    } else {
        println("A média é $media")
        println("REPROVADO...")
    }
    println("Gostaria de calcular a média de outro aluno?")
    println("Sim / Não")
    var resposta: String = readln().lowercase()
    if (resposta == "sim") {
        questao6()
    } else {
        println("Obrigado por ter usado meu programa :D")
    }
    questao7()
}

fun questao7 () {

    // Escreva um algoritmo para ler as notas de avaliações de um aluno, calcule e
    // imprima a média (simples) desse aluno. Só devem ser aceitos valores válidos durante
    // a leitura (0 a 10) para cada nota. São 6 notas ao total.

    // Caso o valor informado para qualquer uma das notas esteja fora do limite estabelecido, deve ser solicitado um
    // novo valor ao usuário.

    println("--- Média de 6 notas ---")
    var notas = mutableListOf<Double>()
    for (i in 1..6) {
        println("Escreva a ${i}ª nota do aluno")
        var notaAluno = readln().toDouble()
        while (notaAluno < 0 || notaAluno > 10){
            println("Escreva notas entre 0 a 10:")
            notaAluno = readln().toDouble()
        }
        notas.add(notaAluno)
    }
    println("As notas do aluno são: $notas")
    val media = notas.sum() / 6
    println("A média do aluno é: %.2f".format(media))
    questao8()
}

fun questao8() {
    // Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive).
    // Considere que o N será sempre maior que ZERO.
    // N  é um valor informado pelo usuário

    println("--- Contando e contando ---")
    println("Até qual número você quer realizar uma contagem?")
    var n = readln().toInt()
    if (n > 0) {
        for (i in 1..n){
            println(i)
        }
    } else {
        println("Poxa, só consigo contar números acima de 0. Tente novamente.")
        questao8()
    }
    questao9()
}

fun questao9() {

    // Escreva um algoritmo para imprimir os 10 primeiros números inteiros maiores que 100.

    println("--- Contando até 110 (só que a partir de 101) ---")
    for (i in 101 .. 110) {
        println(i)
    }
    questao10()
}

fun questao10() {
    println("--- Entre 24 e 42 ---")

    var numeros = mutableListOf<Double>()
    var numerosfora = mutableListOf<Double>()


    println("--- Números entre 24 e 42 ---")
    for (i in 1 .. 10) {
        println("Escreva o ${i}º número")
        var numero = readln().toDouble()
        if (numero >= 24 || numero <= 42) {
            numeros.add(numero)
        } else {
            numerosfora.add(numero)
        }
    }
    println("Números dentro do padrão: 24, $numeros, 42")
    println("Números fora do padrão: $numerosfora")
    println("Obrigado por ter usado meu programa.")
    questao11()
}

fun questao11() {

    // Escreva um programa para imprimir todas as tabuadas de
    // 1 a N. N será informado pelo usuário.

    println("--- Multiplicando o quanto quiser ---")
    println("Vamos multiplicar! Informe até qual tabuada você gostaria que eu multiplicasse.")
    val numerofinal  = readln().toInt()

    for (i in 1..numerofinal){
        println("- Tabuada do $i -")
        for (j in 1..10){
            println("$i X $j = ${i * j}")
        }
        println("Obrigado por usar meu programa :D")
    }
    main()
}

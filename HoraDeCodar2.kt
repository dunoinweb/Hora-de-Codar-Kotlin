fun main() {
    println("--- Seja bem vindo ao Hora de Codar 2: A vingança do Coder! ---")
    println("Escolha qual dos programas você gostaria de executar: ")
    println("1 - Maior entre dois")
    println("2 - Positivo, negativo ou zero")
    println("3 - Maior entre três")
    println("4 - Soma dos dois maiores")
    println("5 - Média aritmética")
    println("6 - Primeiro, último e maior")
    println("7 - Soma abaixo de 72")
    println("8 - Média dos 4")
    println("9 - Votar ou não")
    println("10 - Peso ideal")
    println("11 - Mini calculadora")
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

fun questao1() {

    //Escreva um programa em que o usuário informe dois números. Então escreva
    // em tela o maior deles.

    println("--- Maior entre dois ---")
    println("Vamos comparar os números e verificar o maior entre eles. Me diga o primeiro número")
    val primeiro_numero = readln().toDouble()
    println("Agora informe o segundo número")
    val segundo_numero = readln().toDouble()
        if (primeiro_numero < segundo_numero) {
            println("O maior número é $segundo_numero")
        } else {
                println("O maior número é $primeiro_numero")
        }
    questao2()
}

fun questao2() {

    // Faça um programa que leia um valor informado pelo usuário e diga
    // se o valor informado é positivo, negativo ou zero.

    println("--- Positivo, negativo ou zero ---")
    println("Informe o primeiro número")
    val primeiro_numero_PNZ = readln().toDouble()
        if (primeiro_numero_PNZ < 0) {
            println("Esse número é negativo")
        } else if (primeiro_numero_PNZ == 0.0) {
            println("Esse número é zero")
        } else {
            println("Esse número é positivo")
        }
    questao3()
}

fun questao3() {

    // Faça um programa para ler 3 valores (considere que não serão informados valores iguais)
    // e escreva o maior deles.

    println("--- Maior entre três ---")
    println("Informe o primeiro número")
    val primeiro_numero_MET = readln().toDouble()
    println("Informe o segundo número")
    var segundo_numero_MET = readln().toDouble()
        while (segundo_numero_MET == primeiro_numero_MET) {
            println("Você já digitou esse número, vamos tentar um novo.")
            segundo_numero_MET = readln().toDouble()
        }
    println("Informe o terceiro número")
    var terceiro_numero_MET = readln().toDouble()
        while (terceiro_numero_MET == primeiro_numero_MET && terceiro_numero_MET == segundo_numero_MET) {
            println("Você já digitou esse número, vamos tentar um novo.")
            terceiro_numero_MET = readln().toDouble()
        }
        if (primeiro_numero_MET > segundo_numero_MET && primeiro_numero_MET > terceiro_numero_MET) {
            println("O maior número é $primeiro_numero_MET")
        } else if (segundo_numero_MET > terceiro_numero_MET) {
            println("O maior número é $segundo_numero_MET")
        } else {
            println("O maior número é $terceiro_numero_MET")
        }
    questao4()
}

fun questao4() {

    // Faça um programa que leia 3 valores informados pelo usuário
    // (considere que não serão informados valores iguais) e escreva a soma dos 2 maiores.

    println("--- Soma dos dois maiores ---")
    println("Digite o primeiro valor: ")
    val a = readln().toDouble()
    println("Digite o segundo valor: ")
    val b = readln().toDouble()
    println("Digite o terceiro valor: ")
    val c = readln().toDouble()
    var menor = a
        if (b < menor){
            menor = b
        }
        else if (c < menor){
            menor = c
        }

    val soma2maiores = (a + b + c) - menor
    println("A soma dos dois maiores é: $soma2maiores")
    questao5()
}

fun questao5 () {

    //Faça um programa que leia 6 valores informados pelo usuário,
    // calcule, exiba os números informados e escreva a média aritmética desses valores lidos.

        val lista = mutableListOf<Double>()

    println("--- Média aritmética ---")
    for (i in 1..6){
        println("Digite o ${i}º valor ")
        val valor = readln().toDouble()
        lista.add(valor)
    }
    println("Os valores que você digitou são: $lista")
    val total = lista.sum()
    println("A média aritmética dos valores é: ${total / 6}")
    questao6()
}

fun questao6 () {

    // Faça um programa que receba quatro valores informados pelo usuário,
    // mas informe somente o primeiro, o último e o maior de todos eles
    // (considere que todos os números informados serão diferentes)

    val lista = mutableListOf<Double>()

    println("--- Primeiro, último e maior ---")
    for (i in 1..4){
        println("Escreva o ${i}º valor ")
        val valor = readln().toDouble()
        lista.add(valor)
    }

    var maior: Double = lista[1]

    if (lista[0] > maior){
        maior = lista[0]
    }
    else if (lista[1] > maior){
        maior = lista[1]
    }
    if (lista[3] > maior){
        maior = lista[3]
    }

    println("O primeiro valor é ${lista[0]}")
    println("O último valor é ${lista[3]}")
    println("O maior valor é $maior")
    questao7()
}

fun questao7() {

    // Faça um programa que leia 6 números que o usuário vai informar.
    // Todos os números lidos com valor inferior a 72 devem ser somados.
    // Escreva o valor final da soma efetuada e também todos valores que o usuário informou.
    println("--- Soma abaixo de 72 ---")

    val numeros = mutableListOf<Double>()

    var soma = 0.0

    var i = 0
    while (i < 6){
    println("Escreva o ${i + 1}º número.")
        numeros.add(readln().toDouble())
        if (numeros[i] < 72){
            soma += numeros[i]
        }
        i++
    }
    println("Números informados: ")
    i = 0
    while (i < 6){
        println(numeros[i])
        i++
    }
    println("Soma dos valores abaixo de 72: $soma")
    questao8()
}

fun questao8() {

    // Escreva um programa que calcule a média de quatro números informados pelo usuário,
    // mas somente se esses números forem maiores que 0 e menores que 10. No final,
    // se a média for maior que cinco o usuário receberá uma mensagem
    // "Você passou no teste". Em qualquer outra situação, ele receberá uma mensagem de
    // "tente novamente"

    println("--- Média dos quatro ---")
    println("Digite o primeiro valor: ")
    val n1 = readln().toDouble()
    println("Digite o segundo valor: ")
    val n2 = readln().toDouble()
    println("Digite o terceiro valor: ")
    val n3 = readln().toDouble()
    println("Digite o quarto valor: ")
    val n4 = readln().toDouble()

    if (n1 > 0 && n1 < 10 && n2 > 0 && n2 < 10 && n3 > 0 && n3 < 10 && n4 > 0 && n4 < 10) {
        val MEDIA = (n1 + n2 + n3 + n4) / 4
        println("Média: $MEDIA")
        if (MEDIA > 5) {
            println("Você foi aprovado!")
        } else {
            println("Infelizmente você foi reprovado :(")
        }
    } else {
        println("Valores inválidos! Todos os números devem ser maiores que 0 e menores que 10.")
    }
    questao9()
}

fun questao9() {
    println("--- Votar ou não ---")
    println("Escreva o ano de seu nascimento")
    val ANONASCIMENTO = readln().toDouble()
    val IDADE = 2026 - ANONASCIMENTO
    if (ANONASCIMENTO >= 16) {
        println("Você tem $IDADE anos")
        println("Você poderá votar este ano :)")
    } else {
        println("Você tem $IDADE anos")
        println("Você não poderá votar este ano :(")
    }
    questao10()
}

fun questao10() {
    println("--- Peso 'ideal' ---")
    println("Informe o gênero qual você se identifica digitando o número da opcão apresentada.")
    println("1 - Feminino")
    println("2 - Masculino")
    var genero = readln().toInt()
    println("Agora informe sua altura como sugere (Exemplo: 1.75)")
    var altura = readln().toDouble()
    var pesoIdeal: Double = 0.0
    if (genero == 1) {
        pesoIdeal = (72.7 * altura) - 58
    } else if (genero == 2) {
        pesoIdeal = (62.1 * altura) - 44.7
    } else {
        println("Código de gênero inválido!")
    }
    println("Seu peso ideal é $pesoIdeal")
}

fun questao11 () {

    // Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma das
    // seguintes operações a serem executadas (codificada da seguinte forma:
    // 1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação).
    // O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos.

    // Observação: Considere que só serão lidos os valores 1, 2, 3 ou 4 para as operações

    println("--- Mini Calculadora ---")
    println("Informe o primeiro valor a ser calculado:")
    val valorUm = readln().toDouble()
    println("Informe o segundo valor a ser calculado:")
    val valorDois = readln().toDouble()
    println("Escolha a opção que deseja executar")
    println("1 - Adição")
    println("2 - Subtração")
    println("3 - Divisão")
    println("4 - Multiplicação")
    val opcao = readln().toInt()
    if (opcao == 1) {
        val total: Double = valorUm + valorDois
        println("O resultado é $total")
    }
    else if (opcao == 2) {
        val total: Double = valorUm - valorDois
        println("O resultado é $total")
    }
    else if (opcao == 3) {
        val total: Double = valorUm / valorDois
        println("O resultado é $total")
    }
    else if (opcao == 4) {
        val total: Double = valorUm * valorDois
        println("O resultado é $total")
    } else {
        println("A opção digitada é inválida")
    }
}

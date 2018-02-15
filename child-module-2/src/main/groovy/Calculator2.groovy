class Calculator2 {
    static def multiply(int a, int b) {
        (1..a).stream().reduce(0, { acc, _ ->
            Calculator.sum(acc, b) })
    }
}

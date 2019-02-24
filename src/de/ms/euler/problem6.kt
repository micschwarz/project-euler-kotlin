package de.ms.euler

import de.ms.euler.util.formatExecTime
import de.ms.euler.util.pow
import kotlin.system.measureNanoTime

fun main() {
    var solution = 0
    val execTime = measureNanoTime {
        solution = problem6(100)
    }

    println("Solution: $solution")
    println("Exec Time: ${formatExecTime(execTime)}")
}

fun problem6(max: Int): Int {
    val range = IntArray(max) { it + 1 }
    val sumOfSquare = range.map { it.pow(2) }.sum()
    val squareOfSum = range.sum().pow(2)

    return squareOfSum - sumOfSquare
}
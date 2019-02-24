package de.ms.euler

import de.ms.euler.util.formatExecTime
import kotlin.system.measureNanoTime

fun main() {
    var solution = 0
    val execTime = measureNanoTime {
        solution = problem5(20)
    }

    println("Solution: $solution")
    println("Exec Time: ${formatExecTime(execTime)}")
}

fun problem5(maxDivisor: Int): Int {
    val maxOddDivisor = if (maxDivisor % 2 == 0) maxDivisor - 1 else maxDivisor

    var divisable = false
    var solution = 0
    var fac = 2

    while (!divisable) {
        solution = fac * maxOddDivisor
        fac += 2

        if (maxDivisor >= 5 && solution % 5 != 0) {
            continue
        }

        divisable = true
        for (divisor in maxDivisor downTo 2) {
            if (solution % divisor != 0) {
                divisable = false
                break
            }
        }
    }

    return solution
}
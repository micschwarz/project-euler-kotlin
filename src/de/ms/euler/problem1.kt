package de.ms.euler

import de.ms.euler.util.formatExecTime
import kotlin.system.measureNanoTime

fun main() {
    var solution = 0
    val execTime = measureNanoTime {
        solution = problem1(1000)
    }

    println("Solution: $solution")
    println("Exec Time: ${formatExecTime(execTime)}")
}

fun problem1(maxVal: Int): Int {
    val max = maxVal - 1
    var sum = 0

    for (i in 0..max/3) {
        sum += i * 3
        if (i.isMultipleOf5Allowed(max)) {
            sum += i*5
        }
    }

    return sum
}

fun Int.isMultipleOf5Allowed(max: Int): Boolean {
    val i = this * 5
    return i < max && i % 15 != 0
}
package de.ms.euler.util

import java.util.concurrent.TimeUnit

fun formatExecTime(execTime: Long): String {
    val micro = TimeUnit.NANOSECONDS.toMicros(execTime)
    val nano = execTime - TimeUnit.MICROSECONDS.toNanos(micro)

    return "$micro μs $nano ns"
}
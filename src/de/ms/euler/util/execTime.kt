package de.ms.euler.util

import java.util.concurrent.TimeUnit

fun formatExecTime(execTime: Long): String {
    val milli = TimeUnit.NANOSECONDS.toMillis(execTime)
    val micro = TimeUnit.NANOSECONDS.toMicros(execTime) - TimeUnit.MILLISECONDS.toMicros(milli)
    val nano = execTime - TimeUnit.MICROSECONDS.toNanos(micro) - TimeUnit.MILLISECONDS.toNanos(milli)

    return "${milli}ms ${micro}μs ${nano}ns"
}
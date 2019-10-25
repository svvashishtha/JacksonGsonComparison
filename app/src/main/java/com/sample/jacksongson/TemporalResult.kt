package com.sample.jacksongson

data class TemporalResult(var totalTime: Long, var averageTime: LongArray = LongArray(10) ) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TemporalResult

        if (totalTime != other.totalTime) return false
        if (!averageTime.contentEquals(other.averageTime)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = totalTime.hashCode()
        result = 31 * result + averageTime.contentHashCode()
        return result
    }
}
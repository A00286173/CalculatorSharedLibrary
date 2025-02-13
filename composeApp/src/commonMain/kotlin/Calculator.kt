package com.example.calculator


import kotlin.math.pow

// Here Classes are public in default
class Calculator {

    // Add function: it takes two arguments as doubles and returns a double
    fun add(a: Double, b: Double): Double {
        return a + b
    }

    // Subtract function: it takes two arguments as doubles and returns a double
    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    // Divide function:  it takes two arguments as doubles and returns a double.
    fun divide(a: Double, b: Double): Double {
        return a / b
    }

    // Multiply function: it takes two argument as doubles and return a double.
    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    // Square function: takes two doubles and returns a double.
    fun square(a: Double, b: Double): Double {
        return a.pow(b)
    }
}

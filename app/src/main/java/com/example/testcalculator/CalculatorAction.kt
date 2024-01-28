package com.example.testcalculator

sealed class CalculatorAction {
    data class Number(val number: Int): CalculatorAction()
    object Delete: CalculatorAction()
    object Clear: CalculatorAction()
    object Decimal: CalculatorAction()
    object Calculate: CalculatorAction()
    data class Operation(val operation: CalculatorOperation): CalculatorAction()

}

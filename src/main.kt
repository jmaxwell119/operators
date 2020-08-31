fun main(){
    // declare variables a and b as int
    val a = 17
    val b = 13

    // arithmetic operators
    val myAddition = a + b
    println("17 + 13 = $myAddition")
    val mySubtraction = a - b
    println("17 - 13 = $mySubtraction")
    val myMultiplication = a * b
    println("17 * 13 = $myMultiplication")
    val myDivision = a / b
    println("17 / 13 = $myDivision")
    val myModulus = a % b
    println("17 % 13 = $myModulus")

    // comparison
    val myCompare = a == b
    println("$a is equal to $b: $myCompare")
    val myGreater = a > b
    println("$a is greater than $b: $myGreater")
    val myLess = a < b
    println("$a is less than $b: $myLess")
    val myGreaterEquals = a >= b
    println("$a is greater than or equal to $b: $myGreaterEquals")
    val myLessEquals = a <= b
    println("$a is less than or equal to $b: $myLessEquals")
    val myNot = a != b
    println("$a is not equal to $b: $myNot")

    // assignment
    var assignmentPlus = 23
    print("$assignmentPlus += 11: ")
    assignmentPlus += 11
    println("$assignmentPlus")
    var assignmentMinus = 23
    print("$assignmentMinus -= 11: ")
    assignmentMinus -= 11
    println("$assignmentMinus")
    var assignmentTimes = 23
    print("$assignmentTimes *= 11: ")
    assignmentTimes *= 11
    println("$assignmentTimes")
    var assignmentDivided = 23
    print("$assignmentDivided /= 11: ")
    assignmentDivided /= 11
    println("$assignmentDivided")
    var assignmentModulus = 23
    print("$assignmentModulus %= 11: ")
    assignmentModulus %= 11
    println("$assignmentModulus")

    // increment and decrement
    var increment = 37
    print("$increment ++: ")
    increment ++
    println("$increment")
    var decrement = 37
    print("$decrement --: ")
    decrement --
    print("$decrement")
}
package com.example;
public class Operatory {

    public static void main(String[] args) {

        ArithmeticOperators arithmetic = new ArithmeticOperators();
        UnaryOperators unary = new UnaryOperators();
        IncrementDecrementOperators incDec = new IncrementDecrementOperators();
        RelationalOperators relational = new RelationalOperators();
        LogicalOperators logical = new LogicalOperators();
        BitwiseOperators bitwise = new BitwiseOperators();
        ShiftOperators shift = new ShiftOperators();
        AssignmentOperators assignment = new AssignmentOperators();
        ConditionalOperator conditional = new ConditionalOperator();
        TypeOperators type = new TypeOperators();
        ObjectAccessOperators objectOps = new ObjectAccessOperators();

        System.out.println("=== 3. Arithmetic Operators ===");
        System.out.println("3.1 Addition int: " + arithmetic.additionInt(7, 5));
        System.out.println("3.1 Addition double: " + arithmetic.additionDouble(2.5, 1.5));
        System.out.println("3.1 Addition String: " + arithmetic.additionString("Tech", "Corp"));

        System.out.println("3.2 Subtraction int: " + arithmetic.subtractionInt(10, 4));
        System.out.println("3.2 Subtraction double: " + arithmetic.subtractionDouble(100.0, 35.5));

        System.out.println("3.3 Multiplication int: " + arithmetic.multiplicationInt(3, 4));
        System.out.println("3.3 Multiplication double: " + arithmetic.multiplicationDouble(2.5, 3));

        System.out.println("3.4 Division int: " + arithmetic.divisionInt(7, 2));
        System.out.println("3.4 Division double: " + arithmetic.divisionDouble(7.0, 2));

        System.out.println("3.5 Remainder: " + arithmetic.remainder(7, 2));

        System.out.println("\n=== 4. Unary Operators ===");
        System.out.println("4.1 Unary plus: " + unary.unaryPlus(5));
        System.out.println("4.2 Unary minus: " + unary.unaryMinus(5));
        System.out.println("4.3 Logical negation: " + unary.logicalNegation(false));
        System.out.println("4.4 Bitwise complement: " + unary.bitwiseComplement(5));

        System.out.println("\n=== 5. Increment and Decrement Operators ===");
        System.out.println("5.1 Prefix increment: " + incDec.prefixIncrement(5));
        System.out.println("5.1 Postfix increment: " + incDec.postfixIncrement(5));
        incDec.incrementExamples();

        System.out.println("5.2 Prefix decrement: " + incDec.prefixDecrement(5));
        System.out.println("5.2 Postfix decrement: " + incDec.postfixDecrement(5));
        incDec.decrementExamples();

        System.out.println("\n=== 6. Relational Operators ===");
        System.out.println("6.1 == Equal To: " + relational.equalTo(5, 5));
        System.out.println("6.2 != Not Equal To: " + relational.notEqualTo(5, 3));
        System.out.println("6.3 > Greater Than: " + relational.greaterThan(10, 3));
        System.out.println("6.4 < Less Than: " + relational.lessThan(2, 9));
        System.out.println("6.5 >= Greater Than or Equal To: " + relational.greaterThanOrEqualTo(50, 50));
        System.out.println("6.6 <= Less Than or Equal To: " + relational.lessThanOrEqualTo(18, 18));

        System.out.println("\n=== 7. Logical Operators ===");
        System.out.println("7.1 && Conditional AND: " + logical.conditionalAnd(true, false));
        System.out.println("7.2 || Conditional OR: " + logical.conditionalOr(false, true));
        System.out.println("7.3 ! Logical NOT: " + logical.logicalNot(false));
        System.out.println("7.4 & with booleans: " + logical.logicalAndNoShortCircuit(true, false));
        System.out.println("7.4 | with booleans: " + logical.logicalOrNoShortCircuit(true, false));
        System.out.println("7.4 ^ with booleans: " + logical.logicalXor(true, false));

        System.out.println("\n=== 8. Bitwise Operators ===");
        System.out.println("8.1 & Bitwise AND: " + bitwise.bitwiseAnd(6, 3));
        System.out.println("8.2 | Bitwise OR: " + bitwise.bitwiseOr(6, 3));
        System.out.println("8.3 ^ Bitwise XOR: " + bitwise.bitwiseXor(6, 3));
        System.out.println("8.4 ~ Bitwise Complement: " + bitwise.bitwiseComplement(5));

        System.out.println("\n=== 9. Shift Operators ===");
        System.out.println("9.1 << Left Shift: " + shift.leftShift(3, 1));
        System.out.println("9.2 >> Signed Right Shift: " + shift.signedRightShift(8, 1));
        System.out.println("9.3 >>> Unsigned Right Shift: " + shift.unsignedRightShift(8, 1));

        System.out.println("\n=== 10. Assignment Operators ===");
        System.out.println("10.2 += : " + assignment.addAssign(10, 5));
        System.out.println("10.2 -= : " + assignment.subtractAssign(10, 2));
        System.out.println("10.2 *= : " + assignment.multiplyAssign(10, 3));
        System.out.println("10.2 /= : " + assignment.divideAssign(10, 2));
        System.out.println("10.2 %= : " + assignment.remainderAssign(10, 3));
        System.out.println("10.2 &= : " + assignment.andAssign(10, 1));
        System.out.println("10.2 |= : " + assignment.orAssign(10, 1));
        System.out.println("10.2 ^= : " + assignment.xorAssign(10, 1));
        System.out.println("10.2 <<= : " + assignment.leftShiftAssign(10, 1));
        System.out.println("10.2 >>= : " + assignment.rightShiftAssign(10, 1));
        System.out.println("10.2 >>>= : " + assignment.unsignedRightShiftAssign(10, 1));

        System.out.println("\n=== 11. Conditional (Ternary) Operator ===");
        System.out.println("11. max(a, b): " + conditional.max(10, 20));
        System.out.println("11. evenOrOdd(7): " + conditional.evenOrOdd(7));

        System.out.println("\n=== 12. Type Comparison Operator ===");
        Developer developer = new Developer("Anna", 8, 7000);
        System.out.println("12.1 instanceof: " + type.checkInstanceOf(developer));
        System.out.println("13. Cast double -> int: " + type.castDoubleToInt(9.7));

        System.out.println("\n=== 14. Object-Related and Access Operators ===");
        System.out.println("14.1 new: " + objectOps.createObjectAndUseNew());
        System.out.println("14.2 . Member access: " + objectOps.memberAccess());
        System.out.println("14.3 [] Array access: " + objectOps.arrayAccess());
        System.out.println("14.4 () Grouping: " + objectOps.parenthesesGrouping());
    }
}
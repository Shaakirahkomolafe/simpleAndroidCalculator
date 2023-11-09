package com.example.assignment1;


public class Calculator {
    String currentInput = "";
    char operator;

    boolean numError, calculationDone, operatorAbsent, operatorPresent, numberFound;
    int secondNumber = 0 , firstNumber = 0, result = 0;
    public void push(String value) {

        currentInput += value;
    }


    int calculate() {
        char[] chars = currentInput.toCharArray();
        numError = false;
        calculationDone = false;
        operatorAbsent = false;
        operatorPresent = false;
        numberFound = false;

        for (int i = 0; i < chars.length && !numError; i+= 2) {
            if (!Character.isDigit(chars[i]) || Character.isDigit(chars[i + 1])) {
                numError = true;
            }
        }


        for (int i = 0; i < chars.length && !numError; i++) {
            switch (chars[i]) {
                case '+':
                case '-':
                case '*':
                case '/':
                    operatorPresent = true;
                    operator = chars[i];
                case '=':
                    if (i != 1) calculationDone = true;
                    break;
                default:
                    break;

            }
            if (operatorPresent && i > 0) {
                if (!numberFound) {
                    if (Character.isDigit(chars[i - 1]))
                        firstNumber = Integer.parseInt(String.valueOf(chars[i - 1]));
                    else
                        numError = true;
                }
                    if (Character.isDigit(chars[i+1]))
                        secondNumber = Integer.parseInt(String.valueOf(chars[i+1]));
                    else
                        numError = true;

                    if (!numError) {
                        switch (operator) {
                            case '+':
                                result = firstNumber + secondNumber;
                                break;
                            case '-':
                                result = firstNumber - secondNumber;
                                break;
                            case '*':
                                result = firstNumber * secondNumber;
                                break;
                            case '/':
                                result = firstNumber / secondNumber;
                                break;
                            default:
                                operatorAbsent = true;
                                break;

                        }

                        firstNumber = result;

                        numberFound= true;
                        operatorPresent = false;
                    }
                }
            }
            if (numError || operatorAbsent)
                return -1;
            else
                return result;

        }

    }

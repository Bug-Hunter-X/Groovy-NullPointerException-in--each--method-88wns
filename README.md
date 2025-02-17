# Groovy NullPointerException in 'each' method

This repository demonstrates a common Groovy error: a `NullPointerException` occurring when the `each` method is called on a null list.  The example shows how this error arises and provides a solution for handling null lists gracefully.

## Bug

The `bug.groovy` file contains a simple Groovy method `myMethod` that iterates through a list of strings using the `each` method.  The issue arises when a null list is passed to the method.  This results in a `NullPointerException`.

## Solution

The `bugSolution.groovy` file demonstrates a robust solution using the `safe` operator (`?.`) to safely handle a potentially null list.  If the list is null, the `each` method is not called, preventing the exception.
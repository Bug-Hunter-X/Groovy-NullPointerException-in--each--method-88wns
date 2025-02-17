```groovy
def myMethod(List<String> list) {
  list?.each { item ->
    println item
  }
}

myMethod(null) // This will not throw an exception
myMethod(['a', 'b', 'c']) // This will work as expected
```
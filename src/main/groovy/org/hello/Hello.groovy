package org.hello

class Hello {
  def getHello() {
    "Hello, groovy!!"
  }

  static main(args) {
    println new Hello().hello
  }
}
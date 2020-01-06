package org.hello

class HelloTest extends GroovyTestCase {
  void 'test Hello should return "Hello, groovy"' () {
    assert new Hello().hello == "Hello, groovy!!"
  }
}
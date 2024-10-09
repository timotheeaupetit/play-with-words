package org.perso

import org.scalatest.funspec.AnyFunSpec

class VocabularyTest extends AnyFunSpec {
  describe("Vocabulary mapReduce") {
    it("should count word occurrences") {
      val text = "Hello world, hello sunshine"
      val result = Vocabulary.mapReduce(text)
      
      assert(result.contains("hello"))
      assert(result.contains("sunshine"))
      assert(result.contains("world"))
      assert(result.get("hello").contains(2))
      assert(result.get("world").contains(1))
      assert(!result.keySet.contains("beaver"))
    }
  }
}

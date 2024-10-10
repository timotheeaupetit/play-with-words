package org.perso

import org.scalatest.funspec.AnyFunSpec

class LettersTest extends AnyFunSpec {
  describe("isAnagram") {
    it("should return true when a word contains all the letters of the other word") {
      val word1 = "tsar"
      val word2 = "star"

      assert(Letters.isAnagram(word1, word2))
      assert(Letters.isAnagram(word2, word1))
    }

    it("should return false when a word does not contain all the letters of the other word") {
      val word1 = "scar"
      val word2 = "car"

      assert(!Letters.isAnagram(word1, word2))
      assert(!Letters.isAnagram(word2, word1))
    }
  }

  describe("isPangram") {
    it("should return true when the sentence contains all the letters of the alphabet") {
      val sentence = "Portez ce vieux whisky au juge blond qui fume"
      assert(Letters.isPangram(sentence))
    }

    it("should return false when the sentence does not contain all the letters of the alphabet") {
      val sentence = "Salut la compagnie"
      assert(!Letters.isPangram(sentence))
    }
  }
}

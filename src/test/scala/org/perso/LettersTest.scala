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

  describe("isPalindrome") {
    it("should return true when a word with an odd number of letters is a palindrome") {
      val word = "kayak"
      assert(Letters.isPalindrome(word), s"$word is a palindrome (odd number of letters)")
    }

    it("should return true when a word with an even number of letters is a palindrome") {
      val word = "serres"
      assert(Letters.isPalindrome(word), s"$word is a palindrome (even number of letters)")
    }

    it("should return true when a word is a palindrome written in proper case") {
      val word = "Abba"
      assert(Letters.isPalindrome(word), s"$word in proper case is a palindrome")
    }

    it("should return false when a word is not a palindrome") {
      val word = "palindrome"
      assert(!Letters.isPalindrome(word), s"$word is not a palindrome")
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

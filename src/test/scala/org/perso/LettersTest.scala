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

    it("should return true when a sentence is a palindrome, regardless of special characters") {
      val sentence1 = "Ainsi Anaïs nia"
      val sentence2 = "Engage le jeu, que je le gagne !"
      val sentence3 = "N'a-t-elle pas ôté cet os à Pelletan ?"
      val sentence4 = "L'âme sûre ruse mal"
      val sentence5 = "Léon a rasé César à Noël"
      assert(Letters.isPalindrome(sentence1), s"\"$sentence1\" is a palindrome")
      assert(Letters.isPalindrome(sentence2), s"\"$sentence2\" is a palindrome")
      assert(Letters.isPalindrome(sentence3), s"\"$sentence3\" is a palindrome")
      assert(Letters.isPalindrome(sentence4), s"\"$sentence4\" is a palindrome")
      assert(Letters.isPalindrome(sentence5), s"\"$sentence5\" is a palindrome")
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

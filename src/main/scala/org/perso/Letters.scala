package org.perso


object Letters {

  private val alphabet = "abcdefghijklmnopqrstuvwxyz"

  def isAnagram(word1: String, word2: String): Boolean = {
    val letters1 = word1.toLowerCase
    val letters2 = word2.toLowerCase

    letters1.forall(letters2.contains) && letters2.forall(letters1.contains)
  }

  def isPalindrome(str: String): Boolean = {
    val letters = str
      .toLowerCase
      .replaceAll(" ", "")
      .replaceAll("['!?.,=;:-]", "")
      .replaceAll("[áâàåä]", "a")
      .replaceAll("[éêèë]", "e")
      .replaceAll("[íîìï]", "i")
      .replaceAll("[óôòö]", "o")
      .replaceAll("[úûùü]", "u")
      .replaceAll("ç", "c")
      .replaceAll("ñ", "n")

    val nb = letters.length / 2

    val left = letters.take(nb)
    val right = letters.takeRight(nb)

    left == right.reverse
  }

  def isPangram(sentence: String): Boolean = {
    val letters = sentence.toLowerCase()

    alphabet.forall(letters.contains)
  }
}

package org.perso


object Letters {

  private val alphabet = "abcdefghijklmnopqrstuvwxyz"

  def isPangram(sentence: String): Boolean = {
    val letters = sentence.toLowerCase()

    alphabet.forall(letters.contains)
  }
}

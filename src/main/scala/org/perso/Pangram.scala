package org.perso


object Pangram {

  private val alphabet = "abcdefghijklmnopqrstuvwxyz"

  def isPangram(sentence: String): Boolean = {
    val letters = sentence.toLowerCase()

    alphabet.forall(letters.contains)
  }
}

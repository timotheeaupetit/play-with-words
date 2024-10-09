package org.perso

import scala.annotation.tailrec

object Vocabulary {
  def mapReduce(text: String): Map[String, Int] = {
    val words = text.trim
      .toLowerCase
      .replaceAll("[.,-;:?!']", "")
      .split(" ")
      .toList

    @tailrec
    def loop(words: List[String], acc: Map[String, Int] = Map.empty): Map[String, Int] = words match {
      case Nil => acc
      case w :: tail => acc.get(w) match {
        case Some(x) => loop(tail, acc + (w -> (x + 1)))
        case _ => loop(tail, acc + (w -> 1))
      }
    }

    loop(words)
  }
}

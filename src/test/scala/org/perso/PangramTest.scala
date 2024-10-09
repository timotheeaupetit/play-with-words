package org.perso

import org.scalatest.funspec.AnyFunSpec

class PangramTest extends AnyFunSpec {
  describe("isPangram") {
    it("should return true when the sentence contains all the letters of the alphabet") {
      val sentence = "Portez ce vieux whisky au juge blond qui fume"
      assert(Pangram.isPangram(sentence))
    }

    it("should return false when the sentence does not contain all the letters of the alphabet") {
      val sentence = "Salut la compagnie"
      assert(!Pangram.isPangram(sentence))
    }
  }
}

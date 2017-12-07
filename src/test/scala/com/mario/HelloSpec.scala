package com.mario

import org.scalatest.{FunSpec, Matchers}

class HelloSpec extends FunSpec with Matchers {

  describe("example hierarchy") {

    it("should work") {
      Main.calculateSum("1111") shouldBe 4
      Main.calculateSum("1122") shouldBe 3
      Main.calculateSum("1133") shouldBe 4
      Main.calculateSum("911339") shouldBe 13
//      Main.not(true) shouldBe true
    }

  }

}

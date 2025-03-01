package fetch

import chisel3._
import org.scalatest._
import chiseltest._

class HexTest extends FlatSpec with ChiselScalatestTester {
  "mycpu" should "work through hex" in {
    test(new Top) { c =>
      // while (!c.io.exit.peek().litToBoolean){
      for (n <- 0 to 4){
        println(n);
        c.clock.step(1)
      }
    }
  }
}
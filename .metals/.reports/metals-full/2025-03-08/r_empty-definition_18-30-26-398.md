error id: riscvtests/`<import>`.
file://<WORKSPACE>/chisel-template/src/test/scala/RiscvTests.scala
empty definition using pc, found symbol in pc: riscvtests/`<import>`.
empty definition using semanticdb
|empty definition using fallback
non-local guesses:
	 -

Document text:

```scala
package riscvtests

import org.scalatest._
import chiseltest._
import chisel3._

class RiscvTest extends FlatSpec with ChiselScalatestTester {
  behavior of "mycpu"
  it should "work through hex" in {
    test(new fuckTop) { c =>
      while (!c.io.exit.peek().litToBoolean){
        c.clock.step(1)
      }
      c.io.gp.expect(1.U)
    }
  }
}
```

#### Short summary: 

empty definition using pc, found symbol in pc: riscvtests/`<import>`.
error id: fetch/`<import>`.
file://<WORKSPACE>/chisel-template/src/main/scala/01_fetch/Top.scala
empty definition using pc, found symbol in pc: fetch/`<import>`.
empty definition using semanticdb
|empty definition using fallback
non-local guesses:
	 -

Document text:

```scala
package fetch

import chisel3._

class Top extends Module {
  val io = IO(new Bundle {
    val exit = Output(Bool())
  })
  
  val core   = Module(new Core())
  val memory = Module(new Memory())
  core.io.imem <> memory.io.imem
  io.exit := core.io.exit
}


```

#### Short summary: 

empty definition using pc, found symbol in pc: fetch/`<import>`.
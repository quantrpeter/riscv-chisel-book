error id: `<none>`.
file://<WORKSPACE>/chisel-template/src/main/scala/01_fetch/Memory.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
|empty definition using fallback
non-local guesses:
	 -chisel3/UInt.
	 -chisel3/UInt#
	 -chisel3/UInt().
	 -chisel3/util/UInt.
	 -chisel3/util/UInt#
	 -chisel3/util/UInt().
	 -common/Consts.UInt.
	 -common/Consts.UInt#
	 -common/Consts.UInt().
	 -UInt.
	 -UInt#
	 -UInt().
	 -scala/Predef.UInt.
	 -scala/Predef.UInt#
	 -scala/Predef.UInt().

Document text:

```scala
package fetch

import chisel3._
import chisel3.util._
import chisel3.util.experimental.loadMemoryFromFile
import common.Consts._

class ImemPortIo extends Bundle {
  val addr = Input(UInt(WORD_LEN.W))
  val inst = Output(UInt(WORD_LEN.W))
}

class Memory extends Module {
  val io = IO(new Bundle {
    val imem = new ImemPortIo()
  })

  val mem = Mem(16384, UInt(8.W))
  loadMemoryFromFile(mem, "src/hex/fetch.hex")
  io.imem.inst := Cat(
    mem(io.imem.addr + 3.U(WORD_LEN.W)), 
    mem(io.imem.addr + 2.U(WORD_LEN.W)),
    mem(io.imem.addr + 1.U(WORD_LEN.W)),
    mem(io.imem.addr)
  )
}


```

#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.
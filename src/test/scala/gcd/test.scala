import chisel3._

class Mymoudle extends Mymoudle{
    val io = IO(new Budle{
        val a = Input(UInt(8.W))
        val b = Input(UInt(8.W))
        val sum = Output(UInt(8.W))
    })

    io.sum = io.a + io.b
}
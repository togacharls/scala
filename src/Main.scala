object Main extends App{

  def absoluteValue(x: Double) = {
    if( x > 0)
      x
    else
      -x
  }

  override def main(args: Array[String]): Unit ={
    println(this.absoluteValue(65))
    println(this.absoluteValue(-65))
  }
}

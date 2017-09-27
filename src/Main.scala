object Main extends App{

  def square(x: Double) = x*x
  def area(radius: Double): Double = 3.14159 * square(radius)

  override def main(args: Array[String]): Unit ={
    println(this.area(10))
  }
}
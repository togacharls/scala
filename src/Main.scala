object Main extends App{

  def factorial(n: Int): Integer ={
    if(n > 1)
      return (n * factorial(n-1))
    else
      return 1
  }

  override def main(args: Array[String]): Unit ={
    println (this.factorial(12))
    println (this.factorial(10))
    println (this.factorial(-1))
  }
}

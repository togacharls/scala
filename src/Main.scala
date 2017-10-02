object Main extends App{
  override def main(args: Array[String]): Unit ={
    val array = List("Pepino", "Banana", "Zanahoria", "Calabacín");
    var i = 0
    var item:String = ""
    for(item <- array){
      i = i + 1
      item match{
        case "Pepino" => println(s"${i} ${item}")
        case "Zanahoria" => println(s"${i} ${item}s")
        case "Banana" => println(s"No quedan ${item}s")
        case "Calabacín" => println(s"El ${item} esta muy rico")
      }
    }
  }
}

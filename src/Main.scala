object Main extends App{


  override def main(args: Array[String]): Unit ={
    var mapList = List(1, 2, 4, 10, 50);
    mapList.map(x => x*x)
    println(mapList)
  }
}

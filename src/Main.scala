object Main extends App{

  def whatMonth(month: Any): Any = {
    month match {
      case 1 | "1" => "Enero"
      case 2 | "2" => "Febrero"
      case 3 | "3" => "Marzo"
      case 4 | "4" => "Abril"
      case 5 | "5" => "Mayo"
      case 6 | "6" => "Junio"
      case 7 | "7" => "Julio"
      case 8 | "8" => "Agosto"
      case 9 | "9" => "Septiembre"
      case 10 | "10" => "Octubre"
      case 11 | "11" => "Noviembre"
      case 12 | "12" => "Diciembre"
      case "Enero" => 1
      case "Febrero" => 2
      case "Marzo" => 3
      case "Abril" => 4
      case "Mayo" => 5
      case "Junio" => 6
      case "Julio" => 7
      case "Agosto" => 8
      case "Septiembre" => 9
      case "Octubre" => 10
      case "Noviembre" => 11
      case "Diciembre" => 12
      case _ => "It's not a month"
    }
  }

  override def main(args: Array[String]): Unit ={
    println(this.whatMonth(12))
    println(this.whatMonth("6"))
    println(this.whatMonth("Enero"))
  }
}

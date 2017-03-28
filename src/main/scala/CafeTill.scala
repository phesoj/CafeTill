case class Food(name: String, temperature: String, price: BigDecimal)


object CafeTill {
  def totalBill(items: Seq[Food]) = items.map(_.price).sum
}


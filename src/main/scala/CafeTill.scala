case class Food(name: String, temperature: String, category: String, price: BigDecimal)

object CafeTill {
  val MaxServiceCharge = 20.00

  def totalBill(items: Seq[Food]) = {
    val subTotal = items.map(_.price).sum
    val rateToAdd = items.map(serviceChargeRate).max
    val rated = subTotal * rateToAdd

    val fee: BigDecimal = if (rated > MaxServiceCharge) MaxServiceCharge  else rated

      subTotal + fee
  }

  private def serviceChargeRate(item: Food):BigDecimal =
    if (item.category == "Food" && item.temperature == "Hot") .20
    else if (item.category == "Food") .10
    else .0
}




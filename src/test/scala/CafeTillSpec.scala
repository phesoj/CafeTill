import org.scalatest.FunSpec
import org.scalatest.Matchers._

class CafeTillSpec extends FunSpec {

  val Cola = Food("Cola", "Cold", "Drink", .50)
  val Coffee = Food("Coffee", "Hot", "Drink", 1.00)
  val CheeseSandwich = Food("Cheese Sandwich", "Cold","Food", 2.00)
  val SteakSandwich = Food("Steak Sandwich","Hot", "Food", 4.50)
  val veryExpensiveItem = Food("Lobster for 10", "Hot", "Food", 200)

  describe("the Cafe Till") {
    it("should work out the cost of the items purchased") {
      CafeTill.totalBill(Seq(Cola, Coffee)) shouldEqual 1.5
    }

    it("should add service charge of 10% when food is included") {
      CafeTill.totalBill(Seq(Cola, Coffee, CheeseSandwich)) shouldEqual 3.85
    }

    it("should add service charge of 20% when Hot food is included") {
      CafeTill.totalBill(Seq(SteakSandwich)) shouldEqual 5.40
      CafeTill.totalBill(Seq(Coffee)) shouldEqual 1.00
    }

    it("should add service charge of no more than £20") {
      CafeTill.totalBill(Seq(veryExpensiveItem)) shouldEqual 220
    }

  }
}
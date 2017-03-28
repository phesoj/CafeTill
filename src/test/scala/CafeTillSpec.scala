import org.scalatest.FunSpec
import org.scalatest.Matchers._

class CafeTillSpec extends FunSpec {

  val Cola = Food("Cola", "Cold", .50)
  val Coffee = Food("Coffee", "Hot", 1.00)
  val CheeseSandwich = Food("Cheese Sandwich", "Cold", 2.00)
  val SteakSandwich = Food("Steak Sandwich", "Hot", 4.50)

  describe("the Cafe Till") {
    it("should work out the cost of the items purchased") {
      CafeTill.totalBill(Seq(Cola, Coffee, CheeseSandwich)) shouldEqual 3.5
    }
  }

}
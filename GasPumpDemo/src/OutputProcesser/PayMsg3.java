/*
 * PayMessage class for GasPump-3
 */
package OutputProcesser;

public class PayMsg3 extends PayMsg {

	@Override
	/* Give Payment method available for Gaspump3
	 * (non-Javadoc)
	 * @see OutputProcesser.PayMsg#paymsg()
	 */
	public void payMsg() {
		System.out.println("Please Pay by Cash");
	}
}

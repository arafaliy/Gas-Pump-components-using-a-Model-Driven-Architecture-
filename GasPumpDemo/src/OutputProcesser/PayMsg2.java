/*
 * PayMessage class for GasPump-2
 */
package OutputProcesser;

public class PayMsg2 extends PayMsg {

	@Override
	/*Give Payment method available for Gaspump2
	 * (non-Javadoc)
	 * @see OutputProcesser.PayMsg#paymsg()
	 */
	public void payMsg() {
		System.out.println("Please Pay by Credit");
	}
}

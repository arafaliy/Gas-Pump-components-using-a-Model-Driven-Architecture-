/*
 * PayMessage class for GasPump-1
 */
package OutputProcesser;

public class PayMsg1 extends PayMsg {

	@Override
	/*Give Payment method available for Gaspump1
	 * (non-Javadoc)
	 * @see OutputProcesser.PayMsg#paymsg()
	 */
	public void payMsg() {
		System.out.println("\n Select Payment :\n 7.Cash \n 3.Credit:");
	}
}

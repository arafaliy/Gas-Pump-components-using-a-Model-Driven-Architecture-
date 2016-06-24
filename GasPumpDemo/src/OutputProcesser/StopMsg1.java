/*
 * StopPump Message class for All GasPumps
 */
package OutputProcesser;

public class StopMsg1 extends StopMsg {

	@Override
	/* Stop message given during StopPump
	 * (non-Javadoc)
	 * @see OutputProcesser.StopMsg#stopmsg()
	 */
	public void stopMsg() {
		System.out.printf("\n Pump is Stopped ");
	}
}

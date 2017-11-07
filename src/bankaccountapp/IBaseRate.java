/**
 * 
 */
package bankaccountapp;

/**
 * @author kishor
 *
 */
public interface IBaseRate {
	// write method which returns base rates
	default double getBaseRate() {
		return 2.5;
	}
}

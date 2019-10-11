// Citation: Starter Code from https://github.com/jjfiv/CSC212ADTR

package edu.smith.cs.csc212.adtr.errors;
/**
 * This class defines our own special error for when an operation is called on
 * an list that doesn't have that index.
 * 
 * @author jfoley
 *
 */
@SuppressWarnings("serial")
public class BadIndexError extends RuntimeException {
	public BadIndexError(int index) {
		super("BadIndexError at "+index);
	}
}

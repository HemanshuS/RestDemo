/**
 * 
 */
package org.himanshu.rest.Exception;

/**
 * @author Himanshu
 *
 */
public class Message {
	
	private String message;
	private String errCode;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public Message(String message, String errCode) {
		this.message = message;
		this.errCode = errCode;
	}

	public Message() {
	}

}

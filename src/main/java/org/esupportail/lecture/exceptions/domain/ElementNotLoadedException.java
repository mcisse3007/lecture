/**
* ESUP-Portail Lecture - Copyright (c) 2006 ESUP-Portail consortium
* For any information please refer to http://esup-helpdesk.sourceforge.net
* You may obtain a copy of the licence at http://www.esup-portail.org/license/
*/
package org.esupportail.lecture.exceptions.domain;

/**
 * The element is not loaded in its profile
 * (it can be a category, a source)
 * @author gbouteil
 */
public class ElementNotLoadedException extends InfoDomainException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param string
	 */
	public ElementNotLoadedException(String string) {
		super(string);
	}
	/**
	 * @param e
	 */
	public ElementNotLoadedException(Exception e) {
		super(e);
	}
	/**
	 * @param string
	 * @param e
	 */
	public ElementNotLoadedException(String string,Exception e) {
		super(string,e);
	}


}

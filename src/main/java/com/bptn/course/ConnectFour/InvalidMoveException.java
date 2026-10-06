package com.bptn.course.ConnectFour;

public class InvalidMoveException extends ArrayIndexOutOfBoundsException {

	public InvalidMoveException(String errMessage) {
        super(errMessage);
    }

}

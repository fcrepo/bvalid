package net.sf.bvalid;

public class ValidatorException extends Exception {

    public ValidatorException(String msg) {
        super(msg);
    }

    public ValidatorException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
package ru.rosbank.javaschool.exception;

public class DataSaveException extends RuntimeException{

    public DataSaveException(String s) {

    }

    public DataSaveException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}

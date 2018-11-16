package com.company.future.support;

import java.lang.*;


class TypeMismatchError extends Exception{
    TypeMismatchError(String typeA, String typeB, String operation){
        super(typeA + " type and " + typeB + " type cannot be operated with '" + operation + "'.");
    }
}

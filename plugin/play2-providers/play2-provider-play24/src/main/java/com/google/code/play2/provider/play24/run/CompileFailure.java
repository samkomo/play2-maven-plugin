package com.google.code.play2.provider.play24.run;

public class CompileFailure
    implements CompileResult
{
    RuntimeException exception;

    public CompileFailure( RuntimeException exception )
    {
        this.exception = exception;
    }

}
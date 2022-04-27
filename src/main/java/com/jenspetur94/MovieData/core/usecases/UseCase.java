package com.jenspetur94.MovieData.core.usecases;

public abstract class UseCase<I extends  UseCase.InputValues, O extends  UseCase.OutputValues> {
    public abstract O execute(I input);

    public interface OutputValues {
    }

    public interface InputValues {
    }
}

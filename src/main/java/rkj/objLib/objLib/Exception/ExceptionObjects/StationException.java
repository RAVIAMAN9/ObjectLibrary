package rkj.objLib.objLib.Exception.ExceptionObjects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class StationException extends Exception{

    private String error;

    public StationException(String error) {
        super(error);
        this.error = error;
    }
}

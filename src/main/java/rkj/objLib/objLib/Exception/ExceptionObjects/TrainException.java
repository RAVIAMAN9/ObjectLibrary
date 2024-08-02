package rkj.objLib.objLib.Exception.ExceptionObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
@NoArgsConstructor
@Getter
@Setter
public class TrainException extends Exception{

    private String error;

    public TrainException(String error){
        super(error);
        this.error = error;
    }


}

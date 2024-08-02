package rkj.objLib.objLib.Exception.ExceptionHandlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import rkj.objLib.objLib.Exception.ExceptionObjects.StationException;
import rkj.objLib.objLib.Exception.ExceptionObjects.TrainException;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(TrainException.class)
    public ResponseEntity<String> handleTrainAlreadyExistException(TrainException error){
        return new ResponseEntity<>(error.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(StationException.class)
    public ResponseEntity<String> handleStationAlreadyExistException(StationException stationException){
        return new ResponseEntity<>(stationException.getMessage(),HttpStatus.BAD_REQUEST);
    }
}

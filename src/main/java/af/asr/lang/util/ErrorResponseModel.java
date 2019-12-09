package af.asr.lang.util;

import af.asr.lang.enums.ExceptionType;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
@AllArgsConstructor
public class ErrorResponseModel {

    private ExceptionType exceptionType;

    private String errorCode;

    private String errorMessage;

    private long time;

    private List<String> errorCause;
}

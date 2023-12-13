package chess;

import java.io.Serial;

public class ChessException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public ChessException(String msg) {
        super(msg);
    }

    public ChessException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public ChessException(Throwable cause) {
        super(cause);
    }

    public ChessException() {
    }

    public ChessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

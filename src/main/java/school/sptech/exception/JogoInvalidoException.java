package school.sptech.exception;

import school.sptech.Jogo;

public class JogoInvalidoException extends Exception {

    public JogoInvalidoException() {
    }

    public JogoInvalidoException(String jogo) {
        super("O jogo adicionado não pode ser nulo");
    }

    public JogoInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }

    public JogoInvalidoException(Throwable cause) {
        super(cause);
    }

    public JogoInvalidoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public JogoInvalidoException(Object o, Object o1, Jogo jogo) {
    }
}

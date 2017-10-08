package p1k.exception;

public class SocketException {
    public static class ConnectMqException extends RuntimeException{
        public ConnectMqException() {
            super();
        }

        public ConnectMqException(String message) {
            super(message);
        }
    }
    //
    public static class UnknownAction extends RuntimeException{
        public UnknownAction() {
            super();
        }

        public UnknownAction(String message) {
            super(message);
        }
    }
    //
    public static class SocketValidateException extends RuntimeException{
        public SocketValidateException() {
            super();
        }

        public SocketValidateException(String message) {
            super(message);
        }
    }
}

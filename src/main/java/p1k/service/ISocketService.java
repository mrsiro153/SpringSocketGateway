package p1k.service;

public interface ISocketService {
    void handleSendMessageToFrontEnd(String message);

    void handleSendMessageDirectToFrontEnd(String message);
}

package p1k.common;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import p1k.exception.SocketException;
import vn.ntex.bank.repository.common.constant.*;

@Component
public class ValidationRequest implements IValidationRequest {

    private Logger LOGGER = LogManager.getLogger(this.getClass());

    private Gson gson;

    @Autowired
    ValidationRequest(Gson gson) {
        this.gson = gson;
    }

    @Override
    public CommonResponse checkAuth(String json) {
        try {
            JsonObject result = new JsonParser().parse(json).getAsJsonObject();
            CommonResponse request = gson.fromJson(result, CommonResponse.class);
            if (request.getHeader().getSocketID() == null) {
                LOGGER.error("SOcket address is nullllllllll");
                throw new SocketException.SocketValidateException("Address is null");
            }
            return request;
        } catch (NullPointerException e) {
            e.printStackTrace();
            throw new SocketException.SocketValidateException("Json null cause by " + e.getMessage());
        } catch (JsonSyntaxException e) {
            throw new SocketException.SocketValidateException("Json syntax error " + e.getMessage());
        }
    }

    @Override
    public CommonResponse handleMessage(CommonResponse response) {
        try {
            PrefixResponseCode prefixCode = PrefixResponseCode.saveValue(response.getCode().toString().substring(0, 1));
            String message;
            Boolean kt = true;
            switch (prefixCode) {
                case SUCCESS_PREFIX:
                    message = CodeResponse.SuccessCode.getMessage(response.getCode());
                    break;
                case CLIENT_ERROR_PREFIX:
                    message = CodeResponse.ClientErrorCode.getMessage(response.getCode());
                    kt = false;
                    break;
                case UNKNOWN:
                default:
                    message = "Unknown";
                    break;
            }
            response.setMessage(message);
            return response;
        } catch (Exception e) {
            LOGGER.error("Unknown error {}", e.getMessage());
            throw new SocketException.SocketValidateException("Something was wrong");
        }
    }

}

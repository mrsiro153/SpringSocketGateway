package p1k.common;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import vn.ntex.bank.repository.common.constant.ResponseAction;
import vn.ntex.bank.repository.common.dto.HeaderInternalRequest;

import java.util.Map;

/**
 * Created by MILA on 5/8/2017.
 */
public class CommonResponse {
    private Integer code;
    private HeaderInternalRequest header;
    private JsonElement data;
    private String message;
    private JsonArray type;
    private Long time;
    private String collationId;

    public Integer getCode() {
        return code;
    }

    public CommonResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public HeaderInternalRequest getHeader() {
        return header;
    }

    public CommonResponse setType() {
        this.type = new JsonArray();
        if (String.valueOf(code).substring(0,1).equals("4")) {
            this.type.add(ResponseAction.ERROR.getCode());
        }
        for (Map.Entry<String,JsonElement> item: data.getAsJsonObject().entrySet()) {
            this.type.add(ResponseAction.saveValueOf(item.getKey()).getCode());
        }
        return this;
    }

    public Long getTime() {
        return time;
    }

    public CommonResponse setTime(Long time) {
        this.time = time;
        return this;
    }

    public String getCollationId() {
        return collationId;
    }

    public CommonResponse setCollationId(String collationId) {
        this.collationId = collationId;
        return this;
    }
}

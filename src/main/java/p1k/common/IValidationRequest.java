package p1k.common;

/**
 * Created by MILA on 3/2/2017.
 */
public interface IValidationRequest {

    CommonResponse checkAuth(String json);

    CommonResponse handleMessage(CommonResponse response);
}

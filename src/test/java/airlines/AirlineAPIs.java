package airlines;
import RestUtils.RestUtils;
import io.restassured.response.Response;
import java.util.HashMap;
import java.util.Map;

public class AirlineAPIs {

    public Response createAirline(Map<String,Object> createAirlinePayload){

        String endPoint = (String) Base.dataFromJsonFile.get("crateAirlineEndpoint");
        return RestUtils.performPost(endPoint,createAirlinePayload, new HashMap<>());



    }
}

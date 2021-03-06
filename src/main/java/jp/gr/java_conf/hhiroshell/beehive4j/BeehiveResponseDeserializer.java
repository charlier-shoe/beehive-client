package jp.gr.java_conf.hhiroshell.beehive4j;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

class BeehiveResponseDeserializer extends JsonDeserializer<BeehiveResponse> {

    @Override
    public BeehiveResponse deserialize(JsonParser jsonParser, DeserializationContext context)
            throws IOException {
        JsonNode jsonNode = jsonParser.getCodec().readTree(jsonParser);
        String beeType = null;
        if (jsonNode != null) {
            beeType = jsonNode.get("beeType").asText();
        }
        return new BeehiveResponse(beeType, jsonNode);
    }

}

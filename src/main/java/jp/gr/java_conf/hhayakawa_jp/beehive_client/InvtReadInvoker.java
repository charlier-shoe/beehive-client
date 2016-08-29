package jp.gr.java_conf.hhayakawa_jp.beehive_client;

import org.springframework.http.HttpMethod;

public final class InvtReadInvoker extends BeehiveInvoker<Object> {

    private static final String PATH = "invt";

    private static final HttpMethod METHOD = HttpMethod.GET;

    public InvtReadInvoker(String api_root, BeehiveCredential credential) {
        super(api_root, credential);
    }

    @Override
    String getApiPath() {
        return PATH;
    }

    @Override
    HttpMethod getHttpMethod() {
        return METHOD;
    }

}

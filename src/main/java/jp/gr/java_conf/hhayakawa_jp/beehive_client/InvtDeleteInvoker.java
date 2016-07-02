package jp.gr.java_conf.hhayakawa_jp.beehive_client;

import org.springframework.http.HttpMethod;

@SuppressWarnings("rawtypes")
public final class InvtDeleteInvoker extends BeehiveInvoker {

    private static final String PATH = "invt";

    private static final HttpMethod METHOD = HttpMethod.DELETE;

    public InvtDeleteInvoker(String api_root, BeehiveCredential credential) {
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

    @Override
    boolean isPrepared() {
        // TODO Auto-generated method stub
        return true;
    }

}
